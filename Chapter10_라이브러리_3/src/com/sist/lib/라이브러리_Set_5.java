package com.sist.lib;
import java.util.*;
public class 라이브러리_Set_5 {

	public static void main(String[] args) {
		Set set = new HashSet();
		
		for(int i=0;i<10;i++)
		{
			int r = (int)(Math.random()*100)+1;
			set.add(r);
		}
		
		// 중복된 수를 자동으로 제외시키기 때문에 저장된게 10개가 안될 수도...
		System.out.println(set);
		
		// 50보다 작은 수 => 형변환해라~!!!!!!
		for(Object obj:set)
		{
			if((int)obj<50)
			{
				System.out.print((int)obj+" ");
			}
		}
		
		// 50보다 큰 수
		System.out.println();
		for(Object obj:set)
		{
			if((int)obj>50)
			{
				System.out.print((int)obj+" ");
			}
		}
		
		System.out.println("\n=======================================");
		// 자동 정렬 => treeSet
		Set tSet = new TreeSet();
		
		for(int i=0;i<10;i++)
		{
			int r = (int)(Math.random()*100)+1;
			tSet.add(r);
		}
		System.out.println(tSet);
		
		System.out.println("50보다 작은 수 : "+((TreeSet) tSet).headSet(50));
		System.out.println("50보다 큰 수 : "+((TreeSet) tSet).tailSet(50));

	}

}
