package com.sist.main;
/*
 * 		스프링
 * 		=> 가급적이면 상속 없이 독립적인 클래스(POJO)
 * 		=> new를 사용하지 않는다
 * 		----------------------------------------------------------
 * 		상속(is-a)
 * 		단점 : 실행 속도가 늦어짐 => 사용빈도가 극히 드물다 => 포함 클래스(has-a)
 * 		
 * 		상속
 * 		=> 기능(메소드)을 수정하거나 변수를 추가해서 사용
 * 		=> 상속을 받는 경우 상위 객체가 먼저 생성되어야 하기 때문에 속도가 늦어진다
 * 		=> 기존의 클래스 재사용, 수정, 추가 가능(=> 소스 코딩량을 줄일 수 있다)
 * 		=> 코드를 공통적으로 사용하기 때문에 관리가 편하다
 * 		
 * 		포함
 * 		=> 제공한 그대로 사용 => 오버라이딩이 가능(익명의 클래스)
 * 		
 */

class Super {
	int a, b;
	static int c;
	
	public Super() //생성자가 호출되면 메모리가 할당
	{
		System.out.println("Super클래스 메모리 할당");
	}
}
class Sub extends Super{
	int d, e;
	
	public Sub()
	{
		System.out.println("Sub클래스 메모리 할당");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sub sub = new Sub();
	}

}
