package com.sist.map;
/*
 * 		Map
 * 		 └HashTable
 * 			↓ 보완	 
 * 		 └HastMap*
 * 
 * 		1) 특징
 * 		 2개의 값을 동시에 저장(key, value) => key값은 중복 불가, 중복이면 덮어쓴다
 * 		 웹에서 제공하는 모든 데이터는 Map형식
 * 		2) 메소드
 * 		 clear() : 전체 삭제
 * 		 put("key", "값") : 데이터 저장
 * 		 get("key") : 실제 데이터 값 읽기
 * 		 isEmpty() : 데이터 존재 여부
 * 		 size() : 저장된 갯수
 * 		 values() : 실제 저장된 값 전체
 */
import java.util.*;
public class 라이브러리_Map_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		//데이터 저장
		map.put("id", "admin");
		map.put("password", "1234");
		map.put("name", "홍길동");
		map.put("sex", "남자");
		map.put("age", 25);
		map.put("password", "4567");
		
		//데이터 출력
		Set set = map.keySet(); // 키 전체를 모아서 관리
		for(Object obj:set)
		{
			String key = (String)obj;
			System.out.println(key+" : "+map.get(key));
		}
		
		System.out.println("=================");
		for(Object o:map.values())
		{
			System.out.println(o);
		}

	}

}
