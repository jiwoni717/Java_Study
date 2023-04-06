import java.util.Arrays;

// 선택정렬 => 문자
/*	B C A E D => ASC / DESC
 * -------------------------
 * 	B C A E D 
 * 	- -
 * 	B C
 * 	-	-
 * 	A   B
 * 	-	  -
 * 	A     E
 * 	-	    -
 * 	A       D
 * 	------------- 1 round
 * 	A C B E D
 * 	  - -
 *    B C
 *    -   -
 *    B   E  
 *    -     -
 *    B     D
 * 	------------- 2 round
 * 	A B C E D
 *      - -
 *      C E
 *      -   -
 *      C   D
 *	------------- 3 round
 *	A B C E D
 *		  - -
 *        D E
 *  ------------- 4 round
 *  A B C D E
 *    
 */
public class 배열응용_알고리즘_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (char)((int)(Math.random()*26)+65);
		}
		System.out.println("============ 정렬전 ============");
		System.out.println(Arrays.toString(arr));
		
		// ASC
		System.out.println("========== 정렬후(ASC) ==========");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//DESC
		System.out.println("========= 정렬후(DESC) =========");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
