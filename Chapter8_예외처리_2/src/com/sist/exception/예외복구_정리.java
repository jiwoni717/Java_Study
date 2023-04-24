package com.sist.exception;
/*
 * 		예외처리
 * 		=> 직접처리(프로그래머 처리)
 * 			예외에 대한 복구가 가능(catch절)
 * 			try~catch~finally
 * 		=> 간접처리(JVM에 맡긴다)
 * 			예외 복구는 불가능 => 건너뛰게 만든다
 * 			throws
 * 		=> 사용자 정의 예외처리 : 지원하지 않기때문에 직접 예외처리 제작
 * 			거의 없다(if문을 이용하는 것이 더 좋다)
 * 			class MyException extends Exception{}
 * 			자동 호출시에 자바는 자바에서 만든 예외만 호출된다
 * 				=> 임의로 발생해서 찾는다
 * 				   throw
 * 
 * 		throws
 * 		형식)
 * 			method() throws 예외처리클래스,예외처리클래스...(순서가 없다)
 * 			=> method()를 호출하는 프로그래머가 예외 처리 후에 사용
 * 				=> 예외 떠맡기기
 * 				=> 1) 예외 떠맡기기
 * 				   2) try~catch로 처리가 가능하다
 * 				   3) 라이브러리 => 사용자에게 떠맡김
 *				ex)
 *					void method() throws ArrayIndexOutOfBoundsException,
 *										 NumberFormatException
 *					void 예외처리() throws	 ArrayIndexOutOfBoundsException,
 *										 NumberFormatException
 *					{
 *						method();
 *					}
 *					void 예외처리()
 *					{
 *						try
 *						{
 *							method();
 *						}catch(ArrayIndexOutOfBoundsException e)
 *						{
 *						}catch(NumberFormatException e)
 *					}
 *					void 예외처리()
 *					{
 *						method();
 *					}
 */
public class 예외복구_정리 {
	public static void method() throws ArrayIndexOutOfBoundsException, NumberFormatException // 실행시 에러이기 때문에 예외처리를 생략할 수 있다
	{
		
	}
	public static void execute() throws ArrayIndexOutOfBoundsException, NumberFormatException
	{
		method();
	}
	public static void execute2()
	{
		try
		{
			method();
		}
		catch(ArrayIndexOutOfBoundsException e) {}
		catch(NumberFormatException e) {}
	}
	public static void execute3()
	{
		try
		{
			method();
		}
		catch(RuntimeException e) {}
	}
	public static void execute4()
	{
		try
		{
			method();
		}
		catch(Exception e) {}
	}
	public static void execute5()
	{
		try
		{
			method();
		}
		catch(Throwable e) {}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method();
	}

}
