package com.sist.music;
import java.util.Scanner;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms = new MusicSystem(); // Music 데이터 담아둔다
		ms.init(); // 값 채워줌
		while(true)
		{
			int menu = ms.menu(); // 상세보기 보여줌
			if(menu==9)
			{
				System.out.println("프로그램 종료!!");
				break;
			}
			else if(menu==1)
			{
				Music[] mm = ms.musicListData();
				for(int i=0;i<50;i++)
				{
					System.out.println((i+1)+"."+mm[i].title);
				}
				System.out.println("=======================");
			}
			else if(menu==2)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("검색어를 입력하세요 : ");
				String fd = scan.next();
				Music[] mm = ms.musicFindData(fd);
				for(int i=0;i<mm.length;i++)
				{
					System.out.println((i+1)+"."+mm[i].title);
				}
			}
			else if(menu==3)
			{
				Scanner scan = new Scanner(System.in);
				System.out.print("노래 번호 선택(1~50) : ");
				int no = scan.nextInt();
				Music mm = ms.musicDetailDate(no);
				System.out.println("곡명 : "+mm.title);
				System.out.println("가수명 : "+mm.singer);
				System.out.println("앨범 : "+mm.album);
				String s = mm.state;
				if(s.equals("유지"))
					s="-";
				else if(s.equals("상승"))
				{
					s="▲"+mm.modify;
				}
				else if(s.equals("하강"))
				{
					s="▽"+mm.modify;
				}
				System.out.println("등폭 : "+s);

			}
		}
		
	}

}
