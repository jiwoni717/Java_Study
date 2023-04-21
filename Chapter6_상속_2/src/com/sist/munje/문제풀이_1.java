package com.sist.munje;
// getter/setter
// 사용자 정의 데이터형 => 필요에 의해서 데이터를 묶어서 관리한 목적으로 만든다
// 사용자 정의 데이터형 == ~VO
//01
class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isKwang() {
		return isKwang;
	}
	public void setKwang(boolean isKwang) {
		this.isKwang = isKwang;
	}
	
}
//02
class Student {
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBan() {
		return ban;
	}
	public void setBan(int ban) {
		this.ban = ban;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
//03
class PlayingCard { 
	int kind; 
	int num; 
	static int width; 
	static int height; 
	PlayingCard(int k, int n) { 
		kind = k; 
		num = n; 
	}
}
/*
 * 		인스턴스변수 : 데이터를 각각 저장시
 * 		=> kind, num
 * 		정적변수(공유변수) : 공통으로 사용되는 변수
 * 		=> width, height
 * 		------------------------------------------ 프로그램 종료시까지 메모리 유지~ 자동 초기화~
 * 		지역변수 : 메소드에서 선언되는 변수(매개변수도 포함)
 * 				 => 메소드 안에서만 사용
 * 				 => 반드시 초기화 후 사용한다
 * 		=> k, n
 * 
 * 		생성자
 * 		1) 모든 생성자의 이름은 클래스명과 동일
 * 		2) 생성자는 객체를 생성하기 위한 것 => x
 * 		3) 클래스에는 생성자를 반드시 하나 이상 있어야 된다 => x
 * 		4) 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다
 * 		5) 생성자는 오버로딩 할 수 없다 => x
 * 
 * 		this
 * 		1) 모든 클래스는 this를 가지고 있다
 * 		2) 객체 자신을 가리키는 참조변수다(static Object this)
 * 		   this는 생성자나 인스턴스메소드에서 사용이 가능하다
 * 			class A(){
 * 				public A(A this){
 * 				}
 * 				public void display(A this){
 * 				}
 * 				public static void aaa(){ => 사용불가
 * 				}
 * 			}
 * 		3) 지역변수와 인스턴스변수를 구분할 때 사용한다
 * 		4) 클래스 메소드내에서는(static) 사용할 수 없다
 * 		   인스턴스메소드, 객체메소드
 * 			객체명.메소드
 * 		   정적메소드, 공유메소드, 클래스메소드
 * 			클래스명.메소드
 * 
 * 		오버로딩
 * 		1) 메소드명 동일
 * 		2) 매개변수의 갯수나 데이터형이 달라야함
 * 		3) 리턴형은 관계없음
 * 		
 * 
 * 		a. 멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참고할 수 있다.
 * 		b. 지역변수는 사용하기 전에 반드시 초기화해야 한다.
 * 		c. 초기화 블럭보다 생성자가 먼저 수행된다. (x)
 * 			명시적 초기화 => 초기화 블럭 => 생성자
 * 						 클래스변수 => 인스턴스변수
 * 		d. 명시적 초기화를 제일 우선적으로 고려해야 한다.
 * 		e. 클래스변수보다 인스턴스변수가 먼저 초기화된다. (x)
 * 		   -------	 ---------
 * 			컴파일시		new
 * 		
 * 		지역변수는 static, 접근지정어, abstract는 사용이 불가
 * 		=> final은 사용 가능
 */
public class 문제풀이_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
