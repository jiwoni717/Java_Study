/*
 * 		equals => Object에서는 객체 비교 String에서는 문자열 비교
 * 		Object의 equals는 무조건 오버라이딩 시켜야하기 때문에 사용빈도↓
 */
package com.sist.lib;

class Student2 {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Student2(String name)
	{
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student2)
		{
			Student2 s = (Student2)obj;
			return name == s.name; //*** 문자열 비교 
		}
		else
			return false;
	}
	
	public void print()
	{
		System.out.println("이름 : "+name);
	}
	
}

public class 라이브러리_Object_4 {

	public static void main(String[] args) {
		Student2 s1 = new Student2("홍길동");
		Student2 s2 = new Student2("홍길동");
		
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		if(s1==s2)
		{
			System.out.println("s1과 s2는 같습니다");
		}
		else
			System.out.println("s1과 s2는 같지 않습니다");
		
		if(s1.equals(s2))
		{
			System.out.println("s1과 s2는 같습니다");
		}
		else
			System.out.println("s1과 s2는 같지 않습니다");
		
		s1.print();
		new Student2("박문수").print();
		
		"Hello".length();
	}

}
