package com.sist.main4;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man = new Human();
		man.setName("심청이");
		System.out.println(man.getName());
		Student s = new Student();
		s.setName("박문수");
		System.out.println(s.getName());
		System.out.println(man.getName());
	}

}
