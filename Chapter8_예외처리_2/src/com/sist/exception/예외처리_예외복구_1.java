package com.sist.exception;
/*
 * 		p267 => try~catch(예외 복구)
 * 		
 * 		try : 정상실행하는 코딩
 * 		catch : 예외 발생시 복구하는 과정(여러개 사용 가능) => 순서 => 계층구조
 * 		
 * 		예외처리 : 소스상에서 수정이 가능한 가벼운 에러
 * 		------> 사전에 에러를 방지하는 프로그램
 * 				비정상 종료를 방지하고 정상 종료가 가능하게 만드는게 목적
 * 
 * 		예외처리의 계층구조
 * 		Object : 모든 클래스의 상위 클래스(모든 클래스는 Object의 상속을 받는다)
 * 			└Throwable : 에러의 최상위 클래스
 * 				┌Error : 처리가 불가능 => ex)메모리 부족, 스레드 충돌
 * 				│
 * 				└Exception : 처리가 가능 / 예외처리의 최상위 클래스
 * 					┌CheckedException : 컴파일시에 예외처리를 했는지 여부 확인 => 반드시 예외처리를 해야함
 * 					│	└IOException : 파일 입출력, 메모리 입출력, 네트워크 입출력 (java.io)
 * 					│	└SQLException : 오라클 연결(오라클이 인식하는 언어 : SQL) (java.sql)
 * 					│	└MalformedURLException : IP/Web URL (java.net)
 * 					│	└ClassNotFoundException : 클래스 이름으로 메모리 할당 => 클래스명, 패키지명 틀린 경우(리플렉션)
 * 					│	└InterruptedException : 스레드 충돌										  ------> 단점 : private까지 접근이 가능하다
 * 					│							-----> 한개의 프로세스 안에서 여러개 프로그램을 동시에 처리
 * 					│
 * 					└UncheckedException : 컴파일시에 예외처리를 확인하지 않음 => 필요시에만 예외처리
 * 						└RuntimeException : 실행시(인터프리터) => 사용자 입력, 프로그램 실수
 * 							└NumberFormatException : 숫자형식이 아닌 데이터를 숫자로 변경하려고 했을 때
 * 							└ArrayIndexOutOfBoundsException : 배열 범위 초과
 * 							└ArithmeticException : 0으로 나눌 경우
 * 							└NullPointException : 객체나 배열에 주소가 없는 경우
 * 							└ClassCastException : 클래스 형변환이 잘못된 경우
 * 		
 * 		예외처리 기본
 * 		try ~ catch
 * 		형식)
 * 			try
 * 			{
 * 				정상수행이 가능한 코딩
 * 			}catch(예외처리 종류 설정)
 * 			{
 * 				수행과정에서 오류시 처리되는 부분
 * 			}
 * 
 * 			┌소스 전체 처리 : 종료
 * 			└부분 처리 : 제외
 * 				
 */
public class 예외처리_예외복구_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i=1;i<=10;i++)
			{
				try //for문 밖에서 쓰면 10번 다 수행하지 못함
				{
					int j = (int)(Math.random()*3);
					int k = i/j;
					System.out.println("i = "+i+", k = "+k);
				}catch(Exception ex)
				{
					System.out.println("0으로 나눌 수 없습니다");
				}
			}
	
	}

}
