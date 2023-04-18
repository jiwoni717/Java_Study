package com.sist.main;
/*
 * 		1. 클래스 구성요소
 * 		class ClassName
 * 		{
 * 			-------------------------------------------------------------------------
 * 			변수(멤버변수)
 * 			1) 멤버변수(인스턴스변수)
 * 				[접근지정어] 데이터형 변수명; // 어디까지 사용이 가능한지 설정
 * 				=> new를 사용시마다 메모리가 따로 생성되는 변수
 * 				=> new를 이용해서 반드시 메모리를 만든 후 사용
 * 				=> 자동 초기화가 된다
 * 				   기본형
 * 				   참조형(배열, 클래스) => 메모리 주소를 참조해서 저장된 모든 데이터를 관리
 * 									  배열은 같은 크기의 데이터만 관리 / 클래스는 다른 크기도 가능
 * 									  초기화는 null(주소가 배정되지 않은 상태임)
 * 			2) 정적변수(공유변수) => 메모리 공간을 한개만 생성 => 모든 객체가 공유
 * 				[접근지정어] static 데이터형 변수명;
 * 				=> new를 사용하지 않아도 컴파일러에 의해 자동 생성
 * 			3) 변수 사용 방법
 * 				인스턴스변수
 * 					반드시 메모리에 저장
 * 					class A
 * 					{
 * 						int aa;
 * 					}
 * 					A a = new A();
 * 					a.aa = 100;
 * 					객체(인스턴스)를 통해서 접근해야된다
 * 				정적변수
 * 					class A
 * 					{
 * 						static int a;
 * 					}
 * 					메모리 할당을 하지 않아도 된다
 * 					A.a(클래스명으로 접근이 가능) => 클래스변수, 공유변수
 * 			보안 중심
 * 				1) 모든 멤버변수는 private 데이터를 은닉화
 * 			멤버변수 사용이 가능한 옵션 : static, final(상수)
 * 			------------------------------------------------------------------------
 * 			생성자
 * 				특징
 * 				1) 생성자는 클래스명과 동일
 * 				2) 생성자는 리턴형을 가지고 있지 않다
 * 				3) 오버로딩(중복메소드 중복) => 생성자는 필요시에는 여러개를 만들 수 있다
 * 				   ------> 같은 메소드명으로 여러개의 기능을 만들어 사용
 * 					= 메소드명이 동일
 * 					= 매개변수의 갯수나 데이터형이 다르다
 * 					= 한개의 클래스안에서 제작
 * 					= 리턴형은 관계없다
 * 					= 멤버변수의 초기화
 * 						1) 명시적 초기화
 * 						2) 초기화 블록 : 멤버변수, static 변수 초기화 가능
 * 						3) static 초기화 블록 : static 변수만 가능 (=> this 사용 불가)
 * 							class A
 * 							{
 * 								static int b;
 * 								static
 * 								{
 * 								}
 * 							}
 * 						4) 생성자 : 멤버변수, static 변수 초기화 가능 (=> this 사용 가능)
 * 							class A
 * 							{
 * 								int a;
 * 								A() {
 * 								}
 * 							}
 * 							인스턴스변수는 생성자를 주로 이용한다
 * 							static변수는 생성자보다는 static 블록
 * 			초기화 순서
 * 			명시적 초기화 => static 블록 => 초기화 블록 => 생성자
 * 			=> 초기화 (1. 윈도우, 2. 네트워크 연결, 3. 파일 읽기, 4. 데이터베이스)
 * 			=> 오버로딩을 지원
 * 			   ----- 생성자를 여러개 사용할 수 있다
 * 				A(int a){}
 * 				=> 다른 생성자를 호출 가능
 * 				   this() => 자신의 생성자 호출시 / 생성자 블록 첫줄에 사용이 가능
 * 
 * 				void display(int a, int b, int c)
 * 				void display(int a, double d, int c)
 * 				void display(int a, int b, float f)
 * 				void display(double a, double b, double c)
 * 				=> display(10.5,10,'C)
 * 
 * 			this() => 자신의 생성자 호출
 * 			this => 자신의 객체
 * 			----
 * 			구분자 => 지역변수와 멤버변수가 같은 경우에 구분
 * 				class A
 * 				{
 * 					int a;
 * 					void disp(int a)
 * 					{
 * 						a를 사용하면 매개변수 값만 사용 가능
 * 					}
 * 				}
 * 
 * 			==> 멤버메소드(static이 아닌 메소드)안에서는 모든 멤버변수, static변수, 메소드 사용이 가능
 * 			-------------------------------------------------------------------------
 * 			메소드 : 다른 클래스와 연결 담당(메세지)
 * 				   멤버변수에 대한 제어
 * 				   반복 제거, 재사용, 수정 가능
 * 						   ---------
 * 							한가지 기능만 수행이 되게 만든다
 * 				   메소드는 호출시에 처음부터 끝까지 수행 => 호출한 위치로 다시 돌아감
 * 			멤버메소드
 * 				[접근지정어] 리턴타입 메소드명(매개변수목록)
 * 			공유메소드
 * 				[접근지정어] static 리턴타입 메소드명(매개변수목록)
 * 				== static [접근지정어]...
 * 
 * 			메소드 호출
 * 			멤버메소드
 * 				클래스 객체명 = new 생성자();
 * 				객체명.메소드()
 * 			공유메소드
 * 				클래스명.메소드()
 * 			
 * 			-------------------------------------------------------------------------
 * 		}
 */
class C {
	int a = 10;
}
class B extends C{
	int a;
	void display(int a)
	{
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
class A
{
	int a = 10;
	static int b = 20;
	
	{
		System.out.println("인스턴스 초기화 블록(변경 전) a = "+a);
		a=100;
		System.out.println("인스턴스 초기화 블록(변경 후) a = "+a);
	}
	
	static {
		System.out.println("static 초기화 블록(변경 전) a = "+b);
		b=200;
		System.out.println("static 초기화 블록(변경 후) a = "+b);
	}
	
	A() {
		System.out.println("인스턴스 생성자(변경 전) a = "+a);
		a=1000;
		System.out.println("인스턴스 생성자(변경 후) a = "+a);
		System.out.println("static 생성자(변경 전) a = "+b);
		b=2000;
		System.out.println("static 생성자(변경 후) a = "+b);
	}
	
	
}
public class 클래스_구성요소 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println(aa.a+", "+A.b);
	}

}
