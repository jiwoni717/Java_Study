package com.sist.io;
// 파일 쓰기
import java.io.*;
public class 입출력_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileWriter fw = null;
		FileReader fr = null;
		try
		{
			// 1. 파일 만들기
			File file = new File("C:\\java_datas\\movie.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			// 2. 파일 읽기
			fr = new FileReader("C:\\javaDev\\movie.txt");
			fw = new FileWriter(file);
			
			// 3. 생성된 파일 쓰기
			int i=0;
			while((i=fr.read())!=-1)
			{
				fw.write(i);
			}
			System.out.println("파일 읽기/쓰기 완료");
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fw.close();
				fr.close();
			}catch(Exception ex) {}
		}
	}

}
