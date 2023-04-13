/*
 * 		method => 140p
 * 		1. 메소드 형식 => 기능처리
 * 			= 리턴타입(리턴형)
 * 				처리후 결과값 한개만 전송이 가능하다
 * 				여러개인 경우 : 배열, 클래스
 * 				1) 결과값이 있는 경우
 * 					리턴형 메소드명(매개변수...)
 * 					----> return값과 일치해야함 / 리턴형이 더 클 수도 있음
 * 				2) 결과값이 없는 경우
 * 					void 메소드명(매개변수...)
 * 					{
 * 						return; => 메소드 종료(생략하면 컴파일러가 자동으로 추가해줌)
 * 					}
 * 			= 메소드명 => 식별자와 동일
 * 			  -----> 길이에 제한이 없다. => 의미를 부여
 * 			= 매개변수 : 사용자 요청값
 * 			
 */
import java.util.Scanner;
public class 문제01 {
	static void method1()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("0~32767까지의 정수 입력 : ");
		int num = scan.nextInt();
		
		int[] arr = new int[16];
		int index = 15;
		
		while(true)
		{
			arr[index] = num%2; // 맨 마지막에 2로 나눈 나머지 저장
			num = num/2; // num에 2로 나눈 몫 저장
			if(num==0)
				break;
			index--;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(i%4==0 && i!=0)
			{
				System.out.print(" ");
			}
			System.out.print(arr[i]);
		}
		
	}
	public static void main(String[] args) {
		
		method1();

	}

}
