package com.sist.music;
import java.util.Scanner;

public class MusicSystem {
	Music[] music = new Music[50]; // null값 => 배열 생성만한거임(=메모리 할당x)
	
	// 1. 메소드로 값을 채워줌 => 생성자
	void init()
	{
		/*
		 * 	인스턴스 : 객체 생성 => 객체명.변수, 배열...
		 * 	static : 클래스명.배열명...
		 */
		for(int i=0;i<MusicData.title.length;i++)
		{
			music[i] = new Music(); // Music크기의 메모리 공간을 50개 만들어줌
			music[i].title = MusicData.title[i];
			music[i].singer = MusicData.singer[i];
			music[i].album = MusicData.album[i];
			music[i].state = MusicData.state[i];
			music[i].modify = MusicData.modify[i];
		}
		
	}
	
	int menu() {
		System.out.println("============ Menu ============");
		System.out.println("    1. 목록보기");
		System.out.println("    2. 검색");
		System.out.println("    3. 상세보기");
		System.out.println("    9. 프로그램 종료");
		System.out.println("==============================");
		Scanner scan = new Scanner(System.in);
		System.out.print("메뉴를 선택하세요 : ");
		return scan.nextInt();
	}
	
	Music[] musicListData()
	{
		return music;
	}
	
	Music musicDetailDate(int no)
	{
		return music[no-1];
	}
	
	Music[] musicFindData(String title)
	{
		int count = 0;
		for(Music mm:music)
		{
			if(mm.title.contains(title))
			{
				count++;
			}
		}
		Music[] m = new Music[count];
		int i = 0;
		for(Music mm:music)
		{
			if(mm.title.contains(title))
			{
				m[i]=mm;
				i++;
			}
		}
		return m;
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MusicSystem ms = new MusicSystem();
		ms.init();
		Scanner scan = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String title = scan.next();
		Music[] data = ms.musicFindData(title);
		int i=1;
		for(Music m : data)
		{
			System.out.println(i+"."+m.title);
			i++;
		}
		
		System.out.println("=================================");
		System.out.print("상세보기(1~50) : ");
		int no = scan.nextInt();
		Music mm = ms.musicDetailDate(no);
		System.out.println("곡명 : "+mm.title);
		System.out.println("가수명 : "+mm.singer);
		System.out.println("앨범 : "+mm.album);
		System.out.println("상태 : "+mm.state);
		System.out.println("변동폭 : "+mm.modify);
	}*/
}
