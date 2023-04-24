/*
 * 		자신 ===> 객체호출(this), 생성자(this())
 * 		상위클래스 ===> 객체호출(super), 생성자(super())
 */
package com.sist.exception;
import java.util.*;
class MyRuntimeException extends RuntimeException
{
	public MyRuntimeException(String msg)
	{
		super(msg); //RuntimeException가 가지고 있는 생성자
	}
}
public class 예외처리_사용자정의_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("점수 입력 : ");
			int score = scan.nextInt();
			if(score<0)
			{
				throw new MyRuntimeException("음수는 사용할 수 없습니다.");
				// 장점 => 에러 위치 확인 가능
				// 사용자 정의 클래스를 호출할 때 사용
			}
			System.out.println("점수는 "+score+"점 입니다.");
			
		}catch(MyRuntimeException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("------------------------- 에러 발생 위치 확인 -------------------------");
			ex.printStackTrace();
		}
	}

}
