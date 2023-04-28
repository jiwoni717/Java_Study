package com.sist.lib;
/*
 * 		컬렉션 프레임워크
 * 		1. 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 * 		2. 배열의 단점(길이 고정)을 보완
 * 		3. 컬렉션의 종류
 * 		Collection
 * 			└List : 순서가 존재,데이터 중복 허용, 순차적으로 저장(인덱스 번호 이용)
 * 				└ArrayList** : 단방향 포인터(인덱스)를 가지고 있다 => 조회하기 편리
  							   장점 : 검색·데이터 추가시 속도가 빠르다
  							   단점 : 수정, 중간에 추가, 삭제시 속도가 느려짐 => 이럴 경우에는 LinkedList
  							   		------------------------------> 그래서 변경이나 삭제가 거의 없는 상태에서 주로 사용
 * 			 	└LinkedList : 양방향 포인터를 가지고 있다
 							  수정, 삭제, 추가가 많은 경우 주로 사용
 							  단점 : 검색 속도가 느림
 * 				└Vector : 대용량 데이터 처리 가능 => 채팅, 서버연결... (동기화)
 * 			└Set : 순서x, 데이터 중복 허용x => 장르별/부서별...
 * 			 	└HashSet* : 속도가 빠름
  					1) 주요메소드
  					 add() : 데이터 저장
  					 remove() : 데이터 삭제
  					 clear() : 데이터 전체 삭제
  					 isEmpty() : 데이터 존재 여부 확인
  					 size() : 저장 갯수
  					 iterator() : 데이터를 한번에 모아서 관리
 * 			 	└TreeSet : 정렬이 되어있는 상태, 검색 속도가 빠르다
 					headSet
 					tailSet 
 * 			└Queue(FIFO) : 먼저 들어온 데이터를 먼저 출력 ↔ Stack(LIFO)
 * 		Map : Key와 Value 동시에 저장 => 웹에서 주로 사용, 클래스 관리, 도서목록, 우편변호...
 * 		 └HashMap*
 * 		 └HashTable : HashMap보다 속도가 느림
 * 		---------------------------------------------------------
 * 		
 * 		
 */
import java.util.*;
public class 라이브러리_Collection {

	public static void main(String[] args) {
		// HashSet
		Set set = new HashSet();
		set.add("졸리다..");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("A");
		set.add("B");
		set.add("C");
		
		//출력
		for(Object obj:set) // for-each구문은 선언하는 곳에서 형변환 불가 할라면 괄호 안에서
		{
			String s = (String)obj; // 이건 가능
			System.out.print(s+" ");
		}

	}

}
