package com.sist.inter;
/*
 		인터페이스 => 기능 설계
 		 인터페이스는 미완성 클래스이기 때문에 메모리 할당을 하지 못한다
 		 변수는 상수형 변수 / 메소드는 추상 메소드
 		 다중 상속이 가능하다
 		 구현 메소드가 가능하다 => default, static
 		 추상 클래스의 일종(단일 상속/다중 상속 구분)
 		 상속 : extends / 구현 : implements
 		 목적(기술면접 단골질문) => 스프링이 인터페이스 기반이기 때문에~...
 		  -표준화가 가능하다(메소드명은 동일하나 구현은 다를 수 있음)
 		  -관련된 클래스 여러개를 모아서 관리
 		  -독립적으로 사용이 가능하다
 		 형식
 		  public interface Interface명
 		  {
 		  	(public static final)int a = 10; → 변수는 값을 설정
 		  	(public abstract)void display(); → 선언만 함
 		  	
 		  	구현
 		  	(public)default void aaa()
 		  	{
 		  	}
 		  }
 		  =====> 사용하기 위해서는 상속을 내리고 하위클래스를 통해서 메모리 할당 후 사용
 		  interface A
 		  class B implements A
 		  => A a = new B();
 		 
 */
import java.util.List;
import com.sist.manager.GenieMusicVO;

public interface HomeInterface {
	public void cardPrint(List<GenieMusicVO> list);
	public void cardInit(List<GenieMusicVO> list);
}
