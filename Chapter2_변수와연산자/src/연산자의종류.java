/*
 * 		피연산자 / 연산자
 * 		------ 연산 대상
 * 		
 * 		피연산자 1개 : 단항연산자 ex) a++
 * 		피연산자 2개 : 이항연산자 ex) 10+20
 * 		피연산자 3개 : 삼항연산자
 * 
 * 		1. 단항연산자
 * 			= *증감연산자 : ++ / -- => 1개 증가 / 감소 => 반복문
 * 				int a = 10;
 * 				a++;
 * 				 => 11
 * 
 * 				형식
 * 					전치연산자 : 먼저 증가 / 감소 => 대입 후에 증가
 * 					 ++a
 * 					후치연산자 : 나중에 증가 / 감소 => 증가 후에 대입
 * 					 a++
 * 
 * 						int a = 10;
 * 						int b = ++a;
 * 							=> a=11, b=11
 * 
 * 						int a = 10;
 * 						int b = a++;
 * 							=> a=11, b=10
 * 
 * 						int a = 10;
 * 						int b = a++ + a++;
 * 							==> a=12, b=21
 * 
 * 						int a = 10;
 * 						int b = ++a + ++a;
 * 							==> a=12, b=23
 * 
 * 						int a = 10;
 * 						int b = ++a + a++;
 * 							==> a=12, b=22;
 * 
 * 						int a = 10;
 * 						int b = a++ + ++a;
 * 							==> a=12, b=22;
 * 
 * 						int a = 10;
 * 						int b = a++ + a++ + ++a + a++;
 * 							==> a=14, b=47;
 * 
 * 						int a = 10;
 * 						int b = a++ + a++ + a++ + a++;
 * 							==> a=14, b=46;
 * 
 * 			= *부정연산자 : boolean만 사용 가능 ! => 턴
 * 				boolean b = true;
 * 				!b;
 * 				 => false
 * 				=====> 예약
 * 
 * 			= *형변환연산자 : 데이터형 변환
 * 				(int)10.5 ==> 10(강제로 소수점 제거)
 * 				(char)65 ==> 'A'
 * 				========================= downcasting (강제형변환)
 * 				(int)'A' ==> 65
 * 				(double)10 ==> 10.0
 * 				========================= upcasting (자동형변환)
 * 
 * 					10.5 + 10.5 = 21.0
 * 					(int)10.5 + (int)10.5 = 20
 * 					(int)(10.5 + 10.5) = 21
 * 
 * 			= 반전연산자 : 양수를 음수로 변환(음수표현) ~
 * 
 * 			10.5 + 10 = 20.5 ==> 데이터형이 동일할 때 연산이 가능
 * 				   ---
 * 				10.0으로 변환
 * 
 * 			int이하 데이터형은 연산시에 결과값이 int로 나옴
 * 			------ byte / short / char
 * 				ex) int + double => double
 * 					char + long => long
 * 					int + long => long
 * 					long + double => double
 * 					byte + char => int
 * 					==> char는 연산이 되면 정수로 변경됨
 * 
 * 		2. 이항연산자
 * 			산술연산자 : +, -, *, /, &
 * 				=> + / - / * : 데이터형
 * 				=> +
 * 					산술연산, 문자열 결합
 * 				=> /
 * 					정수 / 정수 = 정수 ==> 10 / 3 = 3
 * 					정수 / 실수 = 실수 ==> 10 / 3.0 = 3.3333...
 * 					0으로 나누면 오류 발생
 * 				=> %
 * 					10 % 2 = 0
 * 					11 % 2 = 1
 * 					------------
 * 					5 % 2 = 1
 * 					-5 % 2 = -1
 * 					5 % -2 = 1
 * 					-5 % -2 = -1
 * 					------------- 부호는 왼쪽 편을 따라간다.
 * 
 * 				+의 문자열 결합
 * 					"7" + 77 = "777"
 * 					7 + "7" + 7 = "777"
 *					7 + 7 + "7" = "147"
 *					7 + "7" + 7 + 7 = "7777"
 * 
 */
public class 연산자의종류 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		byte b = 10;
//		char c = 'A';
//		int a = b+c;
//		
//		byte b = 10;
//		byte c = 20;
//		int d = b+c;
//		
//		System.out.println(~10);
		
//		int a = 10;
//		int b = a-- + a-- + --a;
//		System.out.println("a = "+a);
//		System.out.println("b = "+b);
		
//		boolean bCheck = false;
//		System.out.println(bCheck);
//		System.out.println(!bCheck);
//		
//		int a = (int)(Math.random()*100)+1;
//		//우선순위 : 랜덤수(0.0~0.99) * 100 => int 형변환 => +1
//		System.out.println(a);

//		System.out.println(10/3);
//		System.out.println(10/3.0);

	}

}
