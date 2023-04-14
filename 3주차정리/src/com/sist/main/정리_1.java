/*
 *		변수 =======> 배열 =======> 구조체 =======> 클래스
 *		1개만 저장	  같은 데이터형	   다른 데이터형	다른 데이터형
 *				  여러개 저장		여러개 저장  여러개 저장 + 메소드
 *								 (삭제)
 *
 *		명령문 => 변수선언 + 연산처리 + 제어
 *				-------------------
 *					=> 메소드
 *
 *		클래스
 *		변수 여러개 => 사용자 정의 데이터형(일반 기본형과 동일하게 처리)
 *				   ---------------
 *				배열이용이 가능 / 형변환 가능
 *		변수 + 메소드
 *		==> 클래스 영역은 선언만 가능
 *		변수 선언 => 선언과 동시에 값을 초기화할 수도 있다 => 선언 후에 초기화는 x(=구현) => 이걸 가능하게 해주는 생성자, 초기화 블록
 *		메소드 선언
 *		리턴형 메소드명(매개변수목록)
 *		{
 *			구현
 *		}
 *
 *		class A
 *		{
 *			{
 *			}
 *			A()
 *			{
 *				구현 가능 => 제어문, 변수값 읽기, 변수값 변경, 파일 읽기...
 *				시작과 동시에 변수의 초기화 => 생성자
 *			}
 *			void display()
 *			{
 *				구현
 *				사용자가 요청시 초기화 => 일반 메소드
 *			}
 *		}
 */
package com.sist.main;
import javax.swing.*;
public class 정리_1 extends JFrame{
	JButton b,b2;
	정리_1()
	{
		b = new JButton("click");
		b2 = new JButton("click");
		add("North",b);
		add("South",b2);	
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new 정리_1();
	}

}
