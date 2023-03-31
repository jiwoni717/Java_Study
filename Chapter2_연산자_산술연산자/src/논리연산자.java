// && ||
/*
 * 		(조건) && (조건)
 * 		----     ----
 * 		 |		   |
 * 		  ---------
 * 			  |
 * 			 결과
 * 
 * 	&& => 범위나 기간에 포함
 * ----------------------------
 * 	true true	=> 	true
 * ----------------------------
 *	true false	=>	false
 * ----------------------------
 * 	false true	=>	false
 * ----------------------------
 * 	false false	=>	false
 * ----------------------------
 * 
 * 	|| => 범위나 기간을 벗어난 경우
 * ----------------------------
 *  true true	=> 	true
 * ----------------------------
 *	true false	=>	true
 * ----------------------------
 * 	false true	=>	true
 * ----------------------------
 * 	false false	=>	false
 * ----------------------------
 * 
 * 	=> 효율적 연산
 * 		() && ()
 * 			  -- => 앞 조건이 false면 수행하지 않음
 * 		() || ()
 * 			  -- => 앞 조건이 true면 수행하지 않음
 * 
 * 		int a = 10;
 * 		int b = 9;
 * 		(a<b) && (++b==a) = false
 * 				 --------
 *				 앞 조건이 false이기 때문에 연산을 하지 않음
 *				 즉, b값이 증가하지 않음
 *
 *
 *	&&가 ||보다 우선순위가 높음
 */
public class 논리연산자 {

	public static void main(String[] args) {
		
//		int a = 10;
//		int b = 9;
//		boolean bCheck = (a<b) || ++b==a;
		
//		System.out.println(bCheck);
//		System.out.println("b = "+b);
//		
//		int a = 100;
//		int b = 99;
//		boolean bCheck = (a>b) && (b==a);
//		System.out.println(bCheck);
		
//		bCheck = (a>b) || (b==a);
//		System.out.println(bCheck);
		
//		char c = (char)((Math.random()*26)+65);
//		boolean bCheck = c>='a' && c<='z';
//		System.out.println("c = "+c);
//		System.out.println(bCheck);
		
		// 로그인
//		char sex = 'M';
//		int score = 87;
//		
//		boolean bCheck = (sex=='M' && score <=80);
//		System.out.println(bCheck);
		
//		int a = 10;
//		boolean bCheck = a%2==0 && a>2;
//		System.out.println(bCheck);
		
		//윤년 계산
		int year = 2024;
		boolean bCheck = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));
		System.out.println(bCheck);
		
		
		

	}

}
