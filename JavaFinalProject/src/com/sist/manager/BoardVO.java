/*
		클래스
		 데이터만 관리
		  ~VO / ~DTO
		 기능 처리
		  ~Manager / ~System / ~DAO / ~Service
 */
package com.sist.manager;

import java.io.Serializable;
import java.util.*; 

public class BoardVO implements Serializable{
	private int no; // 중복이 없게
	private String name;
	private String subject;
	private String content;
	private String pwd; //본인 여부 확인
	private Date regdate;
	private int hit;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
}
