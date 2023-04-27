package com.sist.lang;
/*
 * 		StringBuffer
 * 		1. String은 고정형 => 변경되면 새로운 메모리 생성(=>원본은 그대로 유지)
 * 			ㄴ변경시에 리턴형이 String
 * 		2. String을 보완 => 가변형 : StringBuffer(비동기) / StringBuilder(동기)
 * 			프로그램에서 동기 / 비동기
 * 				-비동기 : 동시에 여러개 수행
 * 				-동기 : 한개씩 수행 (=>동작하다 멈추면 다음 일 수행 못함)
 * 		3. 데이터가 많은 경우 => 문자열 결합(append)
 * 		4. 문자열 처리
 * 		5. 처리 속도가 빠르다
 * 		6. 주요 메소드
 * 			-length() : 문자 갯수
 * 			-toString() : 객체를 문자열로 변환
 * 						  ---------------> (String)=>형변환, String.valueOf()
 * 			-delete() : 삭제
 * 			-append()*** : 문자열 결합
 */
import java.io.*;
import java.net.*;
// ↑ 클래스가 CheckedException => 반드시 예외처리
public class 라이브러리_StringBuffer {

	public static void main(String[] args) {
		try {
			StringBuffer sb = new StringBuffer(); // Buffer : 임시 기억장소
			URL url = new URL("https://www.10000recipe.com/recipe/list.html");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection(); //서버에 연결
			
			if(conn!=null) //연결됐다면
			{
				while(true)
				{
					BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
					String msg = br.readLine();
					
					if(msg==null)
						break;
					
					sb.append(msg+"\n");
				}
				conn.disconnect(); //서버 연결 해제
			}
			System.out.println(sb.toString());
		}catch(Exception ex) {ex.printStackTrace();}

	}

}
