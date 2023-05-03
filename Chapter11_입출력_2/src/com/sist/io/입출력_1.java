package com.sist.io;
/*
 		지원하는 라이브러리
 		 FileInputStream / FileOutputStream
 		 FileReader / FileWriter
 		 ----------------------------------
 		 ObjectInputStream / ObjectOutputStream => 객체 단위 저장
 		 => 속도가 느림 => Buffer
 		
 		·Buffer
 		 관련된 데이터를 묶어서 한번에 전송
 		 속도가 빠르다
 		 BufferedReader / BufferedWriter => String으로 받고 String으로 전송 가능
 		 
 */
import java.io.*;
import java.util.*;
public class 입출력_1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try
		{
			long start = System.currentTimeMillis();
			fis = new FileInputStream("C:\\유틸\\eclipse-jee-2023-03-R-win32-x86_64.zip");
			BufferedInputStream bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("C:\\java_datas\\eclipse_1.zip");
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 파일 복사 ==> 업로드
			int i=0; // 읽은 바이트 수
			byte[] buffer = new byte[1024]; // 파일 복사
			while((i=bis.read(buffer, 0, 1024))!=-1)
			{
				bos.write(buffer, 0, i);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("파일 복사에 걸린 시간 : "+(end-start));
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
				fos.close();
			}catch(Exception ex) {}
		}
	}

}
