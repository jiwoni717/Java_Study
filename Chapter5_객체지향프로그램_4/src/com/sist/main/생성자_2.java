package com.sist.main;
/*
 * 		초기화
 * 		1. 디폴트 값
 * 			int => 0, String => null...
 * 			class A
 * 			{
 * 				int a;
 * 			}
 * 		2. 명시적 초기화 : 직접 값을 설정
 * 			class A
 * 			{
 * 				int a = 10;
 * 			}
 * 		3. 생성자 초기화
 * 			class A
 * 			{
 * 				int a;
 * 				A() {
 * 					a=100;
 * 				}
 * 			}
 * 		4. 초기화 블록
 * 			class A
 * 			{
 * 				int a;
 * 				{
 * 					a=1000;
 * 				}
 * 			}
 * 			
 * 			디폴트 => 명시적 초기화 => 초기화 블록 => 생성자
 * 			=> 동시에 사용하지 않음(동시에 사용하면 결과적으로 생성자로 저장한 값이 저장됨)
 */
/*class Student {
	int hakbun = 10;
	String name;
	
	{
		hakbun = 100; // 연산처리, 제어문, 파일 읽기... 할 때 사용
	}
	
	Student() {
		hakbun = 1000;
	}
}*/
class Student {
	int hakbun;
	String name;
	public Student() {
		System.out.println("Student() Call...");
		hakbun = 1;
		name = "홍길동";
	}
	Student(int h, String n) // => 값을 다 다르게 저장 가능
	{
		hakbun = h;
		name = n;
	}
}
public class 생성자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		System.out.println(s.hakbun);
		System.out.println(s.name);
		// 생성자 호출시에는 반드시 new가 앞에 붙어야한다
		// Student(); => 오류
		new Student();
		
		Student s1 = new Student();
		System.out.println(s1.hakbun);
		System.out.println(s1.name);
		
		Student s2 = new Student(2, "심청이");
		Student s3 = new Student(3, "박문수");
		
		System.out.println(s2.hakbun);
		System.out.println(s2.name);
		
		System.out.println(s3.hakbun);
		System.out.println(s3.name);

	}

}
