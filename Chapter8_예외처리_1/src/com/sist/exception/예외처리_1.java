package com.sist.exception;
/*
 * 		에러 => 컴파일(javac) / 실행시(java)
 * 			   ----------	 ----------
 * 				 Check		  UnCheck
 * 			Check : 자바문법(반드시 예외처리)
 * 			UnCheck : 생략
 * 
 * 		-수정이 불가능한 에러(심각한 오류) : 메모리 부족, 윈도우 덤프 => Error
 * 		-수정이 가능한 에러(가벼운 오류) : 소스상에서 수정이 가능 => Exception(예외처리)
 * 
 * 		에러가 발생할 수 있는 경우
 * 		1. 프로그래머의 실수
 * 			ex) 초기화값이 없는 상태에서 비교
 * 				배열 인덱스
 * 				무한 루프
 * 				파일명 오류...
 * 		2. 사용자 입력 오류
 * 			ex) 계산기 나누기 0 입력...
 * 			----------------------웹에서 유효성 검사
 * 
 * 		예외처리 목적 : 견고한 프로그램을 만들기 위해
 * 					 ㄴ비정상 종료 방지하고 정상상태 유지
 * 					 ㄴ사전에 에러를 방지하는 프로그램
 * 
 * 		1. 예외처리 방식
 * 			고려할 점 : if => 예외처리
 * 			예외처리 : 복잡한 에러, if문으로 해결할 수 없을 때
 * 			웹 : 404(파일이 없는 경우), 500(소스오류), 415(한글변환), 400(값을 잘못받는 경우), 403(접속 오류)...
 * 		2. 예외처리 종류
 * 			1) 예외 발생시 복구
 * 				try~catch
 * 				형식)
 * 					try
 * 					{
 * 						정상수행하는 문장
 * 						int a = 10;
 * 						int b = 0;
 * 						double d = a/(double)b; ==> catch로 이동
 * 						System.out.pringln(d); ==> 되돌아 오는 것이 아니기 때문에 수행하지 못함
 * 					}catch(NumberFormatException e)
 * 					{
 * 						예외발생시 처리하는 영역
 * 					}catch(ArrayIndexOutOfBoundsException e)
 * 					{
 * 					}catch(나누기..)
 * 					{}catch(Exception e)
 * 
 * 				사용자로부터 ①문자열을 받아서 정수 변경 후에
 * 				②배열에 저장
 * 				③나누기를 한 후에 출력
 * 			2) 예외 발생시 회피
 * 				throws
 * 			3) 예외 발생 => 테스트
 * 				throw
 * 			4) 사용자 정의 예외 => 지원하지 않는 예외가 존재하기 때문
 * 
 * 		예외처리의 계층구조
 * 				Object
 * 				   │
 * 			   Throwable
 * 				   │
 * 			┌─────────────┐
 * 		  Error		  Exception
 * 						  │
 * 				 ┌─────────────────┐
 * 		   CheckException	 UnCheckException (=> 실제 존재X)
 * 			 	 │반드시 예외처리	   │필요시에만 사용
 * 			IoException		 RuntimeException - NumberFormatException : 숫자 형식이 아닌 데이터를 숫자로 변경하려고 했을 때(문자열 => 정수형)
 * 												NullPointerException : 객체 초기화가 안된 상태(참조할 주소가 없는 경우)
 * 												ArrayIndexOfOutBoundsException : 배열 범위 초과
 * 												ArithmethicException : 0으로 나눌 경우
 * 												ClassCastException : 클래스 형변환이 틀린 경우
 * 										 		IllegalArgumentExceptio : 부적절한 인자 전달
 * 												IndexOutOfBoundsException : 문자열 관련
 * 			 ㄴ입출력=>메모리 입출력, 파일 입출력, 네트워크 입출력
 * 			  java.io => 클래스가 동일
 * 			SQLException
 * 			  java.sql => 네트워크 통신
 * 			  자바응용프로그램 <===============> 오라클
 * 				  (C)						(S)
 * 			  => 웹에 출력하는 모든 데이터 => 오라클
 * 			  => 자바 ================= 오라클
 * 						자바전송(X)
 * 				  오라클이 인식하는 언어전송(SQL)
 * 			ClassNotFountException(리플렉션)
 * 			 => 클래스명이 틀린 경우
 * 			...
 * 			MalformedURLException
 * 			 => URL주소가 틀린 경우
 * 			InterruptedException
 * 			 => 스레드 충돌
 * 
 * 		263p
 * 		예외의 의미 : 프로그램에서 의도하지 않은 상황에서 문제 발생시 처리를 어떻게 하는지?
 * 		
 */
class AAAAA
{
	public void display() {
		System.out.println("A:display() Call");
	}
}
class BBBBB
{
	
}
class CCCCC extends BBBBB
{
	// cc.disp('A', 10, 'B'); => 같지 않으면 가장 가까운값(근사값)을 출력한다 => 결과값 : 1
	public void disp(int a, int b, int c)
	{
		System.out.println("1");
	}
	public void disp(int a, char b, byte c)
	{
		System.out.println("2");
	}
	public void disp(char a, char b, int c)
	{
		System.out.println("3");
	}
}
public class 예외처리_1 {
	static String s; //null
	static AAAAA a; //null
	public static void main(String[] args) {
		
		String ss = "Hello Java!!";
		System.out.println(ss.substring(ss.indexOf("K"), ss.lastIndexOf("J")));
		
		CCCCC cc = new CCCCC();
		cc.disp('A', 10, 'B');
		System.out.printf("%d %c %s\n",10,65,"30");
		
		System.out.println(10/0);
		
		int[] arr = new int[2]; // 0,1
		arr[2] = 10;
		
		a.display();
		if(s.equals("Hello"))
		{
			System.out.println("OK");
		}
		
		int a = 10;
		int b = 0; // 사용자로부터 받은 값
		//처리
		if(b!=0) // 정상수행 ==> try
		{
			int c = a/b;
			System.out.println("c="+c);
		}
		else // 예외처리 ==> catch
		{
			System.out.println("0으로 나눌 수 없습니다!!");
		}
		// 1. 정상적으로 종료가 되게 만든다
		// 2. 우선적 => if문으로 처리가 가능한지? => 불가능하다면 자바에서 제공하는 예외처리 이용
		// 3. if문은 주로 검색용도, 사용자 입력 제한...
		
		String page = "1"; // →공백 있으면 오류
		System.out.println(Integer.parseInt(page));
		
		

	}

}
