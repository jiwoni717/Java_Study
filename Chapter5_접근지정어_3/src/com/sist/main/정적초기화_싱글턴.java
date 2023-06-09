package com.sist.main;
class Member {
	private String name; // 메모리에 읽기/쓰기
	private static Member mem;
	
	//메모리에 저장된 데이터 읽기
	public String getName() {
		return name;
	}
	//메모리에 저장
	public void setName(String name) {
		this.name = name;
	}
	
	public static Member newInstance()
	{
		if(mem==null)
			mem=new Member();
		return mem;
	}
	
}
public class 정적초기화_싱글턴 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = Member.newInstance();
		m1.setName("홍길동");
		System.out.println("m1 = "+m1);
		Member m2 = Member.newInstance();
		m2.setName("심청이");
		System.out.println("m2 = "+m2);
		Member m3 = Member.newInstance(); // m1, m2, m3가 다 같은 객체
		m3.setName("박문수");
		System.out.println("m3 = "+m3);
		
		System.out.println(m1.getName()+" "+m2.getName()+" "+m3.getName()+" ");
	}

}
