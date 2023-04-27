package com.sist.program;
/* VO -> DAO -> 전송
 * ↑관련된 데이터는 무조건 묶어서 보낸다
 */
import java.util.*;
import java.io.*;
public class SeoulSystem {
	// 모든 사용자가 데이터를 공통으로 사용해야함
	private static SeoulLocationVo[] datas = new SeoulLocationVo[273];
	private int curpage; // 프로그램 종료시까지 유지~
	private int totalpage;
	
	static 
	{
		//데이터 읽어와서 메모리에 저장
		try
		{
			StringBuffer sb = new StringBuffer();
			int i = 0;
			FileReader fr = new FileReader("c:\\javaDev\\seoul_location.txt");
			while((i=fr.read())!=-1)
			{
				sb.append(String.valueOf((char)i));
			}
			fr.close();
			
			String[] locations = sb.toString().split("\n");
			
			int k=0;
			for(String s:locations)
			{
				StringTokenizer st = new StringTokenizer(s, "|");
				datas[k] = new SeoulLocationVo();
				datas[k].setNo(Integer.parseInt(st.nextToken()));
				datas[k].setName(st.nextToken());
				datas[k].setContent(st.nextToken());
				datas[k].setAddress(st.nextToken());
				k++;
			}
			
		}catch(Exception ex) {}
	}
	
	//페이지별 데이터 출력
	public SeoulLocationVo[] seoulList(int page)
	{
		SeoulLocationVo[] data = new SeoulLocationVo[10];
		int j = 0; // 10개씩 나눠주는 변수
		int k = 0;
		int start = (page*10)-10;
		
		for(int i=0;i<datas.length;i++)
		{
			if(j<10 && i>=start)
			{
				data[k] = datas[i];
				k++;
				j++;
			}
		}
		return data;
	}
	public int seoulTotalPage()
	{
		return (int)(Math.ceil(datas.length/10.0));
	}
	
	//메뉴
	public int menu()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("============== 메뉴 ==============");
		System.out.println("　　　 1. 목록 출력(페이지별)");
		System.out.println("　　　 2. 상세보기");
		System.out.println("　　　 3. 명소 검색");
		System.out.println("　　　 4. 주소 검색");
		System.out.println("　　　 9. 종료");
		System.out.println("================================");
		System.out.print("메뉴를 선택하세요 : ");
		return scan.nextInt();
	}
	
	//검색 -> 이름별로 검색
	public SeoulLocationVo[] nameFind(String fd)
	{
		int count = 0;
		for(SeoulLocationVo vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				count++; //찾은 갯수만큼의 배열 생성
			}
		}
		SeoulLocationVo[] seoul = new SeoulLocationVo[count];
		
		int i = 0;
		for(SeoulLocationVo vo:datas)
		{
			if(vo.getName().contains(fd))
			{
				seoul[i] = vo;
				i++;
			}
		}
		return seoul;
	}
	
	//주소 검색
	public SeoulLocationVo[] addressFind(String addr)
	{
		int count = 0;
		for(SeoulLocationVo vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				count++; //찾은 갯수만큼의 배열 생성
			}
		}
		SeoulLocationVo[] seoul = new SeoulLocationVo[count];
		
		int i = 0;
		for(SeoulLocationVo vo:datas)
		{
			if(vo.getAddress().contains(addr))
			{
				seoul[i] = vo;
				i++;
			}
		}
		return seoul;
	}
	
	//상세보기
	
	
	public void process()
	{
		while(true)
		{
			int menu = menu();
			if(menu==9)
			{
				System.out.println("프로그램 종료!");
				break;
			}
			else if(menu==1)
			{
				Scanner scan = new Scanner(System.in);
				while(true)
				{
					System.out.print("출력할 페이지를 입력하세요(1~28) : ");
					curpage = scan.nextInt();
					if(curpage<1 || curpage>28)
					{
						System.out.println("페이지를 잘못 입력하였습니다");
						continue;
					}
					break;
				}
				totalpage = seoulTotalPage();
				System.out.println(curpage+" page / "+totalpage+" pages");
				SeoulLocationVo[] data = seoulList(curpage);
				for(SeoulLocationVo vo:data)
				{
					if(vo!=null) //null이 아닌 값만 출력하게
					{
					System.out.println(vo.getNo()+". "+vo.getName());
					}
				}
			}
			else if(menu==2)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("상세 보기 할 명소 번호를 입력하세요(1~273) : ");
				int no = scan.nextInt();
				
				System.out.println("no."+datas[no-1].getNo()+" "+datas[no-1].getName());
				System.out.println("주소 : "+datas[no-1].getAddress());
				System.out.println("소개 : "+datas[no-1].getContent());
			}
			else if(menu==3)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어를 입력하세요 : ");
				String name = scan.next();
				
				SeoulLocationVo[] data = nameFind(name);
				System.out.println("'"+name+"'의 검색 결과 총 "+data.length+"건");
				
				for(SeoulLocationVo vo:data)
				{
					System.out.println(vo.getNo()+". "+vo.getName());
				}
			}
			else if(menu==4)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("주소를 입력하세요 : ");
				String addr = scan.next();
				
				SeoulLocationVo[] data = addressFind(addr);
				System.out.println("'"+addr+"'의 검색 결과 총 "+data.length+"건");
				
				for(SeoulLocationVo vo:data)
				{
					System.out.println(vo.getNo()+". "+vo.getName());
				}
			}
		}
	}

}
