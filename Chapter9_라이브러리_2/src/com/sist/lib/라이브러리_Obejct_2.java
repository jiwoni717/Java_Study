/*
 * 		clone() : 복제할 때(메모리가 새롭게 생성)
 */
package com.sist.lib;
class Sawon implements Cloneable{
	private int sabun;
	private String name;
	
	public int getSabun() {
		return sabun;
	}

	public void setSabun(int sabun) {
		this.sabun = sabun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Sawon(int sabun, String name)
	{
		//지역변수 우선순위
		//this는 자신의 객체 => static 변수, 모든 클래스는 this를 가지고 있다
		this.sabun = sabun;
		this.name = name;
	}
	
	//재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public void print()
	{
		System.out.println("사번 : "+sabun+", 이름 : "+name);
	}
	
}

public class 라이브러리_Obejct_2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Sawon s1 = new Sawon(1, "홍길동");
		s1.print();
		Sawon s2 = s1; // 참조 => 같은 주소
		s2.print();
		s1.setSabun(2);
		s1.setName("심청이");
		System.out.println("s1 = "+s1+", s2 = "+s2);
		
		//복제
		Sawon s3 = (Sawon)s1.clone();
		s3.print();
		System.out.println("s1 = "+s1+", s3 = "+s3);
		s3.setSabun(3);
		s3.setName("박문수");
		s3.print();
		s1.print();
		s2.print();
	}

}
