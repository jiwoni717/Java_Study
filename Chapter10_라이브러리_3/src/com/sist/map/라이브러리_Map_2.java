package com.sist.map;
import java.util.*;

class A
{
	public void execute()
	{
		System.out.println("A:execute() Call...");
	}
}

class B
{
	public void execute()
	{
		System.out.println("B:execute() Call...");
	}
}

class C
{
	public void execute()
	{
		System.out.println("C:execute() Call...");
	}
}
// 클래스 관리(==> Spring)
class Container
{
	// 하나로 묶기
	Map map = new HashMap();

	public Container()
	{
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
	}
	
	public Object getBean(String key)
	{
		return map.get(key);
	}
}

public class 라이브러리_Map_2 {

	public static void main(String[] args) {
		Container c = new Container();
		
		// 싱글턴 => 메모리 누수현상 방지 (한개의 객체로 재사용)
		A aa = (A)c.getBean("a");
		aa.execute();
		
		A bb = (A)c.getBean("a");
		bb.execute();
		
		System.out.println("aa = "+aa);
		System.out.println("bb = "+bb);
	}

}
