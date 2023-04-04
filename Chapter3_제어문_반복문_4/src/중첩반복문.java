// 2차 for
/*
 * 		중첩
 * 		for(초기값;조건식;증감식) =======> 줄수
 * 		{
 * 			for(초기값;조건식;증감식) ===> 실제 출력물
 * 			{
 * 				 반복 수행 문장
 * 			}
 * 		}
 */
public class 중첩반복문 {

	public static void main(String[] args) {
//		char c = 'A';
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=3;j++)
//			{
//				System.out.print(c++ + " ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=1;i<=5;i++)
//		{
//			for(int j=1;j<=5;j++)
//			{
//				System.out.println("i = "+i+", j = "+j);
//			}
//		}
		
		System.out.println("======================= 구구단 =======================");
		
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d * %d = %2d\t",j,i,j*i);
			}
			System.out.println();
		}

	}

}
