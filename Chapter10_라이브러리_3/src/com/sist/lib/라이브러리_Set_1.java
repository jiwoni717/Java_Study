package com.sist.lib;
import java.util.*;

class Person implements Cloneable {
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//오버라이딩
	public String toString()
	{
		return name+"("+age+"세)";
	}
	
	//복제 -> 새로운 메모리를 만들어서 사용
	@Override
	protected Object clone() throws CloneNotSupportedException { //예외처리
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//매개변수 생성자
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
}

public class 라이브러리_Set_1 {

	public static void main(String[] args) throws Exception { // 회피
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		// 주소값이 다르기 때문에 다른 객체로 인식한다
		Person p1 = new Person("홍길동", 25);
		Person p2 = new Person("홍길동", 25);
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		
		Person p3 = p1; // p1과 주소 같아서 저장 안됨
		System.out.println("p3 = "+p3);
		
		Person p4 = (Person)p1.clone(); // 새로운 메모리를 만들어 복제했기 때문에 저장 됨
		System.out.println("p4 = "+p4);
		
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set);
	}

}
