package com.sist.util;
/*
 * 		Calendar : Date클래스를 보완해서 새롭게 만든 클래스
 * 		 1) Calendar 생성
 * 			Calendar cal = Calendar.getInstance(); => 추상 클래스(new를 사용해서 선언x)
 * 		 2) 날짜 설정 : set()
 * 		 3) 날짜 읽기 : get()
 * 		 4) 각 달의 마지막 날 : getActualMaximum()
 * 		 5) 요일 읽기 : get()
 * 			
 */
import java.util.*;
public class 라이브러리_Calendar_1 {

	public static void main(String[] args) {
		// new를 사용하지 않는 경우 : 추상클래스(기능 o) / 인터페이스(기능 x)
		// List list = new ArrayList() => new 뒤에 다른 클래스 이름 => 인터페이스
		Calendar cal = Calendar.getInstance(); //필요한 경우에 오버라이딩 해서 사용
		// ↑ 오늘 날짜를 읽어옴
		
		System.out.println("년도 : "+cal.get(Calendar.YEAR));
		System.out.println("월 : "+(cal.get(Calendar.MONTH)+1)); //0부터 시작함
		System.out.println("일 : "+cal.get(Calendar.DATE));
		
		System.out.println("시간 : "+cal.get(Calendar.HOUR));
		System.out.println("분 : "+cal.get(Calendar.MINUTE));
		System.out.println("초 : "+cal.get(Calendar.SECOND));
		
		System.out.println("이번달의 마지막 날 : "+cal.getActualMaximum(Calendar.DAY_OF_MONTH));
		
		String[] week = {"","일","월","화","수","목","금","토"}; // week => 1~7
		System.out.println("요일 : "+week[cal.get(cal.DAY_OF_WEEK)]);
	}

}
