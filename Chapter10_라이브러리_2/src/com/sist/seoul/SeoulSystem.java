package com.sist.seoul;
import java.io.FileReader;
import java.util.*;

import javax.xml.parsers.FactoryConfigurationError;
public class SeoulSystem {
	private static ArrayList list = new ArrayList();
	//파일 읽기
	static {
		try
		{
			FileReader fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer sb = new StringBuffer();
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close();
			
			String[] seoul = sb.toString().split("\n"); // 한줄씩 나누기
			for(String s:seoul)
			{
				StringTokenizer st = new StringTokenizer(s, "|"); // |로 나누기
				SeoulVO vo = new SeoulVO();
				vo.setNo(Integer.parseInt(st.nextToken()));
				vo.setName(st.nextToken());
				vo.setContent(st.nextToken());
				vo.setLocation(st.nextToken());
				list.add(vo);
			}
		}catch(Exception ex){}
	}
	
	//메뉴
	public int seoulMenu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("========== 메뉴 ==========");
		System.out.println("      1. 목록 출력");
		System.out.println("      2. 상세보기 출력");;
		System.out.println("      9. 프로그램 종료");
		System.out.println("=========================");
		System.out.print("메뉴를 선택하세요 : ");
		return scan.nextInt();
	}
	
	//목록 출력(페이지)
	public ArrayList seoulData(int page)
	{
		int totalpage = (int)(Math.ceil(list.size()/10.0));
		int start = (page-1)*10;
		int end = page*10;
		if(page==totalpage)
		{
			end = list.size();
		}
		ArrayList seoulList = new ArrayList(list.subList(start, end));
		
		return seoulList;
	}
	
	//상세 보기
	public SeoulVO seoulDetailData(int no)
	{
		return (SeoulVO)list.get(no-1);
		
	}
	
	
	public void process()
	{
		while(true)
		{
			int menu = seoulMenu();
			if(menu==9)
			{
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(menu==1)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("출력할 페이지를 입력하세요(1~28) : ");
				int page = scan.nextInt();
				ArrayList sList = seoulData(page);
				for(int i=0;i<sList.size();i++)
				{
					SeoulVO vo = (SeoulVO)sList.get(i);
					System.out.println(vo.getNo()+". "+vo.getName());
				}
			}
			else if(menu==2)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("상세보기 할 명소 번호를 입력하세요(1~273) : ");
				int no = scan.nextInt();
				SeoulVO vo = seoulDetailData(no);
				System.out.println("============ 상세 보기 ============");
				System.out.println("No. "+vo.getNo()+" "+vo.getName());
				System.out.println(vo.getContent());
				System.out.println("　주소 : "+vo.getLocation());
			}
		}
		
	}

}
