package com.sist.exception;
/*
 * 		throws : 예상되는 에러를 선언 => 메소드 사용시에 다른 메소드에서 처리 후에 사용 => 선언만 할 수도 있음 / 처리 후에 사용 => 다른 메소드로 전가
 * 				 라이브러리가 보통 선언하고 있음
 * 				 ------- CheckedException만 등록
 * 		throw : 고의로 예외 발생(테스트용)
 */
import java.util.*;
public class 에외처리_임의발생_사용자정의 {

	public static void main(String[] args) {
/*		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("점수를 입력하세요 : ");
			int score = scan.nextInt();
		
			if(score < 0)
			{
				throw new IllegalArgumentException(); //catch 호출~!
			}
			System.out.println("score = "+score);
		}catch(IllegalArgumentException e)
		{
			System.out.println("점수는 음수를 사용할 수 없습니다");
		}
*/
		Scanner scan = new Scanner(System.in);
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();
		
		if(score<0)
		{
			System.out.println("점수는 음수를 사용할 수 없습니다");
		}
		else
		{
			System.out.println("score = "+score);
		}
		
	}

}
