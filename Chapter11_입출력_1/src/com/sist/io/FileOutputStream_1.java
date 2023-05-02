package com.sist.io;
import java.util.*;
import java.io.*;
public class FileOutputStream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("c:\\java_datas\\school.txt");
			if(!file.exists())
			{
				file.createNewFile();
			}
			
			// 파일이 존재할 때 사용해야함
			FileOutputStream fos = new FileOutputStream(file, true);
			String msg = "안녕하세요 지금은 파일입출력을 하고 있습니다\r\n";
			fos.write(msg.getBytes()); //String을 byte[]로 변경
			fos.close();
			System.out.println("저장 완료");
		}catch(Exception ex) {}

	}

}
