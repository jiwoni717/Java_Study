// <<(왼쪽 이동), >>(오른쪽 이동)
/*
 *		10 << 2
 *		1010
 *	1010()() <- 빈칸을 0으로 채움
 *		=> 101000 = 40
 *
 *		7<<3
 *		111 =>111000 = 56
 *
 *		8<<2
 *		1000 => 100000 = 32
 *
 *		x << y = x * 2^y
 *		----------------------
 *
 *		10 >> 2
 *		1010
 *		--제거 => 10 = 2
 *
 *		15 >> 3
 *		1111 => 1
 *
 *		27 >> 3
 *		11011 => 11 = 3
 *
 *		x >> y = x / 2^y
 *
 */
public class 쉬프트연산자 {

	public static void main(String[] args) {
		
		System.out.println(10<<2);
		System.out.println(7<<3);
		System.out.println(8<<2);
		System.out.println(15>>3);
		System.out.println(10>>2);
		System.out.println(27>>3);

	}

}
