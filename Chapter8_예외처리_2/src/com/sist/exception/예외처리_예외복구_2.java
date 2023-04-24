package com.sist.exception;
/*
 * 		예외처리가 예외를 수정해주는 것은x => 에러가 발생한 소스를 건너 뜀
 * 		형식
 * 			try
 * 			{
 * 				문장1
 * 				문장2
 * 				문장3
 * 				★try안에서 에러 발생시 에러난 위치부터 try 끝까지는 수행하지 않고 catch로 이동★
 * 			}catch(예외처리 종류)
 * 			{
 * 				문장4
 * 			}
 * 			문장5
 * 			문장6
 * 
 * 			에러가 나지 않았을 때
 * 			  문장1 → 문장2 → 문장3 → 문장5 → 문장6
 * 
 * 			문장2에서 에러가 발생
 * 			  문장1 → 문장4 → 문장5 → 문장6
 * 		
 */
public class 예외처리_예외복구_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문장1");
		System.out.println("문장2");
		try {
			System.out.println("문장3");
			System.out.println("문장4");
			int[]arr = new int[2];
			arr[2]=100;
			System.out.println("문장5 : " + arr[2]);
			System.out.println("문장5");
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("문장6 : 에러처리 완료");
		}
		
		System.out.println("문장7");
		System.out.println("프로그램 종료");
	}

}
