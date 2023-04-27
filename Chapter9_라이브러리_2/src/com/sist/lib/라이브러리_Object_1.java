/*
 * 		1. 자바의 모든 클래스(라이브러리 클래스, 사용자 정의 클래스)는 Object의 상속을 받는다
 * 		2. 자바에서 지원하는 라이브러리
 * 			java.lang : 자바의 기본 클래스(가장 많이 사용되는 라이브러리), import를 생략한다
 * 			 -Object, String, StringBuffer, Wrapper, System, Thread
 * 			java.util : 유용하게 사용이 가능하게 만든 라이브러리
 * 			 -Scanner, StringTokenizer, 자료구조(데이터를 쉽게 관리)
 * 			 -Date/Calendar...
 * 			java.io : 입출력(메모리, 파일, 네트워크) => CheckedException
 * 			java.net : 네트워크 관련 라이브러리 => CheckedException
 * 			java.sql : 데이터베이스 연결
 * 			java.text : 변환(날짜 형식, 문자열 형식...)
 * 
 * 		자동처리
 * 		1) import java.lang.*
 * 		2) 메소드
 * 			void method()
 * 			{
 * 				return => 생략(자동추가)
 * 			}
 * 		3) 생성자
 * 			class A
 * 			{
 * 				public A(){}
 * 			}
 * 		4) 상속
 * 			class A extends Object
 * 		---------------------------------------------------------------------------------------------
 * 		java.lang에서 지원하는 클래스는 대부분이 final 클래스
 * 		=> 상속을 받아 확장이 불가능하다(있는 그대로 사용)
 * 
 * 		상속을 받아서 확장이 가능한 클래스 Object
 * 								-------->모든 데이터형을 받을 수 있다
 * 		데이터형을 여러개 사용시에는 라이브러리에서 리턴형 대부분이 Object
 * 		=> 형변환을 해야 사용 가능 => ex) (Integer)new Object()
 * 
 * 		Object의 주요 기능
 * 		-finalize() : 소멸자 함수
 * 		-toString() : 개체를 문자열로 변환
 * 		-clone() : 복제(메모리가 새롭게 생성) => prototype
 * 		-getClass() : 클래스 객체 읽기, 데이터형 확인
 * 		-equals() : 객체 비교
 * 
 * 		class A
 * 		 => super : Object
 * 		class B extends A
 * 		 => super : A
 * 		
 */

package com.sist.lib;

class Student {
	private int hakbun;
	private String name;
	
	public Student()
	{
		hakbun = 1; // this.은 생략이 가능 => 지역변수와 같은 이름일 때는 구분
		name = "홍길동";
		System.out.println("생성자 : 멤버변수에 대한 초기화");
	}
	
	public void print()
	{
		System.out.println("학번 : "+hakbun+", 이름 : "+name);
	}
	
	// 소멸자
	@Override
	protected void finalize() throws Throwable {
		System.out.println("객체 메모리 해제");
	}
	
	
}

public class 라이브러리_Object_1 {

	public static void main(String[] args) {
		// 객체 메모리 할당(메모리에 저장)
		Student s = new Student();
		
		// 객체 활용(메소드 호출, 변수 변경)
		s.print();
		
		// 객체 메모리 해제 => 자동 호출
		s = null; // => GC 대상이 됨
		System.gc();

	}

}
