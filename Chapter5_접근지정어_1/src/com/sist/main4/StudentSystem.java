package com.sist.main4;
import com.sist.main3.Student;
// 패키지명이 다르면 사용시에 반드시 import 사용
import java.util.Scanner;
public class StudentSystem {
	private Student[] std = new Student[3];
	/*
	 * 	명시적 초기화 => 객체 생성시 모든 객체값이 동일
	 * 	-----------------------------------
	 * 	생성자 이용
	 * 	초기화 블록
	 * 	메소드
	 * 	------------------ 입력값을 받거나 외부에서 데이터 읽어오기(=> 크롤링, 파일 읽기)
	 */
	// 1. 학생 초기화
	public void init() {
		Scanner scan = new Scanner(System.in);
		for(int i = 0;i<std.length;i++)
		{
			std[i] = new Student(); // 배열은 모든 저장 공간이 null값 => 메모리 연결 꼭 할 것
			System.out.print("학번 입력 : ");
			std[i].setHakbun(scan.nextInt());
			System.out.print("이름 입력 : ");
			std[i].name = scan.next();
			System.out.print("성별 입력 : ");
			std[i].setSex(scan.next());
			System.out.print("국어, 영어, 수학 점수 입력(80 90 80) : ");
			std[i].setKor(scan.nextInt());
			std[i].setEng(scan.nextInt());
			std[i].setMath(scan.nextInt());
		}
	}
	// 1-1 출력
	public void display() { // default => com.sist.main4안에서만 접근 가능
		for(Student s:std)
		{
			System.out.println("학번 : "+s.getHakbun()+" / 이름 : "+s.name+" / 성별 : "+s.getSex()+
					" / 국어 : "+s.getKor()+"점 / 영어 : "+s.getEng()+"점 / 수학 : "+s.getMath()+"점 / 총점 : "
					+s.getTotal()+"점 / 평균 : "+s.getAvg()+"점 / 학점 : "+s.getScore()+" / 순위 : "+s.getRank()+"등");
		}
	}
	
	// 2. 총점 구하기
	public void stdTotal() {
		for(int i=0;i<std.length;i++)
		{
			std[i].setTotal(std[i].getKor()+std[i].getEng()+std[i].getMath());
		}
	}
	
	// 3. 평균 구하기
	public void stdAvg() {
		for(int i=0;i<std.length;i++)
		{
			std[i].setAvg(std[i].getTotal()/3.0); // 비공개
			// std[i].avg = std[i].getTotal()/3.0 => 공개
		}
	}
	
	// 4. 학점 구하기
	public void stdScore() {
		char c = 'A';
		for(int i=0;i<std.length;i++)
		{
			switch((int)(std[i].getAvg())/10)
			{
			case 10:
			case 9:
				c = 'A';
				break;
			case 8:
				c = 'B';
				break;
			case 7:
				c = 'C';
				break;
			case 6:
				c = 'D';
				break;
			default:
				c = 'F';
			}
			std[i].setScore(c);
		}
	}
	
	// 5. 등수 구하기
	public void stdRank() {
		for(int i=0;i<std.length;i++)
		{
			std[i].setRank(1);
			for(int j=0;j<std.length;j++)
			{
				if(std[i].getTotal()<std[j].getTotal())
				{
					std[i].setRank(std[i].getRank()+1);
				}
			}
		}
	}
}
