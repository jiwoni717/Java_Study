package com.sist.util;
/*
 * 		335p
 * 		Collection
 * 		 데이터를 묶어서 관리할 수 있게 만든 클래스
 * 		 배열의 단점(길이 고정) 보완 => 컬렉션은 가변형이기 때문에 저장 메모리를 결정하지 않음
 * 
 * 		컬렉션 프레임워크
 * 			--------> 모든 개발자가 동일한 형태로 소스 코딩 => 소스 통일화 목적
 * 					  일정한 틀 => 쉽게 다른 개발자의 코딩을 분석
 * 
 * 		Collection : 데이터 그룹, 다수의 데이터를 모아서 관리
 * 		 └List
 * 			└ArrayList*
 * 			└Vector
 * 			└LinkedList
 * 		 └Set
 * 			└HashSet*
 * 			└TreeSet
 * 		Map
 * 		 └HashMap*
 * 		 └Hashtable
 * 
 * 		List
 * 		1) 순서를 가지고 있다(인덱스 이용) => 0부터 시작
 * 			데이터를 추가, 삭제해도 생략되는 번호 없이 순차적으로 자동 설정
 * 		2) 데이터 중복을 허용한다
 * 		3) CURD 프로그램에서 주로 사용
 * 		4) 비동기화
 * 			데이터 여러개를 동시에 가져옴
 * 			데이터베이스 프로그램 연동시 사용
 * 		5) 구현하고 있는 클래스
 * 			ArrayList
 * 			Vector
 * 			LinkedList
 * 		6) 주요 메소드
 * 			데이터 추가 : add(Object)
 * 			데이터 삭제 : remove()
 * 			데이터 수정 : set()
 * 			데이터 읽기 : get()
 * 			저장된 데이터 갯수 가져오기 : size()
 * 			전체 삭제 : clear()
 * 			데이터 존재 여부 확인 : isEmpty()
 * 		-----------------------------------------------
 * 		Set
 * 		1) 순서가 없다(인덱스 번호 x) => 출력시 forEach
 * 		2) 데이터 중복을 허용하지 않는다
 * 		3) List에서 중복된 데이터를 제거할 때 사용
 * 		4) 구현하고 있는 클래스
 * 			HashSet
 * 			TreeSet
 * 		5) 주요 메소드(=>List와 동일)
 * 			데이터 추가 : add(Object)*
 * 			데이터 삭제 : remove()
 * 			데이터 수정 : set()
 * 			데이터 읽기 : get()*
 * 			저장된 데이터 갯수 가져오기 : size()*
 * 			전체 삭제 : clear()
 * 			데이터 존재 여부 확인 : isEmpty()
 * 		-----------------------------------------------
 * 		Map(웹에서 지원하는 클래스는 모두 Map형식)
 * 		request, response, session, cookie
 * 		1) 키와 값을 쌍으로 저장한다(키를 통해 값을 가져옴)
 * 		2) 키는 중복을 허용하지 않는다, 값은 중복이 가능
 * 		3) 키가 같으면 값을 덮어쓴다
 * 		4) 웹에서 주로 사용(클래스 관리, SQL관리시 많이 사용)
 * 		5) 구현하고 있는 클래스
 * 			HashMap
 * 		6) 주요 메소드
 * 			저장 : put()
 * 			읽기 : get(key)
 * 		-----------------------------------------------
 * 		웹 프로그램
 * 		 Model 1 방식
 * 			간단한 사이트 : JSP기반
 * 		 Model 2 방식
 * 			큰 사이트 : MVC
 * 			데이터 관리 / 화면출력을 나눠서
 * 		
 */
import java.util.*;
/*
 *  	ArrayList 생성 방식
 *  	List list = new ArrayList(); => 기본 생성자(메모리 10개)
 *  	ArrayList list = new ArrayList(); => 10개 넘으면 자동으로 10개 추가
 *  	ArrayList list = new ArrayList(10)
 */
public class 라이브러리_List_1 {

	public static void main(String[] args) {
		//생성																								┌for문 돌리기 힘듦...
		ArrayList list = new ArrayList(); // object로 저장(=>모든 데이터형을 넣을 수 있다) !!여러 데이터형을 넣으면 관리하기 힘들어지기 때문에 가급적이면 같은 데이터형 첨부!!
		
		//데이터 추가 => add() (->오버로딩이 되어있음)
		list.add("홍길동");
		list.add("박문수");
		list.add("심청이");
		list.add("춘향이");
		list.add("이순신");
		list.add(2, "강감찬");
		list.add(3, "을지문덕"); // 자동으로 인덱스 번호가 변경됨 => 속도가 느려짐
		list.add("박문수");
		
		//출력
		//저장된 갯수 => size() -> 배열의 length()
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		
		System.out.println("========== 삭제 =========="); //삭제 되어도 자동으로 인덱스 번호 변경(앞으로 당겨짐)
		
		//list.remove(인덱스번호) list.remove("홍길동") => 데이터 내용으로 삭제하면 제일 처음에 있는 데이터만 삭제
		list.remove(3);
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		
		System.out.println("========== 수정 ==========");
		list.set(0, "홍길수"); // set(인덱스번호, 변경할 내용)
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+". "+list.get(i));
		}
		
		System.out.println("====== 저장된 갯수 확인 ======");
		System.out.println("인원수 : "+list.size());
		
		System.out.println("======== 전체 삭제 ========");
		list.clear(); //메모리 공간 비울때
		System.out.println("인원수 : "+list.size());
		
	}

}
