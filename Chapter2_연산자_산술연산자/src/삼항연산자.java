/*
 * 		삼항연산자
 * 		(조건)?값1:값2
 * 		(조건)이 true면 => 값1
 * 			   false면 => 값2
 * 		============> if ~ else	
 * 		웹/게임
 */

import java.util.Scanner;
public class 삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		System.out.println(num%2==0?"짝수입니다":"홀수입니다");
		
//		if(num%2==0)
//		{
//			System.out.println("짝수입니다");
//		}
//		else
//		{
//			System.out.println("홀수입니다");
//		}


	}

}
