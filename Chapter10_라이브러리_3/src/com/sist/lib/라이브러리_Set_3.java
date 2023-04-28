package com.sist.lib;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.select.Elements;
public class 라이브러리_Set_3 {
	
	public static Set genieMusic()
	{
		Set set = new HashSet();
		
		try {
			for(int i=1;i<=2;i++)
			{
				org.jsoup.nodes.Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20230428&hh=11&rtm=Y&pg="+i).get();
				Elements title = doc.select("table.list-wrap a.title");
				for(int j=0;j<title.size();j++)
				{
					set.add(title.get(j).text());
				}
			}
		}catch(Exception ex) {}
		
		return set;
	}
	
	public static Set melonMusic()
	{
		Set set = new HashSet();
		
		try {
			org.jsoup.nodes.Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("div.wrap_song_info div.rank01 a");
			for(int i=0;i<title.size();i++)
			{
				set.add(title.get(i).text()); // 텍스트만 꺼내서 리스트로 저장
			}
		}catch(Exception ex) {}
		
		return set;
	}
	
	public static void main(String[] args) {
		//지니 뮤직 읽기
		Set genie = genieMusic();
		
		//멜론 읽기
		Set melon = melonMusic();
		
		//지니 뮤직만 가지고 있는 음악 찾기
/*		genie.removeAll(melon); // 같은값 제거
		for(Object obj:genie)
		{
			System.out.println(obj.toString());
		}
		*/
		
		// 교집합
		melon.retainAll(genie);
		for(Object obj:melon)
		{
			System.out.println(obj.toString());
		}
	}

}
