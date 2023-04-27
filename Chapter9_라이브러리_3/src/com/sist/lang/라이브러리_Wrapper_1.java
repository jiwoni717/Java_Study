package com.sist.lang;

import java.util.ArrayList;

/*
 * 		Wrapper : 전체를 감싼다
 * 		1. 기본형 데이터형을 객체 단위로 저장할 때
 * 			List<int> => 오류 <>안에 클래스형이 들어가야함
 * 			List<Integer>
 * 
 * 		기본형	│	클래스형
 * 		int		│	Integer
 * 		long	│	Long
 * 		byte	│	Byte
 * 		double	│	Double
 * 		boolean	│	Boolean
 * 
 * 		사용처 => 문자열을 원하는 데이터형으로 변경할 때 주로 사용
 * 		문자열을 해당 데이터형으로 변환할 때는 parseXxxx(데이터형)
 * 
 * 		오토박싱 / 언박싱
 * 		1. 오토박싱
 * 			Integer i = 10; => 클래스에 기본 데이터형을 집어넣는게 가능
 * 		2. 언박싱
 * 			int aa = i; => 기본형에 클래스 객체를 설정해주는 것
 * 
 * 		void display(Integer i1, Integer i2)
 * 		display(10, 20) => 가능
 */
public class 라이브러리_Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "4.3";
		double d = Double.parseDouble(s);
		
		Integer i = 100; //오토박싱
		System.out.println("i = "+i);
		int a = i; //언박싱
		System.out.println("a = "+a);
		
	}

}
