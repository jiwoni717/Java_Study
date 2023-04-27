/*
 * 		String 메소드
 * 
 * 		String은 문자열 배열
 * 		=> 문자마다 index번호를 가지고 있다(0부터 시작)
 * 		String s = "Hello Java"
 * 
 * 		주요기능 (310p)
 * 		1) 문자열에서 문자 1개 추출 => char charAt(int index)
 * 		
 */
package com.sist.string;
import java.util.*;
public class 라이브러리_String_3 {

	public static void main(String[] args) {
		String msg = "Hello Java";
		/*for(int i=0;i<msg.length();i++)
		{
			System.out.println((i+1)+"번째 문자 : "+msg.charAt(i));
		}*/
		
		//코딩 테스트 => msg를 거꾸로 출력
/*		for(int i=msg.length()-1;i>=0;i--)
		{
			System.out.println(msg.charAt(i));
		}
*/
		// 알파벳 문자열을 입력받아서 대문자 몇개, 소문자 몇개인지 출력하는 프로그램
		Scanner scan = new Scanner(System.in);
		System.out.print("문자열을 입력하세요 : ");
		String s = scan.nextLine(); // => 공백이 들어가도 상관x
		int num1 = 0;
		int num2 = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char c = s.charAt(i);
			if(c>='A' && c<='Z')
			{
				num1++;
			}
			else if(c>='a' && c<='z')
			{
				num2++;
			}
		}
		
		System.out.println("대문자 : "+num1+"개, 소문자 : "+num2+"개");
		
	}

}
