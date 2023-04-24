package com.sist.exception;
/*
 * 		1. 예외처리 방법과 형식
 * 			1) 직접 처리(예외 복구)* : 프로그래머
 * 				try
 * 				{
 * 					실행 가능한 소스(정상수행)
 * 				}catch(예외처리 종류)
 * 				{
 * 					try에 있는 소스 실행 과정에서 에러 발생시 처리하는 영역
 * 				}
 * 				finally
 * 				{
 * 					무조건 수행(생략 가능)
 * 					=> 서버 닫기, 오라클 닫기, 파일 닫기...
 * 				}
 * 				
 * 				catch는 에러 발생시 예외 복구하는 영역 => 여러개 사용 가능 => 한개의 예외로 통합이 가능 Exception / Throwable
 * 				순서가 존재한다 => 상위 클래스는 아래에 배치
 * 				try절이 정상 수행을 하면 catch절은 수행하지 않음
 * 				try절에서 에러 발생시에는 에러가 발생한 곳부터는 수행x => catch절 수행해서 에러 복구 후 종료
 * 				catch는 위에서부터 한개씩 검색한 후에 해당 예외처리 클래스를 찾아 수행 (== 다중조건문) => catch는 여러개 적을 수 있으나 !!한개만 수행!!
 * 
 * 			2) 간접 처리(예외 회피)* : 자바나 오픈 라이브러리
 * 				예외에 대해 예측되는 예외 클래스를 선언만 함(처리x)
 * 				=> 다른 메소드에서 호출시에 처리 후 사용이 가능(try~catch)
 * 				예외클래스의 순서가 없다
 * 				UnCheckedException은 사용하지 않고 보통 CheckedException 사용
 * 				라이브러리 java.lang / java.util => UnCheckedExcpeion | java.io / java.net / java.sql => CheckedException(반드시 예외처리를 해야함)
 * 				
 * 				[접근지정어] 리턴타입 메소드명() throws 예외처리클래스,....(여러개 쓸 수 있음)
 * 				①
 * 				메소드() throws 예외처리클래스{
 * 				
 * 				}
 * 				②
 *				메소드()						← 권장사항
 *				{
 *					try {
 *					메소드 호출
 *					}
 *					catch(예외처리클래스) {}
 * 
 * 			3) 임의 발생 : 보통 테스트용으로 사용한다
 * 				throw new 예외처리클래스(); => 해당 예외처리클래스가 있는 catch로 이동
 * 				
 * 			4) 사용자 정의 예외처리
 * 				예외처리 클래스를 상속 받아서 처리
 * 				class MyException extends Exception {} => if~else 사용해서 처리하는게 더 좋을 수도...
 * 
 */
public class 예외처리정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
