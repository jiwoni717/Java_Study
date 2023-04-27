package com.sist.util;
/*
 * 		java.util : 프로그램 개발시 유용하게 사용할 수 있는 클래스의 집합
 * 					=> 반드시 import 사용!! (import.java.util.*)
 * 			1) Random : 난수 발생
 * 			2) Date/Calendar : 날짜/시간
 * 			3) StringTokenizer : 문자 분리
 * 			4) Collection*****
 *				└List : 순서가 존재, 데이터 중복 허용 => 데이터베이스
 *					└ArrayList
 *				└Set : 순서가 없음, 데이터 중복 비허용 => 장르
 *					└HashSet
 *				└Map : 순서가 없음, 저장시에 키/값을 동시에 저장 => 클래스 관리
 *					└HashMap
 *			5) Arrays : 배열 제어
 *				많이 사용↓
 *				-toString() : 배열 데이터 출력할 때
 *				-sort : 정렬
 *				-Arrays.asList() : 배열을 ArrayList로 변경
 *
 *		Random => nextInt() => int범위
 *				  nextInt(5) => 난수가 0~4까지
 */
import java.util.*;
public class 라이브러리_Random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Random r = new Random();
		int a = r.nextInt(100)+1; //1~100까지
		System.out.println(a);
*/
		int[] numbers = new int[10];
		Random r = new Random();
		for(int i=0;i<numbers.length;i++)
		{
			numbers[i] = r.nextInt(100)+1;
		}
		System.out.println("============== 정렬전 ==============");
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("============ 정렬후(ASC) ============");
		Arrays.sort(numbers);
		System.out.println(Arrays.toString(numbers));
		
		System.out.println("============ 정렬후(DESC) ============");
		for(int i=numbers.length-1;i>=0;i--)
		{
			System.out.print(numbers[i]+" ");
		}
		
	}

}
