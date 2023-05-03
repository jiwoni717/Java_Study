package com.sist.io;
// 파일 읽기
import java.io.*;
public class 입출력_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr = null;
		try {
			fr = new FileReader("C:\\javaDev\\movie.txt");
			BufferedReader br = new BufferedReader(fr);
			int i=0; // 한글자씩 읽기 => read() => 글자의 ASC코드를 읽어온다(정수형으로 되어있음)
			long start = System.currentTimeMillis();
			while(true)
			{
				String data = br.readLine(); // 한줄씩 읽어오기
				if(data==null)
					break;
				System.out.println(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("프로그램 종료시까지 걸린 시간 : "+(end-start));
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			try {
				fr.close();
			}catch(Exception ex){}
		}

	}

}
