/*
 * 		객체지향 프로그램
 * 		1) 클래스의 구성요소 => 클래스(모델링)
 * 		2) 객체지향의 3대요소
 * 			캡슐화 : 데이터 보호(데이터 손실, 변경을 막음)
 * 				접근하는 범위(접근 지정어)
 * 			상속 / 포함 : 재사용
 * 			오버라이딩 / 오버로딩 = 다형성(수정, 추가 가능)
 * 		3) 클래스의 종류
 * 			추상 클래스 / 인터페이스***
 * 			내부 클래스
 * 			종단 클래스
 * 			공유 클래스
 * 		4) API : 자바에서 지원하는 클래스(라이브러리)
 * 			java.lang
 * 			java.util
 * 			java.io
 * 			java.net
 * 		5) 클래스 조립법 : 사용자 정의 + 라이브러리
 * 		------------------------------------------
 * 		
 * 		127page
 * 		
 * 		1.접근지정어의 종류
 * 		------------------------------------------------------------------------------------------
 * 			 (자신의)클래스내에서만 사용		같은 패키지에서 사용		 같은 패키지에서 사용			모든 클래스 접근
 * 															 상속을 받은 클래스는
 * 															 다른 패키지상에서 접근
 * 		------------------------------------------------------------------------------------------
 * 		private
 * 		= 은닉화			O						X					X					  X
 * 		(멤버변수)
 * 		------------------------------------------------------------------------------------------
 *		default			O						O					X					  X
 * 		------------------------------------------------------------------------------------------
 * 		protected		O						O					O					  X
 * 		------------------------------------------------------------------------------------------
 * 		public			O						O					O					  O
 * 		------------------------------------------------------------------------------------------
 * 
 * 			1) 변수 ==> private가 기본
 * 			2) 메소드 ==> 다른 클래스와 연결(통신수단) ==> public
 * 			3) 생성자 ==> public(다른 클래스에서 메모리 할당후에 사용)
 * 			4) 클래스 ==> public
 * 			5) 조립 : 모든 클래스가 연결(변수)
 * 			   변수는 private => 접근은 메소드를 통해서
 * 				변수를 다른 클래스나 자신의 클래스에서 사용
 * 				= 읽을 때 쓰는 메소드 : getter
 * 				= 쓸 때 쓰는 메소드 : setter	
 */
package com.sist.main;
class Student {
	// 한명의 학생에 대한 정보를 은닉화
	private int hakbun;
	private String name;
	private int kor, eng, math;
	
	// 변수 => 읽기/쓰기(기능) => 메소드
	/*
	 * 		1. 지역변수 
	 * 		2. 멤버변수
	 * 		--------- 저장위치가 다름 (=변수명이 동일할 수 있다)
	 * 		class Human
	 * 		{
	 * 			String name; // 멤버변수 => 다른 클래스에서도 사용 가능 => Heap
	 * 			public void setName(String name) // 매개변수
	 * 			{
	 * 				int a = 10; // 지역변수 => Stack
	 * 				==> 지역변수가 우선
	 * 				System.out.println(name)
	 * 					=> 지역변수와 멤버변수가 같은 경우 구분하기 위해서 this(클래스 자신)	
	 * 					=> this.name => Human이 가지고 있는 name변수
	 * 				변수명이 다른 경우
	 * 					1. 지역변수 => 멤버변수
	 * 			}
	 * 		}
	 */
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
public class 접근지정어_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1명의 학생 저장
		Student hong = new Student();
		hong.setHakbun(1);
		hong.setName("홍길동");
		hong.setKor(89);
		hong.setEng(90);
		hong.setMath(78);
		
		System.out.println(hong.getHakbun()+" "+hong.getName()+" "+hong.getKor()+" "+hong.getEng()+" "+hong.getMath());
		
		/*
		 * 		캡슐화를 사용하는 이유
		 * 		외부에서 잘못된 사용이나 변수에 대한 손상을 방지하기 위해서
		 * 		=> 캡슐화를 사용하기 위해서 만드는 방법 => 접근 지정어(private)
		 */
	}

}
