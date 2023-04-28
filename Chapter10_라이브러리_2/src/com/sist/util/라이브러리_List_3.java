package com.sist.util;
import java.util.*;
/*
 * 		subList(int start, int end) => start부터 end-1까지 부분적으로 데이터 복사
 * 		=> 페이지 나누기
 * 		Collections.sort() => ArrayList 정렬
 */
public class 라이브러리_List_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList names1 = new ArrayList();
		names1.add("홍길동");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		names1.add("춘향이");
		
		ArrayList names2 = new ArrayList();
		names2.add("홍길수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("강감차");
		names2.add("성춘향");
		
		System.out.println("=================");
		ArrayList temp = new ArrayList();
		temp.addAll(names1);
		temp.retainAll(names2); //
		for(Object name:names1)
		{
			System.out.println(name);
		}
		
		System.out.println("=================");
		for(Object name:temp)
		{
			System.out.println(name);
		}

	}

}
