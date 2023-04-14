/*
 * 		객체 114p
 * 		클래스 115p
 * 		인스턴스 117p
 * 		클래스의 구성요소 122p
 * 		객체 생성 123p
 * 		-----------------
 * 		패키지 132p
 * 		메소드 140 ~ 155p
 * 		생성자 166p
 * 		멤버변수의 초기화 168p
 * 		생성자 오버로딩 171p
 * 		생성자 this 173p
 * 			------> 클래스 자신의 객체명(static)
 * 
 * 		class A
 * 		{
 * 		}
 * 
 * 		A a = new A();
 * 		=> JVM(자바가상머신) => 메모리를 생성
 * 		   this = a;
 */

package com.sist.main;

public class 정리_3 {

	정리_3()
	{
		System.out.println("this = "+this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		정리_3 a = new 정리_3();
		System.out.println("a = "+a);
	}

}
