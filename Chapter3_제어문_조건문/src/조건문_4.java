/*
 * 		54page
 * 		단일 조건문
 * 			1.형식
 * 				if(조건문)
 * 					{
 * 						수행문 => 조건이 true일 경우에만 수행
 * 					}
 * 					=> {}이 없는 경우에는 한개의 문장만 수행 가능
 * 					=> 여러개를 동시에 제어시에는 반드시 {}을 사용해서 묶어줌
 * 			2.if 중첩 조건문
 * 				if(조건문) ===============> if(조건 && 조건)
 * 					{
 * 						if(조건문)
 * 							{
 * 							}
 * 					}
 * 
 */

// 계산기 만들기 (사칙연산) ==> 1. 정수 2개, 2. 연산자
import java.util.Scanner;
public class 조건문_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 정수를 입력하시오 : ");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하시오(+, -, *, /) : ");
		char op =scan.next().charAt(0); //문자열을 받아서 char를 한개 가지고 온다.
		
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		System.out.println("op = "+op);
		
		// 계산기
		
		if(op == '+')
		{
			System.out.printf("%d+%d = %d",num1,num2,num1+num2);
		}
		if(op == '-')
		{
			System.out.printf("%d+%d = %d",num1,num2,num1-num2);
		}
		if(op == '*')
		{
			System.out.printf("%d+%d = %d",num1,num2,num1*num2);
		}
		if(op == '/')
		{
			if(num2==0)
				System.out.println("0으로 나눌 수 없습니다.");
			if(num2!=0)
				System.out.printf("%d+%d = %d",num1,num2,num1/num2);
		}

	}

}
