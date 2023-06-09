package com.sist.main;
/*
 * 		상속이 있는 경우 객체 생성 방법
 * 
 * 		class A
 * 		class B extends A
 * 
 * 		A a = new A();
 * 		A b = new B();
 * 		B c = new B();
 * 		B d = new A(); ==> 오류
 * 		
 * 		상속
 * 		1. 형식
 * 			class A extends B => 단일 상속만 가능
 * 		2. 클래스 크기
 * 			상속 내리는 클래스 > 상속 받는 클래스
 * 		3. 형변환
 * 			작은 클래스 = 큰 클래스
 * 		4. 자바의 최상위 클래스 Object
 * 		5. 상속의 예외 : static, 초기화 블럭, 생성자
 * 					  private는 상속은 가능하지만 접근 불가
 * 		------------------------------------------------
 * 		오버라이딩
 * 			1. 상속
 * 			2. 메소드명 동일
 * 			3. 매개변수 동일
 * 			4. 리턴형 동일
 * 			5. 접근지정어는 확장 가능
 * 		
 */
class Human {
	int a=10;
	int b=20;
	static int c=30;
	
	public void display()
	{
		System.out.println("Human:display() Call...");
	}
}
class Student extends Human{
	int d=40;
	int e=50;
	
	public void display()
	{
		System.out.println("Student:display() Call...");
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// 사용 범위 => 상위 클래스는 하위 클래스의 추가된 내용에 접근이 불가능하다
		// 변수 접근 => 선언된 클래스에 등록된 변수까지만 접근 가능
		/*
		 * 		클래스명과 생성자가 다른 경우
		 * 		1) 변수 제어 => 클래스 타입을 따라감(앞)
		 * 		2) 메소드 제어 => 생성자 타입을 따라감(뒤)
		 */
		Human h = new Human(); //a,b,c
		h.display();
		Student s = new Student(); //a,b,c,d,e
		s.display();
		Human h2 = new Student(); //(O) a,b,c
		h2.display();
		//Student s2 = (Student)new Human();
		Student s2 = (Student)h2; //(O) a,b,c,d,e 생성자가 동일해야 형변환이 가능하다
		//Student s3 = (Student)h; // ClassCastException => 형변환 오류
		s2.display(); // => h2의 생성자가 Student임
	}

}
