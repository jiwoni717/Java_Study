/*
 * 		대입연산자, 삼항연산자
 * 		계산 순서 방향이 ←
 * 
 * 		() : 최우선순위연산자
 * 
 * 		비교연산자 => 결과값이 boolean => true / false
 * 		== : 같다
 * 		!= : 같지 않다
 * 		< : (왼쪽이 오른쪽보다)작다
 * 		> : (왼쪽이 오른쪽보다)크다
 * 		<= : (왼쪽이 오른쪽보다)작거나 같다
 * 		>= : (왼쪽이 오른쪽보다)크거나 같다
 * 
 * 		7==6 false
 * 		7!=6 true
 * 		'A' < 'B' => 65 < 66 true
 * 		---- byte, int, short, long, double, float, boolean, char => 적용됨
 * 		"a" == "a" => 문자열은 equals()*
 * 		
 */
public class 비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = (int)(Math.random()*100)+1;
		/*
		 * (int)(Math.random()*100)+1;
		 * 		--------------
		 * 			  1	  	  -----
		 * ----					2
		 *  3					    --
		 *  						 4
		 */
		
		int b = (int)(Math.random()*100)+1;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//1. ==
		boolean b1 = a==b;
		System.out.println("a==b = "+b1);
		
		//2. !=
		b1 = a!=b;
		System.out.println("a!=b = "+b1);
		
		//3. <
		b1 = a<b;
		System.out.println("a<b = "+b1);
		
		//4. >
		b1 = a>b;
		System.out.println("a>b = "+b1);
		
		//5. <=
		b1 = a<=b;
		System.out.println("a<=b = "+b1);
		
		//6. >=
		b1 = a>=b;
		System.out.println("a>=b = "+b1);

	}

}
