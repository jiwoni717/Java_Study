import java.util.Scanner;
public class 반복문_문제06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 입력 : ");
		int a = scan.nextInt();
		int b;
		
		while(true)
		{
			System.out.print("두번째 정수 입력 : ");
			b = scan.nextInt();
			if(b<a)
			{
				System.out.println("첫번째 정수보다 큰 수를 입력하시오");
				break;
			}
		}
		int gop=1;
		for(int i=a;i<=b;i++)
		{
			gop*=i;
		}
		
		System.out.printf("");

	}

}
