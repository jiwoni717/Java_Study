package com.sist.util;
/*
 * 		StringTokenizer : 문자열 분리
 * 			-split() 대처
 * 			-빅데이터 / 네트워크 / 웹에서 많이 등장
 * 			1) 기능
 * 			 생성자
 * 				StringTokenizer st = new StringTokenizer("구분할 문자열", 구분자)
 * 				StringTokenizer st = new StringTokenizer("구분할 문자열") => 공백으로 자름
 * 
 * 				String s1 = "애니메이션/어드벤처/코미디";
 * 					=> StringTokenizer st = new StringTokenizer(s1, "/")
 * 				String s2 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬";
 * 					=> StringTokenizer st = new StringTokenizer(s2)
 * 			 기능
 * 				countTokens() : 분리된 데이터 갯수
 * 				nextToken() : 분리된 데이터를 읽어옴
 * 				hasMoreTokens() : 분리된 갯수만큼 루프 수행
 */
import java.util.*;
public class 라이브러리_StringTokenizer_1 {

	public static void main(String[] args) {
		String s1 = "박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 "
				+"박서준 아이유 김종수 고창석 정승길 이현우 양현민 홍완표 허준석 이하늬 ";
		
		StringTokenizer st = new StringTokenizer(s1);
		
		while(st.hasMoreTokens()) // 자른 갯수만큼
		{
			System.out.println(st.nextToken());
		}
		
/*		System.out.println(st.countTokens());
		int a = st.countTokens();
		for(int i=0;i<a;i++)
		{
			System.out.println(st.nextToken());
		} */


	}

}
