package com.sist.lang;
// delete, insert
public class 라이브러리_StringBuffer_1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("홍길동입니다");
		sb.delete(3, 6); // delete(int s, int e) => e-1까지 자름
		System.out.println(sb.toString());
		
		sb.insert(3, "입니다");
		System.out.println(sb.toString());
		// ↑ insert, delete => 자체 변경 가능(원본이 바뀜)
		System.out.println(sb.substring(3)); // substring은 자체 변경이 되지 않음(원본이 바뀌지 않음), 새로운 메모리에 저장해서 사용

	}

}
