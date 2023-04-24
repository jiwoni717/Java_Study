package com.sist.exception;

import java.io.IOException;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

/*
 * 		예외 떠맡기기, 예외 회피...
 * 		=> 메소드를 읽는다 => JVM에 이런 예외가 발생할 수도 있다고 알려만 줌(예외 선언)
 * 		=> 메소드 호출시에 !!반드시!! 직접처리할건지, 선언만 할건지 선택
 * 		=> RuntimeException은 생략가능(예외처리를 하지 않아도 됨)
 * 
 * 		void method() throws RuntimeException
 * 		void method() throws Exception*
 * 		void method() throws NumberFormatException, ClassCastException...
 * 		void method() throws IOException*
 * 		void method() throws SQLException, NumberFormatException*
 */
public class 예외처리_예외회피_1 {
	public static void methods() throws Exception //예외처리 대상
	{
		
	}
	public static void method1() throws Exception //간접처리(JVM이 처리)
	{
		methods();
	}
	public static void method2()
	{
		try
		{
			methods();
		}catch(Exception e) //작은게 들어오면 안됨
		{
			
		}
	}
	public static void method3() throws IOException,SQLException,ClassNotFoundException
	{
		
	}
	public static void method4() throws IOException,SQLException,ClassNotFoundException
	{
		method3();
	}
	public static void method5() throws Exception //Throwable도 가능~
	{
		method3();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
