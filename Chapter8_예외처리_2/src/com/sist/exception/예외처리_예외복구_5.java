package com.sist.exception;
/*
 *  	finally => 생략이 가능
 *  	try를 수행, catch를 수행 관계없이 무조건 수행되는 문장
 *  	파일 닫기, 오라클 연결 해제, 서버 연결 해제...
 *  
 *  		try
 *  		{
 *  			정상수행이 가능
 *  			=> 예상하지 못한 에러가 발생할 수 있다~!
 *  		}catch(예상되는 예외클래스)
 *  		{
 *  			에러 발생시 처리
 *  			= 에러를 확인
 *  			= 복구하거나 오류메세지 전송
 *  		}
 *  		finally
 *  		{
 *  			무조건 수행하는 문장
 *  		}
 *  
 *  	실행 순서
 *  		문장1
 *  		문장2
 *  		try
 *  		{
 *  			문장3
 *  			문장4
 *  			문장5
 *  		}catch(예외처리 클래스1)
 *  		{
 *  			문장6
 *  		}catch(예외처리 클래스2)
 *  		{
 *  			문장7
 *  		}catch(예외처리 클래스3)
 *  		{
 *  			문장8
 *  		}
 *  		finally
 *  		{
 *  			문장9
 *  		}
 *  		문장10
 *  	
 *  		1. try가 정상수행
 *  		문장1 → 2 → 3 → 4 → 5 → 9 → 10
 *  
 *  		2. try 문장4 => 에러1번 발생
 *  		문장1 → 2 → 3 → 6 → 9 → 10
 *  
 *  	멀티 예외처리
 *  	
 */
public class 예외처리_예외복구_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr = new int[2];
			arr[0] = 10;
			arr[1] = 0;
			System.out.println(arr[0]/arr[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		{
			System.out.println("에러 발생!");
		}
		System.out.println("프로그램 종료");
	}

}
