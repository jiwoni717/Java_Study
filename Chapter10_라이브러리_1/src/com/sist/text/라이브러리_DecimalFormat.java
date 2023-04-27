package com.sist.text;
import java.text.*;
public class 라이브러리_DecimalFormat {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###");
		int won = 12345678;
		System.out.println(df.format(won)+"원");
		
		// ↓ switch~case 대신
		System.out.println("================================");
		double[] limit = {59, 60, 70, 80, 90};
		String[] grade = {"F","D","C","B","A"};
		int[] score = {100, 90, 85, 90, 77, 65, 58};
		ChoiceFormat cf = new ChoiceFormat(limit, grade);
		for(int i=0;i<score.length;i++)
		{
			System.out.println(score[i]+" : "+cf.format(score[i]));
		}
	}

}
