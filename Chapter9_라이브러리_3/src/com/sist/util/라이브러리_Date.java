package com.sist.util;
import java.text.SimpleDateFormat;
/*
 * 		Date : java.util
 * 		 1) 시스템의 현재 날짜/시간 읽어오는 클래스, 오라클의 데이터형과 호환된다
 * 		 2) 단점 : 기능이 빈약 ==(보완)==> Calendar
 * 		 3) Date => SimpleDateFormat(java.text)
 * 					원하는 형식으로 날짜 변경
 * 		 4) 사용처 : 웹(등록일)
 * 
 * 		년도 : yyyy(2023) yyy(023)
 * 		월 : M, MM 
 * 		일 : d, dd
 * 		시간 : h, hh
 * 		분 : m, mm
 * 		초 : s, ss
 */
import java.util.*;
public class 라이브러리_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초"); //월은 M / 분은 m
		System.out.println(sdf.format(date));
	}

}
