package com.sist.util;

import java.util.StringTokenizer;
/*
 * 		String s = "red|green|blue|black|yellow";
 * 		=> split, StringTokenizer
 * 		String[] colors = s.split("\\|");
 * 			split(String regex)
 * 						--------> 정규식이 들어가기 때문
 * 		StringTokenizer st = new StringTokenizer(s,"|");
 * 		
 */
public class 라이브러리_StringTokenizer_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "red|green|blue|black|yellow";
		StringTokenizer st = new StringTokenizer(s,"|");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
		
	}

}
