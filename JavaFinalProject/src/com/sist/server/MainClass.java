package com.sist.server;
/*
 		Thread 사용 방법
 		1. 클래스 상속
 			재정의 => 변경해서 사용
 			
 			class A extends Thread {}
 		2. 인터페이스 상속
 			동작만 지정
 			
 			class A implements Runnable
 			{
 				public void run() {}
 				=> run() 메소드는 스레드가 동작할 수 있게 제어
 			}
 */
class MyThread extends Thread
{
	// 각 스레드마다 스레드명 설정 => Thread-0 ....
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println(getName()+" : "+i); // getName() => 스레드의 이름
				Thread.sleep(100); // 1/1000
			}
		} catch(Exception ex) {}
	}
}

public class MainClass {

	public static void main(String[] args) {
		MyThread m1 = new MyThread(); //Thread-0
		MyThread m2 = new MyThread(); //Thread-1
		MyThread m3 = new MyThread();
/*
		JVM 역할
		1) 이름 설정
		2) 우선순위 결정
			1~10
			사용자 정의 => NORM_PRIORITY => 중간(5)
			1 => main thread
			10 => gc
 */
		System.out.println("m1 => "+m1.getName()+", 우선순위 : "+m1.getPriority());
		System.out.println("m2 => "+m2.getName()+", 우선순위 : "+m2.getPriority());
		System.out.println("m3 => "+m3.getName()+", 우선순위 : "+m3.getPriority());
		m1.start(); // run() 호출
		m2.start();
		m3.start();
	}

}
