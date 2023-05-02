package com.sist.io;
/*
 		fileInputStream
 		 단위 : byte (1byte씩 읽어온다 => 한글이 포함된 데이터는 읽을 수 있지만 깨짐)
 		 업로드, 다운로드용
 		 주요메소드
 		  read() : 읽기, 리턴형이 int
 		  close() : 닫기
 		 생성자
 		  new FileInputStream(File file)
 		  new FileInputStream(String path)
 */
import java.io.*;
public class FileInputStream_1 {

	public static void main(String[] args) {
		try {
//			FileInputStream fis = new FileInputStream("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\inputOutputMain.java");
			FileReader fis = new FileReader("C:\\javaDev\\javaStudy\\Chapter11_입출력_1\\src\\com\\sist\\io\\inputOutputMain.java");
			
			int i=0; // 1개의 문자를 읽어 온다 => 문자 번호로 넘겨준다
			while((i=fis.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex) {}
	}

}
