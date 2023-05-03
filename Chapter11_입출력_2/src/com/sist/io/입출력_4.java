package com.sist.io;
import java.io.*;
public class 입출력_4 {

	public static void main(String[] args) throws Exception {
		FileReader in = new FileReader("C:\\javaDev\\movie.txt");
		FileWriter out = new FileWriter("C:\\java_datas\\movie_1.txt"); // 자동으로 지정된 파일을 생성한다 => 이미 있으면 덮어씀
		// 기존에 있던 데이터 밑에 내용을 추가하려면 ,true < 붙이기
		BufferedReader br = new BufferedReader(in);
		BufferedWriter bw = new BufferedWriter(out);
		
		while(true)
		{
			String data = br.readLine();
			if(data==null)
				break;
			bw.write(data+"\n");
		}
		System.out.println("읽기/쓰기 완료");
		in.close();
		out.close();
	}

}
