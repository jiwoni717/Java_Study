/*
 * 		기초		
 * 		 = 변수, 데이터형(정수 : int, byte, long / 실수 : double / boolean / char)
 * 		 = 연산자, 제어문
 * 		   -----단항연산자 (++, --, !, (type))
 * 				이항연산자 (산술, 비교, 논리, 대입)
 * 				삼항연산자
 * 				조건문 (단일 if, 선택 if~else, 다중 if~else if...)
 * 				반복문 (for, while)
 * 				반복제어문 (break)
 * 		 = 배열 : 1차 배열
 * 		 = 문자열 저장 => String
 * 		  			  -------
 * 					=====> javascript에서도 똑같이 씀
 * 					1) equals : 문자열 비교***
 * 					 boolean equals(String s)
 * 					2) startsWith : 시작 문자열
 * 					 boolean startsWith(String s)
 * 					 DB : WHERE name LIKE '홍%'
 * 					3) endsWith : 끝 문자열
 * 					 boolean endsWith(String s)
 * 					 DB : WHERE name LIKE '%홍'
 * 					4) contains : 포함***
 * 					 boolean contains(String s)
 * 					 DB : WHERE name LIKE '%홍%'
 * 					5) length : 문자 갯수
 * 					 int length()
 * 					6) indexOf : 문자, 문자열의 위치 (처음부터)
 * 					 int indexOf(char || String)
 * 					 => 문자열은 index번호가 0번부터 시작
 * 					 String s = "Hello Java";
 * 					 s.indexOf('a') / s.indexOf("a") => 7
 * 					7) lastIndexOf : 문자, 문자열의 위치 (뒤에서부터)
 * 					 int lastIndexOf(char || String)
 * 					 String s = "Hello Java";
 * 					 s.lastIndexOf('a') / s.lastIndexOf("a") => 9
 * 					8) trim() : 좌우의 공백 제거
 * 					 String trim()
 * 					9) valueOf : 모든 데이터형을 문자열로 변환
 * 					 static String valueOf(모든 데이터형) : String에서 유일하다
 * 					 String.valueOf(1)
 * 					 valueOf(1) => "1"
 * 					 윈도우 / 웹 => 모든 데이터형 문자열
 * 					10) replace() : 변환(문자열, 문자)
 * 					 String replace(char, char)
 * 					 String replace(String, String)
 * 					11) replaceAll : 변환(문자열)
 * 					 String replaceAll(String, String)
 * 									   ------- regexp => 정규식
 * 					 replaceAll("[가-힣]","")
 * 					 [A=Z] [a-z] [0-9]
 * 					12) substring() : 문자열을 자르는 경우
 * 					 String substring(int s)
 * 					 String s = "Hello Java"
 * 					 s.substring(6) -> Java
 * 					 String substring(int s, int e)
 * 					 s.substring s = "Hello Java"
 * 					 s.substring(0,5) => Hello
 * 								   --> -1 (마지막은 1개 제외)
 * 					
 * 		class : 설계 => 속성, 기능(=변수, 메소드)
 * 			웹 => 출력 내용(변수)
 * 			  => 메뉴, 버튼(기능)
 * 				-------------- 요구사항분석(설계)
 * 			추상화 : 설계(기능, 데이터) : 사물을 단순화
 * 			 ex)
 * 				사원 : 사번, 이름...
 * 					  출근한다, 퇴근한다, 근무한다...
 * 			----------------------------------
 * 			class 설계 ======> 메모리 저장 (인스턴스)
 * 					   new (클래스를 저장할 때는 new)
 * 					   ** Spring은 new를 사용하지 말라
 * 					   ** new없이 저장이 가능 => 리플렉션
 * 		1. 구성요소
 * 			class ClassName : 선언부
 * 			{
 * 				-----------------------------
 * 				변수(속성)
 * 				 멤버변수
 * 					= 인스턴스변수 => new 사용시마다 따로 메모리 생성
 * 					= 정적변수(static) => 한개의 공간만 생성 => 공유변수
 * 						=> 컴파일러에 의해서 자동 생성
 *  			-----------------------------
 *  			메소드(동작) : 기능
 *   			-----------------------------
 *   			생성자 : 멤버변수(인스턴스변수) 초기화
 *   				   메모리에 저장시 처음으로 호출되는 메소드
 *    			-----------------------------
 * 			}
 * 		2. 구성요소 사용법
 * 			1) 메모리에 저장
 * 			class A
 * 			{
 * 				변수 / 메소드
 * 			}
 * 			A a; 선언
 * 			a new A();
 * 
 * 			A a = new A();
 * 
 * 			class A
 * 			{
 * 				int sabun;
 * 				String name;
 * 				String getName(){}
 * 				int getSabun(){}
 * 				void run(){}
 * 			}
 * 			A a = new A();
 * 			a.sabun ==> 100이라는 주소에 있는 sabun의 값을 가지고 온다
 * 			 --> 메모리 주소 접근 연산자
 * 			a.getSabun(){}
 * 		3. 접근범위
 * 		4. 객체지향의 3대 요소
 * 		5. 클래스의 종류
 * 		6. 예외처리
 * 		-------------------------
 * 		API => 지정된 라이브러리 사용법
 * 
 * 		class A
 * 		{
 * 			int aa;
 * 		}
 * 		class B
 * 		{
 * 			A a = new A();
 * 		}
 * 		class C
 * 		{
 * 			B b = new B();
 * 		}
 * 		C c = new C();
 * 		c.b.a.aa;
 * 		
 */
class Student {
	int hakbun;
	String name;
}
public class 클래스의구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		// hong => hakbun, name
		hong.hakbun = 1;
		hong.name = "홍길동";
		Student shim = hong; // 같은 클래스면 대입 가능 => 같은 주소를 공유함
		shim.hakbun = 2;
		shim.name = "심청이";
		System.out.println(hong.hakbun);
		System.out.println(hong.name);
	}

}
