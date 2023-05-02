package com.sist.io2;
import java.util.*;
import java.awt.image.BufferedImage;
import java.io.*;
public class StudentSystem {
	// 모든 학생을 읽어서 메모리에 저장
	private static List<Student> stdList = new ArrayList<Student>();
	
	// 파일 불러오기
	static
	{
		FileReader fr = null;
		try {
			fr = new FileReader("c:\\java_datas\\school.txt");
			StringBuffer sb = new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			
			String[] stds = sb.toString().split("\n");
			for(String ss:stds)
			{
				StringTokenizer st = new StringTokenizer(ss,"|");
				Student s = new Student();
				s.setHakbun(Integer.parseInt(st.nextToken()));
				s.setName(st.nextToken());
				s.setKor(Integer.parseInt(st.nextToken()));
				s.setEng(Integer.parseInt(st.nextToken()));
				s.setMath(Integer.parseInt(st.nextToken()));
				int total = s.getKor()+s.getEng()+s.getMath();
				s.setTotal(total);
				s.setAvg(total/3.0);
				stdList.add(s);
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			try {
			fr.close();
			}catch(Exception ex) {}
		}
	}
	
	// 메뉴
	public int menu()
	{
		System.out.println("======== 메뉴 ========");
		System.out.println("    1. 학생 목록");
		System.out.println("    2. 학생 등록");
		System.out.println("    3. 학생 정보 수정");
		System.out.println("    4. 학생 삭제");
		System.out.println("    5. 프로그램 종료");
		System.out.println("=====================");
		int no = 0;
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // 키보드값 읽기 => Scanner 대체
			System.out.print("메뉴 번호 입력 : ");
			String str = in.readLine();
			no = Integer.parseInt(str);
		}catch(Exception ex) {}
		return no;
	}
	
	public void process()
	{
		while(true)
		{
			int no = menu();
			if(no==5)
			{
				System.out.println("프로그램을 종료합니다.");
				FileWriter fw = null;
				// 종료하기 전에 새로 등록한 학생 값 저장
				try{
					fw = new FileWriter("c:\\java_datas\\school.txt");
					// 자바 프로그램과 파일 연결 => 스트림(출력 스트림)
					String temp = "";
					for(Student ss:stdList)
					{
						temp+=ss.getHakbun()+"|"+ss.getName()+"|"+ss.getKor()+"|"+ss.getEng()+"|"+ss.getMath()+"\n";
					}
					fw.write(temp);
				}catch(Exception ex){
					ex.printStackTrace();
				}
				finally{
					try
					{
						fw.close();
					}catch(Exception ex) {}
				}
				break;
			}
			
			// 학생 목록
			else if(no==1)
			{
				for(Student ss:stdList)
				{
					int total = ss.getKor()+ss.getEng()+ss.getMath();
					ss.setTotal(total);
					ss.setAvg(total/3.0);
					
					System.out.println(ss.getHakbun()+"번 "
							+ss.getName()+" "
							+ss.getKor()+"점 "
							+ss.getEng()+"점 "
							+ss.getMath()+"점 "
							+ss.getTotal()+"점 "
							+String.format("%.2f", ss.getAvg())
							);
				}
			}
			
			// 학생 등록
			else if(no==2)
			{
				try {
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("이름 입력 : ");
					String name = in.readLine();
					System.out.print("국어 점수 입력 : ");
					String kor = in.readLine();
					System.out.print("영어 점수 입력 : ");
					String eng = in.readLine();
					System.out.print("수학 점수 입력 : ");
					String math = in.readLine();
					
					//시퀀스 -> 자동 증가 번호 만들기 -> 구분자
					int max=0;
					for(Student ss:stdList)
					{
						if(ss.getHakbun()>max)
						{
							max=ss.getHakbun();
						}
					}
					
					Student s = new Student();
					s.setName(name);
					s.setHakbun(max+1);
					s.setKor(Integer.parseInt(kor));
					s.setEng(Integer.parseInt(eng));
					s.setMath(Integer.parseInt(math));
					
					stdList.add(s);
					
				}catch(Exception ex) {}
			}
			
			// 학생 삭제
			else if(no==4)
			{
				try
				{
					BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
					System.out.print("삭제할 학생의 학번을 입력하세요 : ");
					String hak = in.readLine();
					for(Student ss:stdList)
					{
						if(ss.getHakbun()==Integer.parseInt(hak))
						{
							stdList.remove(ss);
							break;
						}
					}
				}catch(Exception ex) {}
			}
		}
	}
}
