package com.sist.util;
/*
 * 		라이브러리
 * 
 * 		● java.lang
 * 		 StringBuffer : 문자열이 많은 경우(제어)
 * 			└append() : 문자열 결합
 * 			└delete() : 문자 제거
 * 			└insert() : 문자열 추가
 * 		 String : 문자열을 쉽게 제어 가능하게 만든 클래스
 * 			└equals(), trim(), substring(), length(), valueOf(), contains()...
 * 		 
 * 		● java.util
 * 		 StringTokenizer : 문자열 분리
 * 			└counterToken() : 분리된 단어의 갯수
 * 			└hasMoreTokens() : 분리된 갯수만큼 루프를 돌릴 때
 * 			└nextToken() : 실제 분리된 데이터 읽기
 * 		 Wrapper : 데이터 기본형을 클래스화 시켜준 것(기능을 수행할 수 있게 만듦)
 * 			└parseXxx..()
 * 		 	└기본형과 호환됨(기본형에서 클래스 객체값을 받을 수 있다)
 * 		 Random
 * 			└nextInt(int bound);
 * 			 nextInt(10) => 0~9
 * 		 Arrays : 배열을 쉽게 관리
 * 			└sort() : 정렬
 * 			└toString() : 배열 출력
 * 			└asList() : List형 변환
 * 		 Date : 기능x 날짜 저장용으로 주로 사용한다, 다른 프로그램(오라클,MySQL...)과 호환 가능
 * 			↓ 보완
 * 		 Calendar : 날짜 설정
 * 			└set() : 년도/월/일/시간/분/초 저장 가능
 * 			└get() : 설정된 값을 가져옴
 * 			└get(Calendar.DAY_OF_WEEK) : 요일 읽기
 * 			└getActualMaximum() : 각 달의 마지막날
 * 	-------------------------------------------------------------------------------------------------------
 * 		배열을 대체하는 컬렉션
 * 		 데이터를 쉽게 관리 가능, 자동으로 공간이 설정된다
 * 		 Collection
 * 			└List
 * 				└ArrayList*
 * 				└Vector
 * 				└LinkedList
 * 					└Queue
 * 			└Set
 * 				└HashSet*
 * 				└TreeSet
 * 		  Map
 * 			└HashMap*
 * 			└HashTable
 */
import java.util.*; 
public class 라이브러리_Calendar {
	
	
	public static void main(String[] args) {
		//사용자로부터 년도/월 입력값을 받음 -> 예약/체크인,체크아웃
		Scanner scan = new Scanner(System.in);
		System.out.print("년도와 월을 입력하세요(ex 2023 4) : ");
		int year = scan.nextInt();
		int month = scan.nextInt();
		
		//1일자의 요일을 가지고 온다
		Calendar cal = Calendar.getInstance(); //newInstance(), getInstance() => 싱글턴
		// static => 클래스명.메소드명() / 클래스명 객체명 = new 생성자() => 클래스명과 생성자 이름이 다르면 추상클래스 or 상속 or 인터페이스
		// 클래스명 객체명 = 메소드() => 추상클래스
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		//요일 구하기
		int week = cal.get(Calendar.DAY_OF_WEEK)-1; //week는 1번부터 시작
		
		//입력 달의 마지막날
		int lastday = cal.getActualMaximum(Calendar.DATE);
		
		//달력 출력
		String[] strWeek = {"일","월","화","수","목","금","토"};
		System.out.println(year+"년 "+month+"월");
		System.out.println();
		for(String s : strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
		
		for(int i=1;i<=lastday;i++)
		{
			if(i==1) //앞줄 공백
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			//달력 출력
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) //일요일이면 다음줄에 출력~
			{
				week=0;
				System.out.println();
			}
		}
		
	}

}
