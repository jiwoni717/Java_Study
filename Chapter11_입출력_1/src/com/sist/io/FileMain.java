package com.sist.io;
import java.io.*;
public class FileMain {

	public static void main(String[] args) {
		try
		{
/*			File file = new File("c:\\javaDev\\school.txt");
			
			if(!file.exists())
			{
				file.createNewFile();
			}
			System.out.println("파일 만들기 성공..."); */
			
/*			File dir = new File("c:\\java_datas");
			if(!dir.exists())
			{
				dir.mkdir();
				System.out.println("폴더 만들기 완료...");
			} */
			
			File dir = new File("c:\\javaDev");
			File[] files = dir.listFiles(); //파일 목록 요청
			for(File f:files)
			{
				if(f.isFile())
				{
					System.out.println(f.getName()+" "+f.length());
				}
				else if(f.isDirectory())
				{
					System.out.println(f.getName()+" DIR");
				}
			}
		}catch(Exception ex) {}

	}

}
