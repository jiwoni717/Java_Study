/*
 *  toString() : 객체를 문자열화 시킨다
 *   (String)
 *   .toStirng()
 *   
 *   class A
 *   {
 *   }
 *   A a = new A();
 *   1) 명시적 : System.out.println(a.toString()) => a의 주소값 출력
 *   2) 묵시적 : System.out.println(a)
 */
package com.sist.lib;

class Member {
	
	private int mno;
	private String name;
	
	public Member(int m, String n)
	{
		//변수명이 다르면 this. 안 써도 됨
		mno = m;
		name = n;
	}

	@Override
	public String toString() {
		return "회원번호 : "+mno+", 이름 : "+name;
	}
	
}
public class 라이브러리_Object_3 {

	public static void main(String[] args) {
		Member m1 = new Member(1, "박문수");
		Member m2 = new Member(2, "심청이");
		
		System.out.println("묵시적 호출 m1 : "+m1);
		System.out.println("명시적 호출 m1 : "+m1.toString());
		
		System.out.println("묵시적 호출 m2 : "+m2);
		System.out.println("명시적 호출 m2 : "+m2.toString());
	}

}
