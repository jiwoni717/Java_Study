package com.sist.io;
/*
 		·객체 단위 저장
 		ObjectInputStream / ObjectOutputStream
 		   객체 단위로 읽기		   객체 단위로 쓰기	
 */
import java.io.*;
import java.util.*;
public class Object_inputOutput_1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		List<Sawon> list = new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","대리",4500));
		list.add(new Sawon(2,"박문수","영업부","과장",5500));
		list.add(new Sawon(3,"심청이","기획부","사원",3500));
		list.add(new Sawon(4,"이순신","자재부","부장",6500));
		list.add(new Sawon(5,"강감찬","총무부","대리",4500));
		
		// 객체 단위 저장
		FileOutputStream fos = new FileOutputStream("c:\\java_datas\\sawon.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(list);
		fos.close();
		oos.close();
		System.out.println("객체 단위 저장 완료");
	}

}
