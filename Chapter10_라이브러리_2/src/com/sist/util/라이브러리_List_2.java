package com.sist.util;
/*
 * 		● List의 메소드
 * 		 add, remove, set, size, clear => 기본 메소드
 * 		 containsAll() : 두개의 list에서 중복된 데이터를 모아서 관리 => 오라클의 JOIN
 * 		 retainAll() : 두개의 list에서 중복된 데이터만 남기기
 * 		 addAll() : 데이터 전체 복사
 * 		 subList : 데이터를 부분적으로 복사
 */
import java.util.*;
public class 라이브러리_List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		list.add(2);
		list.add(1);
		list.add(4);
		
		//출력
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		//일부만 추가 subList(start, end)
		System.out.println("==============");
		ArrayList list2 = new ArrayList(list.subList(1, 4));
		list2.add(10);
		list2.add(11);
		list2.add(12);
		for(Object i:list2)
		{
			System.out.println(i);
		}
		
		//sort
		System.out.println("==============");
		Collections.sort(list);
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		//같은 데이터 추출
		System.out.println("==============");
		System.out.println(list.containsAll(list2)); //()전체 다 포함하고 있는지 묻는거임
		
		//중복된 데이터만 남기기 => INSERSECT => 교집합
		System.out.println("==============");
		System.out.println(list.retainAll(list2));
		for(Object i:list)
		{
			System.out.println(i);
		}
		
		//addAll
		System.out.println("==============");
		ArrayList list3 = new ArrayList();
		list3.addAll(list);
		for(Object i:list3)
		{
			System.out.println(i);
		}
	}

}
