package com.sist.main;
import static java.lang.Math.random;
/*
 *  import 패키지명.클래스명
 *  import 패키지명.* => 3개 이상 쓰면 그냥 *
 *  import static java.lang.~
 *  java.lang.* => 자동 로딩이 된다 => import를 사용하지 않아도 됨
 *  ------------ String, Math
 *  
 *  void Method()
 *  {
 *  	return; => 자동 설정(생략 가능) => void에서만
 *  	==> 중간에 존재할 때도 있음(빠져나갈 때)
 *  }
 *  class A
 *  {
 *  	A(){}
 *  }
 */
//Math클래스는 지원하는 모든 메소드가 static
public class 클래스_메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		if(a%2==0)
		{
			System.out.println("a = "+a);
			return;
		}
		
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
	}

}
