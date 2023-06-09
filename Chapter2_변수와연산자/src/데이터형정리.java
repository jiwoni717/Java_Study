/*
 * 	변수 설정 => 자바에서 지원하는 데이터형을 미리 숙지
 * 	0, 1만 저장(항상 숫자로 저장이 된다.)
 * 		=> 문자는 각 문자마다 숫자를 가지고 있다.
 * 		bit ==> bite ==> word ==> record
 * 		============
 * 		 |
 * 		0,1 => bit가 8개 => 1byte
 * 		-------------------
 * 		0(1) 1 1 1 1 1 1 1
 * 		-------------------
 * 		 |
 * 		맨 앞은 부호비트 (0:양수, 1:음수)
 * 		=> 컴퓨터에서 모든 숫자는 int로 인식, 실수는 double
 * 		
 * 		데이터형
 * 		--------------------------------------------------------------
 * 		데이터형  1byte(8bit)  2byte(16bit)  4byte(32bit)  8byte(64bit)
 * 		--------------------------------------------------------------
 * 		정수
 * 		--------------------------------------------------------------
 * 		byte       O (네트워크 전송, 파일 업로드/다운로드)
 * 				   -128 ~ 127 (범위를 벗어나면 오버플로우 발생)
 * 					ex)범위가 -3~2에서 3을 부르면 -3이 나옴
 * 		--------------------------------------------------------------
 * 		short					 O (C언어 호환)						  (X)
 * 		--------------------------------------------------------------
 * 		int										O (default)
 * 		--------------------------------------------------------------
 * 		long												  O
 * 				int와 long의 구분은 l(L)
 * 		--------------------------------------------------------------
 * 		실수
 * 		--------------------------------------------------------------
 * 		float									O					  (X)
 * 		--------------------------------------------------------------
 * 		double											      O (default)
 * 				double과 float의 구분은 f(F)
 * 		--------------------------------------------------------------
 * 		문자
 * 		--------------------------------------------------------------
 * 		char					O (0~65535) 각국의 언어 사용이 가능
 * 								UTF-8 (Unicode)
 * 								''를 사용해서 저장 => 한글자만
 * 								"" => String
 * 		--------------------------------------------------------------
 * 		논리
 * 		--------------------------------------------------------------
 * 		boolean		O (true/false만 => 조건문을 만들 때)
 * 						=> 삼항연산자,  if, while, for, do~while
 * 		--------------------------------------------------------------
 * 
 * 		데이터 크기
 * 		byte < short < int < long < float < double  (=> 실수가 정수보다 크다)
 *			   char
 *			*boolean은 제외
 *			 숫표현이 많을수록 크기가 크다.
 *		 	long => 1, float => 1.000000 => 2^6
 *		 	char는 정수로 취급
 *		 	'A' => 65
 *		 	'a' => 97
 *		 	'0' => 48 ( 0 != '0' )
 *		변수는 한개만 저장하는 메모리 공간의 이름(주소) => 별칭
 *		-------------------------------------------
 *		변수
 *		 1) 선언
 *			데이터형 변수명;
 *		 2) 초기화
 *			변수 = 값;
 *			= 명시적 초기화
 *				int a;
 *				a = 10;
 *			= 난수(임의의 값)
 *			= 입력을 받아서 초기화
 *		 3) 선언과 동시에 초기화
 *			데이터형 변수명 = 값;
 *		 4) 데이터형에 대입 : 항상 왼쪽이 크거나 같다.
 *			byte 값(byte)
 *			int 값(byte, int, char)
 *			long 값(byte, int, char, long)
 *			float 값(byte, int, char, long, float)
 *			double 값(byte, int, char, long, float, double)
 *
 *			
 *			
 *
 */
public class 데이터형정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//오버플로우 => 2진법 뒤의 8개만 데려오기 때문에 아래 예시는 44
		byte b = (byte)300;
		System.out.println(b);
		
		System.out.println(0);
		System.out.println((int)'0');
		System.out.println(0-10);  	//-10
		System.out.println('0'-10);	//38
		double d = 'A';
		System.out.println(d);

	}

}
