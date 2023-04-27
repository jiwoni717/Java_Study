package com.sist.lib;
/*
 * 		1. java.lang
 * 			Object : 모든 클래스의 상위 클래스(모든 클래스는 Object의 상속을 받는다)
 * 			 └toString() : 자주 사용이 된다, 객체를 문자열화 시킨다 => 오버라이딩
 * 			 └clone() : 객체 복제
 * 			 └finalize() : 소멸자 함수(호출되면 메모리 해제)
 * 			 └equals() : 객체 비교
 * 
 * 			String : 문자열 저장하고 관리하는 클래스
 * 			 └equals() : 문자열 비교(==은 주소값 비교)
 * 			 └startsWith : 시작 문자열이 같은 경우
 * 			 └endsWith : 끝나는 문자열이 같은 경우
 * 			 └contains : 포함된 문자열
 * 			 └replace : 문자나 문자열 변경
 * 			 └replaceAll : 문자나 문자열을 변경(정규식) => 문자열의 형태
 * 			 └trim : 좌우의 공백 제거
 * 			 └split : 특정 단어별로 나눠서 저장 => String[]
 * 			 └valueOf : 모든 데이터형을 문자열로 변경할 때
 * 			 └length : 문자 갯수
 * 			 └substring() : 문자열 자를 때
 * 
 * 			StringBuffer, StringBuilder...
 * 			Wrapper : 기본형을 클래스화
 * 			 └Byte, Integer, Double, Boolean, Float, Long...
 * 		 	System
 * 			Math
 * 			Thread
 * 			------------- java.lang은 import를 생략할 수 있다 -------------
 * 
 * 		2. java.util
 * 			Date / Calendar
 * 			StringTokenizer
 * 			Collection
 * 				┌List
 * 				│ └ArrayList**
 * 				│ └Queue LinkedList
 * 				│ └Vector
 * 				│ └Stack
 * 				├Map
 * 				│ └HashMap** / HashTable
 * 				└Set			
 * 				  └HashSet** / TreeSet
 * 
 * 		2-1. java.text
 * 		3. java.io
 * 		4. java.net
 * 		5. java.sql
 * 		------------------------- 기본 라이브러리
 * 		6. javax.xml
 * 		7. javax.servlet.http
 * 		8. 외부 라이브러리(업체에서 지원하는 것) => Open API
 * 		
 */
class A
{
	int a = 10;
	int b = 20;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "a = "+a+", b = "+b;
	}
	
}
public class 라이브러리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aa = new A();
		System.out.println(aa.toString());
		System.out.println(aa);
	}

}
