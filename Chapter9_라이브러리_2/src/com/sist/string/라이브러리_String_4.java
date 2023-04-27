package com.sist.string;
/*
 * 	문자열을 입력해서 좌우 대칭인지 확인해라
 */
import java.util.*;
public class 라이브러리_String_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String s = "";
		
		while(true)
		{
			System.out.print("문자열 입력 : ");
			s = scan.next();
			
			if(s.length()%2!=0)
			{
				System.out.println("문자 갯수가 짝수여야 합니다!");
				continue;
			}
			break;
		}	
		
		boolean bCheck = true;
		int j = s.length()-1;
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(j))
			{
				bCheck = false;
			}
			j--;
		}
		
		if(bCheck == true)
		{
			System.out.println(s+"는(은) 좌우 대칭입니다");
		}
		else
		{
			System.out.println(s+"는(은) 좌우 대칭이 아닙니다");
		}
	}

}
