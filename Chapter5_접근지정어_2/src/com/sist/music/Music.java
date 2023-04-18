package com.sist.music;
/*
 * 		1. 재사용
 * 			= 상속 => is-a
 * 				기존의 클래스를 확장해서 사용
 * 				자바는 단일 상속만 가능하다
 * 				class A
 * 				class B extends A
 * 				-----------------------------
 * 				class A
 * 				class B
 * 				class C extends A, B => 오류
 * 				C = A+B+알파
 * 				class A
 * 				class B extends A
 * 				class C extends B
 * 				-----------------------------
 * 				class A(int a, b, c, d) 16byte
 * 				class B(int a, b) 8byte
 * 				A > B
 * 				-------- A와 B는 다른 클래스 => 크기를 가지지 않는다
 * 				상속 내리는 클래스가 더 큼
 * 				모든 클래스는 Objects 상속을 받고 있다
 * 						 ---------> 모든 클래스의 최상위 클래스
 * 				상속의 예외 조건
 * 					생성자, static, private, 초기화 블록은 상속이 안됨
 * 
 * 			= 포함 => has-a
 * 				
 */
public class Music {
	private int rank;
	private String state;
	private String title;
	private String singer;
	private String album;
	private int idcrement;
	
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getIdcrement() {
		return idcrement;
	}
	public void setIdcrement(int idcrement) {
		this.idcrement = idcrement;
	}
}
