// 패키지 → import → 클래스 순서로 코딩할 것
package com.sist.main; // 한번만 씀
/* 	import com.sist.main.클래스구성요소_1; => 패키지가 다를 경우
 * 	import com.sist.main.* => 이 폴더 안에 있는 모든 클래스를 불러온다\
 * 
 * 	주의점 : 패키지명에 키워드 사용 불가 (대소문자 구분 => 소문자 권장)
 *   ㄴ키워드랑 똑같음..
 *   
 *   폴더 => 관련된 java파일 저장 => 찾기
 *   
 *   다른 패키지에서는 같은 이름의 클래스를 만들 수 있다.
 *   
 *   메소드
 *   	접근방식 : .을 이용
 *   	인스턴스 메소드 => static이 없는 메소드 => 메모리에 따로 저장
 *   	=> 클래스의 분리
 *   
 *   클래스
 *   	= 데이터형
 *   	= 액션(동작) => 메소드
 *   	------------------
 *   
 *   	1) 데이터형
 *   	2) 데이터 처리
 *   	3) 조립 => main => 컴퓨터의 메인보드
 *   
 *   	1. 메소드의 구성요소
 *   		리턴타입 메소드명(매개변수 -> 요청데이터) => 선언부
 *   	{
 *   		구현부
 *   		return 결과값(=>리턴타입과 데이터형 일치해야함)
 *   	}
 *   
 *   	리턴타입 : 사용자가 요청한 내용을 처리 후에 결과값의 데이터형
 *   		1) 결과값이 있는 경우
 *   		2) 결과값이 없는 경우 => void
 *   		리턴타입 / return 값은 항상 일치하진 않는다
 *   		-----	------
 *   		항상 리턴타입이 결과값보다 크거나 같다
 *   		3) 리턴타입이나 결과값은 1개만 나온다
 *   			** 여러개일 경우 : 배열, 클래스 이용
 *   		ex) int[] display()
 *   			{
 *   				int[] arr = new int[5];
 *   				return arr;
 *   			}
 *   		=> int[] arr = display() => 주소값이 같음
 *   		   int[] arr = new int[5]
 *   		   int[] arr2 = arr;
 *   
 *   	리턴형 : 기본형, 배열, 클래스(사용자 정의 데이터형)
 *   	return int => 10...
 *   		   배열 => 배열명(주소값)
 *   		   int[] arr = new int[5];
 *   		   return arr;
 *   		   클래스 => 객체명(주소값)
 *   		   A a = new A();
 *   		   return a;
 *   	매개변수 : 사용자 요청값
 *   	getView(int page)
 *   	findData(String s)
 *   	login(String id, String pwd)
 */
class Student {
	int hakbun;
	String name;
	String sex;
	int kor;
	int eng;
	int math;
}
class StudentSystem {
/*	int getHakbun()
	{
		return 1;
	}
	String getName()
	{
		return "홍길동";
	}
	String getSex()
	{
		return "남자";
	}
	int getKor()
	{
		return 90;
	}
	int getEng()
	{
		return 80;
	}
	int getMath()
	{
		return 78;
	} */
	Student getData()
	{
		Student s = new Student();
		s.hakbun = 2;
		s.name = "심청이";
		s.sex = "여자";
		s.kor = 90;
		s.eng = 90;
		s.math = 100;
		
		return s;
	}
}
public class 클래스구성요소_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student hong = new Student();
		StudentSystem ss = new StudentSystem();
		Student shim = ss.getData();
		
	}

}
