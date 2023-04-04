/*
 * 		★
 * 		★★
 * 		★★★
 * 		★★★★
 * 
 * 		1	1
 * 		2	2
 * 		3	4
 * 		4	4	=> i=j ==> j<=i
 * 
 * 		★★★★
 * 		★★★
 * 		★★
 * 		★
 * 
 * 		1	4
 * 		2	3
 * 		3	2
 * 		4	1	=> i+j=5 j=5-i
 * 
 * 		A
 * 		BC
 * 		DEF
 * 		GHIJ
 * 
 * 		A
 * 		AB
 * 		ABC
 * 		ABCD
 * 
 * 		#234
 * 		1#34
 * 		12#4
 * 		123#
 * 				i	k	j			
 * 		   ★	줄수	공백	별표		i+k=4 ==> k=4-i	/ j=i
 * 		  ★★	1	3	1
 * 		 ★★★	2	2	2
 * 		★★★★	3	1	3
 * 				4	0	4
 * ------------------------------
 * 		★★★★	1	0	4		i-k=1 ==> k=i-1
 * 		 ★★★	2	1	3
 * 		  ★★	3	2	2
 * 		   ★	4	3	1
 * 
 * 		==> 정렬 / 빈도구하기 / 등수구하기
 * 		==> 정처기 마름모 / 나비 / 모래시계 출력하기~~~
 * 
 */
public class 중첩반복문_2 {

	public static void main(String[] args) {
		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=5-i;j++)
//			{
//				System.out.print("★");
//			}
//			System.out.println();
//		}
//			
//		for(int i=1;i<=4;i++)
//		{
//			char c= 'A';
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print(c++);
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=4;i++)
//		{
//			for(int j=1;j<=4;j++)
//			{
//				if(i==j)
//					System.out.print('#');
//				else
//					System.out.print(j);
//			}
//			System.out.println(); // 줄바꿈
//		}
		
		for(int i=1;i<=4;i++)
		{
			for(int k=1;k<=4-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("★");
			}
			System.out.println();
		}

	}

}
