/*
 * 		데이터 저장 ============================> 데이터 가공(연산처리) ============================> 결과값 출력
 *		↓											|연산자									System.out.println();
 *		1.직접 값 입력
 *		2.사용자로부터 입력을 받는다.
 *		3.난수
 *		---------------------> 메모리
 *		4.파일에 읽기
 *		5.오라클에서 값 읽기
 */

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in); // system.in => 키보드로 입력을 받음 / out => 화면으로 출력
		
		System.out.println("a를 입력하시오 : ");
		int a = scan.nextInt();
		
		System.out.println("b를 입력하시오 : ");
		int b = scan.nextInt();
		
		/*
		 *  2개를 동시에 받기
		 *  = system.out.println("정수 두개를 입력하세요(ex 20 30) : ");
		 */
		
	
		System.out.println("a-b = "+(a-b));
		System.out.println("a*b = "+(a*b));

	}

}
