/*
 *  	4page : 자바의 실행 과정
 *  	A. java =======> A.class ======> 화면에 결과값 출력
 *  			컴파일(javac)		인터프리터(java) => 동시에 처리(ctrl+f11)
 *  
 *  	5page : 운영체제에 독립적이다. (=운영체제마다 같은 번역을 한다)
 *  
 *  	19page
 *  		1) 파일명과 클래스명이 동일해야한다.
 *  		2) 가급적이면 한개의 파일에 한개의 클래스를 사용하는 것을 권장
 *  		3) 클래스명은 대문자
 *  		4) 실행 => main
 *  
 *  		자바에 화면 출력 메소드
 *  		----------------
 *  		system.out.print() => 옆에 출력
 *  		system.out.println() => \n(다음줄에 출력)
 *  		system.out.printf() => 출력 형식을 만들 경우
 *  
 *  	22page : 들여쓰기
 *  
 *  	23page 주석 : 번역이 안되는 파트
 *  
 *  	25page 변수 => 한개의 데이터만 저장하는 메모리 공간
 *  			   => 데이터 값을 변경할 수 있다.
 *  
 *  	26page
 *  		변수 선언 규칙
 *  			데이터형 변수형 = 초기값;
 *  		 	ex) int a=10;
 *  			
 *  
 */
public class 정리_03_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char a = 'A';
		char op = '+';
		System.out.println(a+""+op); //a+op로 하면 int로 변환됨

	}

}
