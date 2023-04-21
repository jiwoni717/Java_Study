package com.sist.exam3;
// A => a, b, name, A(), print()
// 공유 => addr, display() => A가 마음대로 제어를 하지 못함
class A
{
	int a;
	int b;
	String name;
	static String addr;
	
	public A()
	{
		/*
		 *  int a;
		 *  int b;
		 *  String name;
		 *  static String addr;
		 *  print()
		 *  display()
		 */
		display();
		a = 10;
		b = 20;
		name = "hong";
		addr = "seoul";
	}
	public void print()
	{
		/*
		 *  int a;
		 *  int b;
		 *  String name;
		 *  static String addr;
		 *  print()
		 *  display()
		 */
	}
	public static void display()
	{
		/*
		 *  static String addr;
		 *  display()
		 *  static은 static만 사용 가능하다
		 */
		addr = "seoul";
		
		A aa = new A(); // 객체 생성 후에 사용
		aa.a = 10;
		aa.b = 20;
		aa.name = "shim";
		aa.print();
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
