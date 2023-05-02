package com.sist.gn;
/*
 * 		제네릭
 * 		 데이터형을 통일화
 * 		 라이브러리의 데이터형을 변경할 경우에 사용
 * 		=> 데이터를 저장할 때는 가급적으로 데이터형 통일
 * 		List<클래스명>
 * 			--------> 기본형은 사용 불가능
 * 		 Object => 클래스명으로 변경됨
 * 		
 * 		T : Type (클래스형)
 * 		E : Element
 * 		K : Key
 * 		V : Value
 */
import java.util.*;
class Box<T>
{
	T t;

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
}
public class 라이브러리_Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
