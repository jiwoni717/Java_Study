package com.sist.util;
import java.util.*;
public class 라이브러리_Calendar_2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하세요 : ");
		int year = scan.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = scan.nextInt();
		System.out.print("일을 입력하세요 : ");
		int day = scan.nextInt();
		String[] week = {"","일","월","화","수","목","금","토"}; // 배열 0번째를 비우거나 불러올 때 -1
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1); // 설정시에는 -1 불러올 때는 +1
		cal.set(Calendar.DATE, day);
		
		System.out.println("======== 설정된 날짜 ========");
		System.out.println(cal.get(Calendar.YEAR)+"년 "+(cal.get(Calendar.MONTH)+1)+"월 "+cal.get(Calendar.DATE)+"일 "
							+week[cal.get(Calendar.DAY_OF_WEEK)]+"요일");

	}

}
