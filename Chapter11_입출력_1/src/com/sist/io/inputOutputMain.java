package com.sist.io;
/*
  		CheckedException => 반드시 예외처리를 해야 사용 가능
  		
  		IO : Input(읽기) / Output(쓰기)
  		 1) 자바에서 IO는 Stream을 사용하고 있다
  		 2) 읽기/쓰기(1byte, 2byte)
  		  -바이트 스트림(1byte) : ~InputStream, ~OutputStream
  		  					  한글자당 1byte 읽기/쓰기 => 한글은 깨짐
  		  					  파일 업로드 / 다운로드시 많이 쓰임
  		  -문자 스트림(2byte) : ~Reader, ~Writer
  		  					 한글이 포함된 파일 제어
  		  
  		 ·Stream은 단방향통신이다(=> 읽기와 쓰기를 동시에 할 수 없음)
  		  메모리(데이터 저장) ==============> 자바 응용프로그램 ==============> 모니터
  		  				  InputStream				  OutputStream
  		
  		Stream
  		데이터가 이동하는 통로
  		 읽기 통로 : 데이터가 저장된 위치로부터 프로그램에서 데이터를 읽어들이는 통로
  		 		   InputStream / Reader
  		 쓰기 통로 : 출력위치로 프로그램에 전송하는 통로
  		 		   OutputSream / Writer
  		
  		IO관련 클래스
  		 Object
  		   └바이트 스트림(업로드/다운로드용)
  		     └InputStream
  		       └FileInputStream
  		       └FilterInputStream
  		         └BufferedInputStrem
  		     └OutputStream
  		       └FileOutputStream
  		       └FilterOutputStream
  		         └BufferedOutputStream
  		         
  		   └문자 스트림(파일 입출력용)
  		     └Reader
  		       └FileReader
  		         └BufferedReader
  		     └Writer
  		       └FileWriter
  		         └BufferedWriter
  		모드 => r, w, a
  		 r : read => Reader
  		 w : write => Writer
  		 a : append(한 파일에 계속 겹쳐서 쓰는것) => new FileWriter("파일명",true)
  		 			   						 new FileWriter("파일명") => create
  		 			   						 
  		File : 독립 클래스
  		 1) 파일
  		 2) 디렉터리(폴더)
  		 File 사용 방법
  		  생성 방법
  		 	File file = new File("c:\\javaDev\\back.png") => 파일 정보 읽기
  		 	File file = new File("c:\\javaDev") => 디렉터리(폴더) 정보 읽기
  		 File의 주요 기능(메소드)
  		  파일 정보
  		 	getName() : 파일명*
  		 	getPath() : 경로명/파일명*
  		 	getParent() : 경로명
  		  파일 특성 => boolean
  		 	canRead() : 읽기 전용
  		 	canWrite() : 쓰기 전용
  		 	isHidden() : 숨김
  		  파일 여부 확인 
  		 	boolean isFile()*
  		 	boolean isDirectory()
  		  파일 조작
  		 	creatNewFile() : 파일 만들기*
  		 	mkdir() : 디렉터리 만들기*
  		  파일 삭제
  		 	delete() => 한개만*
  		 				파일이 있는 디렉터리는 삭제 못함 => 파일 먼저 삭제한 후에 디렉터리 삭제
  		  파일이나 디렉터리 존재 여부
  		 	boolean exist()*
  		  수정 날짜
  		  	long lastModified()
  		  파일 크기
  		  	long length()*
  		  디렉터리 목록
  		  	listFiles()*	 
 */
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.*;
public class inputOutputMain {

	public static void main(String[] args) {
		// 파일 선언
		File file = new File("c:\\javaDev\\back.jpg");
		long size = file.length();
		String res = "";
		if(size/1024==0)
		{
			res = size+"Bytes";
		}
		else
		{
			size = size/1024;
			res = size+"KB";
		}
		System.out.println("파일 크기 : "+res);
		System.out.println("읽기 전용 : "+file.canRead());
		System.out.println("쓰기 전용 : "+file.canWrite());
		System.out.println("숨김 파일 : "+file.isHidden());
		System.out.println("수정 날짜 : "+new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초").format(new Date(file.lastModified())));
		System.out.println("경로명 : "+file.getParent());
		System.out.println("파일명 : "+file.getName());
		System.out.println("경로명+파일명 : "+file.getPath());

	}

}
