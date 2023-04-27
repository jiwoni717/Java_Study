/*
 * 		305page
 * 		-String : 문자열을 조작하고 처리하는 기능
 * 				  String은 클래스임과 동시에 일반 데이터형으로 취급
 * 				  모든 클래스는 Call By Reference가 가능하나 String은 Call By Value만 가능하다
 * 					● Call By Reference
 * 						A a = new A()
 * 						A b = a; ==> 같은 주소를 제어
 * 					● Call By Value
 * 						String s = "Hello";
 * 						String s1 = s; ==> s1을 변경해도 s는 변경사항x
 * 				  메모리 할당
 * 					String s = "Hello";
 * 					String s = new String("Hello");
 * 				  문자열은 주소
 * 					ㄴ같은 문자열이면 같은 주소를 가지고 있다
 * 					ㄴnew를 이용해서 생성되면 다른 주소에 저장
 * 				  char[]를 쉽게 사용 가능하게 만들어준 클래스
 */
package com.sist.string;

public class 라이브러리_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Hello";
		// ↑ 같은 메모리 주소에 저장
		String s3 = new String("Hello");
		String s4 = new String("Hello");
		
		if(s1==s3)
			System.out.println("s1과 s3는 같다");
		else
			System.out.println("s1과 s3는 같지 않다");
		
		// 실제 저장된 데이터값이 같은지 확인
		if(s1.equals(s3))
		{
			System.out.println("s1과 s3는 같은 값을 가지고 있다");
		}
		else
			System.out.println("s1과 s3는 같은 값을 가지고 있지 않다");
		
		// 308page => 문자열 결합
		String ss = "Hello ";
		String ss1 = "Java!!";
		String ss2 = ss+ss1;
		System.out.println(ss2);

	}

}
