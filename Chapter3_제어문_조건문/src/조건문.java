/*
 * 	자바에서 지원하는 제어문 : 반복 / 조건 / 선택 / 반복 제어
 * 		=> 변수/연산자/제어문
 * 			| ---------- 메소드
 * 		   여러개
 * 
 * 		*자바에서 지원하는 모든 제어문은 바로 밑에 있는 명령문만 제어 할 수 있다.
 * 			if(조건)
 * 				문장 1 => 제어
 * 				문장 2 => if문과 관련없는 문장(true/false와 관계없이 무조건 수행)
 * 			=>한개이상의 명령문을 수행할 때는 반드시 괄호로 묶어준다.
 * 			if(조건)
 * 			{
 * 				문장 1
 * 				문장 2
 * 			}
 * 
 * 		=> 조건문
 * 			= 단일 조건문
 * 				if(조건 => 부정연산자(!), 비교연산자, 논리연산자) => 결과값이 항상 true/false
 * 				{
 * 					조건이 true일 경우에만 수행하는 문장
 * 				}
 * 			= 선택 조건문
 * 			= 다중 조건문
 * 
 * 		=> 선택문
 * 
 * 		=> 반복문
 * 			= while
 * 			= do~while
 * 			= for
 * 				= 일방 for
 * 				= 향상된 for => for-each(웹에서 핵심)
 * 
 * 		=> 반복제어문
 * 			= break;
 * 			= continue
 * 		======================= 응용(연산자) => 54page
 * 
 * 
 * 
 */

// 조건문(단일 조건문) => 짝수 / 홀수 확인

import java.util.Scanner;
public class 조건문 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		
		if (num%2==0) // 짝수 조건
			System.out.println(num+"는(은) 짝수입니다.");
			System.out.println("num = "+num); // if문과 관련이 없는 문장 무조건 수행 => 괄호로 묶지 않았기 때문
		
		if (num%2!=0) // 홀수 조건
			System.out.println(num+"는(은) 홀수입니다.");
			System.out.println("프로그램 종료!!"); // 무조건 수행

	}

}
