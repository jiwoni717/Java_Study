package com.sist.io;
import java.util.*;
import java.io.*;
public class Object_inputOutput_2 {

	public static void main(String[] args) throws Exception {
		FileInputStream in = new FileInputStream("C:\\java_datas\\sawon.txt");
		ObjectInputStream ois = new ObjectInputStream(in);
		//객체 단위로 값 읽어오기(형변환~!)
		List<Sawon> list = (List<Sawon>)ois.readObject();
		
		for(Sawon s:list)
		{
			System.out.println(s.getSabun()+" │ "+s.getName()+" │ "+s.getDept()+" │ "+s.getJob()+" │ "+s.getPay());
		}
	}

}
