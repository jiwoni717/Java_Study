package com.sist.main3;

import javax.lang.model.util.Elements;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class GenieMusicSystem {
	protected Music[] musics = new Music[50];
	protected String title="지니뮤직 Top50";
	
	// 1. 초기화
	/*
	 * 	인스턴스 블록
	 *  static 블록*
	 *  ------------- 자동 호출
	 *  생성자
	 *  
	 *  예외처리
	 *  1. 에러 => 소스상에서 처리할 수 없는 심각한 에러
	 *  		  ex) 메모리 공간 부족
	 *  2. 예외 => 수정이 가능한 가벼운 에러
	 *  	예외복구 / 예외회피
	 *  	=> 비정상 종료를 방지하고 정상 수행이 가능토록
	 *  	=> 에러 나는 이유 : 사용자 입력 / 프로그래머의 실수
	 *  	io, net, thread, web => 예외처리를 반드시 필요로 함~
	 *  		ㄴio : 파일 경로명, 파일명
	 *  		ㄴnet : IP / URL
	 *  		ㄴthread : 충돌
	 *  		ㄴweb : 404 / 500(소스상의 에러) / 403 / 400(다른 데이터형)... 많음
	 */
	{
		try
		{
			Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get(); // 문서 저장 공간 => HTML
			/*
			 * 	HTML => Tag => Markup language
			 *  Element => tag
			 *  Elements => 같은 태그 여러개를 모아준것
			 */
			// 노래명
			// 구분자 => 모든 태그 class(중복) / id(중복이 없다)
			// class => . id => #
			org.jsoup.select.Elements title = doc.select("table.list-wrap td.info a.title");
			// 가수명
			org.jsoup.select.Elements singer = doc.select("table.list-wrap td.info a.artist");
			// 앨범명
			org.jsoup.select.Elements album = doc.select("table.list-wrap td.info a.albumtitle");
			
			org.jsoup.select.Elements etc = doc.select("table.list-wrap td.number span");
			for(int i=0;i<title.size();i++)
			{
				String s = etc.get(i).text();
				String state = "";
				String value = "";
				
				if(s.equals("유지"))
				{
					state = "유지";
					value = "0";
				}
				
				else
				{
					state = s.replaceAll("[0-9]", "");
					value = s.replaceAll("[가-힣]", "");
					/*
					 * 	split
					 * 	replaceAll
					 * 	------------- 정규식 (한글형태, 숫자형태 => 패턴)
					 * 	[0-9] => 숫자 전체
					 * 	[가-힣] => 한글 전체
					 * 	[A-Za-z] => 알파벳 전체
					 */
				}
				
				musics[i] = new Music();
				musics[i].setRank(i+1);
				musics[i].setTitle(title.get(i).text());
				musics[i].setSinger(singer.get(i).text());
				musics[i].setAlbum(album.get(i).text());
				musics[i].setState(state);
				musics[i].setIdcrment(value);
			}
		}catch(Exception ex){}//←예외복구
		
	}
	
	// 2. 기능
	// 2-1. 목록 출력
	public Music[] musicAllData()
	{
		return musics;
	}
	
	/*
	 * 		결과값을 전송? : 리턴형
	 * 		자체에서 출력? : void
	 */
	
	// 2-2. 검색 => type 1 -> title / type 2 -> singer / typ3 3 -> album...
	public Music[] musicFind(String fd, int type)
	{
		int i = 0;
		for(Music m:musics)
		{
			boolean bCheck = false;
			if(type == 1)
			{
				bCheck = m.getTitle().contains(fd);
				if(bCheck==true)
					i++;
			}
			else
			{
				bCheck = m.getSinger().contains(fd);
				if(bCheck==true)
					i++;
			}
		}
		Music[] mm = new Music[i];
		i = 0;
		for(Music m:musics)
		{
			boolean bCheck = false;
			if(type == 1)
			{
				bCheck = m.getTitle().contains(fd);
			}
			else
			{
				bCheck = m.getSinger().contains(fd);
			}
			
			if(bCheck == true)
			{
				mm[i] = m;
				i++;
			}
		}
		return mm;
		
	}
	public static void main(String[] args) {
		GenieMusicSystem g = new GenieMusicSystem();
		Music[] aa = g.musicFind("지", 1);
		for(Music a:aa)
		{
			System.out.println(a.getTitle());
		}
	}
	
}
