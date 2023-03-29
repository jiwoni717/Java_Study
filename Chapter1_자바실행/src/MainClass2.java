
public class MainClass2 {
	public static void main(String[] args) {
		// 프로그램의 시작점 / 끝점
		/*
		 * 정수
		 * ---
		 * 2진법
		 * 8진법
		 * 16진법 
		 * 
		 * 29 => 2진법
		 * 16 8 4 2 0(1)
		 *  1 1 1 0 1     => 11101
		 *  
		 * 76 => 2진법
		 * 64 32 16 8 4 2 0(1)
		 *  1  0  0 1 1 0 0      => 1001100
		 */
		
		System.out.println(0b11101);
		System.out.println(0b1001100);
		System.out.println(Integer.toBinaryString(29)); //2진법
		/*	
		 * 8진법으로 변환
		 *  11101
		 *    ---
		 *  -- 5
		 *  3     ====> 035
		 *  
		 *  
		 * 16진법으로 변환
		 *  11101
		 *   ----
		 *  - 13  => d
		 *  1    =======> 1d
		 */
		System.out.println(Integer.toOctalString(29)); //8진법
		System.out.println(Integer.toHexString(29)); //16진법
		
		System.out.println("c:\\dev");
		System.out.print("Hello\n");    //or println
		System.out.println("Hello");
		//10+20=30
		System.out.printf("%d+%d=%d",10,20,30); //서식이 있는 출력함수 C언어의 printf와 혼동하지 않게 주의
	}
}
