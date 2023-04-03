// 사용자의 입력을 받아(구구단) => 3을 입력하면 3단만
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		int dan = scan.nextInt();
		System.out.println("==========="+dan+"단===========");
		
		for(int i=1;i<=9;i++)
		{
			System.out.printf("%d * %d = %d \n",dan,i,dan*i);
			
		}

	}

}
