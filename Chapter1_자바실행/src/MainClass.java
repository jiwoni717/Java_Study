// 한줄 주석
/*
 * 여러줄 주석 ==> ctrl + shift + /
 * 		   풀때는 ctrl + shift + \
 * 	= 기본 문법 사항 (19 page)
 * 	1.파일명과 클래스명은 동일 하다
 * 		Class A => A.java
 *  2.클래스 안에는 반드시 main()을 포함해야된다.
 *  				 ------- 실행 시에 시작점
 *  3.클래스명은 첫자를 대문자로 시작한다. (문법이 아니라 약속)
 *    클래스명은 한글도 가능하다.
 *  4.자바의 표현법
 *    문자열 ==> 문자 여러개 사용 ==> "Hello"
 *    문자 ==> 한개의 글자 ==> 'H', '홍' ==> 'Hello'(오류)
 *    
 *    숫자 
 *     ==> 정수 / 실수
 *     	   =10진법 100,60...
 *         =8진법 012 => 10 (0~7만 사용 가능)
 *         =16진법 0x13 => 19 (0~9/A~F(10=A))
 *         *=2진법 0b000111 or 10.11, 10.11F (0~1)
 *                           double float
 *                           8byte  4byte
 *    
 *    논리 ==> true / false 
 *    
 *    특수문자
 *      \t tab(일정 간격을 띄어 쓸 때)
 *      *\n new Line (다음 줄에 츨력)
 *      \" 따옴표
 *      *\\ 역슬러시(경로명)
 *      
 *    메소드 : 기능 수행 => 자바
 *    class 안에 있는 지의 여부 *자바는 무조건 class 안에*
 *    함수 : C / Python
 *    =========================================== 기술면접 단골 질문!
 *    
 *    *실행 과정
 *    A.java ==============> 컴퓨터가 인식하는 언어로 변경 ==================> 실행
 *    ------				 ----------------------                  인터프리터 java
 *    원시 소스				 컴파일(javac) => A.class
 *    (프로그래머만 알 수 있는 언어)
 *    
 *    =>컴파일 방식 : C / C++
 *    =>인터프리터 방식 : HTML / XML / JAVA ....
 *     -------------
 *    한줄씩 번역하는 방식
 *    
 *    
 * 
 */
public class MainClass {

	public static void main(String[] args) {
		
		
		  System.out.println("Hello\tJava");
		  System.out.println("Hello\n");
		  System.out.println("Java");
		  System.out.println("\"홍길동\""); //"홍길동"
		  System.out.println("C:\\javaDev"); 
		  System.out.println(10);
		  System.out.println('A'); 
		  System.out.println(true); //=>위 4개는 오버로딩
		 
		{
			
		}

	}

}
