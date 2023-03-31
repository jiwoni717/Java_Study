/*
 * if(0점 미만 100점 초과)
 * 	{
 * 		경고
 * 	}
 * else
 * 	{
 * 		정상출력
 * 	}
 */

import java.util.Scanner;

public class 문제03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("학년을 입력하시오 : ");
		int grade = scan.nextInt();
		System.out.print("점수를 입력하시오 : ");
		int score = scan.nextInt();
		
		//점수 초과
		if(score<0 || score>100)
		{
			System.out.println("점수를 잘못 입력하셨습니다.");
		}
		else
		{
			if(grade==4)
			{
				if(score>=70)
				{
					System.out.println("합격입니다.");
				}
				else
				{
					System.out.println("불합격입니다.");
				}
			}
			
			//4학년이 아닌 경우
			else
			{
				if(score>=60)
				{
					System.out.println("합격입니다.");
				}
				else
				{
					System.out.println("불합격입니다.");
				}
			}
		}
		
		
		
//		System.out.print("점수를 입력하시오 : ");
//		int score = scan.nextInt();
//		
//		if(grade==4 && (score>=70 && score<=100))
//			System.out.println("합격입니다.");
//		
//		if(grade<4 && (score>=60 && score<=100))
//			System.out.println("합격입니다.");
//
//		if(score<0 || score>100)
//			System.out.println("점수를 잘못 입력하였습니다.");

	}

}
