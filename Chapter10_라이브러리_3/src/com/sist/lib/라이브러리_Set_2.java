package com.sist.lib;
/*
 * 		객체 비교
 * 		 ┌ 메모리 주소(default)
 * 		 └ 실제 저장된 값(오버라이딩)
 */
import java.util.*;
class Student {
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
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return (name+age).hashCode(); // hashCode가 같으면 같은 객체 다르면 다른 객체로 인식
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student)
		{
			Student s = (Student)obj; //형변환
			return name.equals(s.name) && age == s.age;
		}
		return false; // ↑ 비교해서 같은 값이면 true 아니면 false
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"("+age+"세)";
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}
public class 라이브러리_Set_2 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		// equals 오버라이딩해서 같은 값으로 인식함..
		
		Student s1 = new Student("홍길동", 25);
		Student s2 = new Student("홍길동", 25);
		
		if(s1.equals(s2))
		{
			System.out.println("s1==s2");
		}
		else
		{
			System.out.println("s1!=s2");
		}
		
		set.add(s1);
		set.add(s2);
		
		System.out.println(set);
	}

}
