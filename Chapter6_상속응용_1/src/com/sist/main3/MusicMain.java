package com.sist.main3;
import java.util.*;
public class MusicMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("선택(Genie(1), Melon(2)) : ");
		int select = scan.nextInt();
		// 상속 => 클래스 통합할 수 있다
		/*
		 * 	상속
		 * 	=> 객체 생성
		 * 	=> 상위 클래스 = 하위 클래스
		 */
		GenieMusicSystem ms = null;
		if(select==1)
			ms = new GenieMusicSystem();
		else
			ms = new MelonMusicSystem();
		
		//1. 목록 출력
		Music[] music = ms.musicAllData();
		for(Music m:music)
		{
			System.out.println(m.getRank()+"."+m.getTitle());
		}
	}

}
