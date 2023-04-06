import java.util.Arrays;

/*
 *  1. continue; => 특정부분을 제외하고 반복 수행 while문에서는 조건식으로 이동 / for문에서는 증감식으로 이동
 *  2. i>50
 *  3. 4번
 *  4.  1) char[] c = new char[10];
 *  	2) int[] n = {0,1,2,3,4,5};
 *  	3) char[] day = {'일','월','화','수','목','금','토','일'};
 *  	4) boolean[] bool = {true, false, false, true};
 *  5. int i=0;i<alpha.length;i++
 */

public class 문제01_06 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(num));
		
		for(int a:num)
		{
			if(a%3==0)
				System.out.print(a+" ");
		}
		
		
		
	}
}
