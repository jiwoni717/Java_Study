import java.util.Scanner;
public class 문제15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("2자리 정수 입력 : ");
		int a = scan.nextInt();
		
		if(a>=10 && a<=99)
		{
			if(a%11==0)
				System.out.println("10의 자리와 1의 자리가 같습니다.");
			else
				System.out.println("10의 자리와 1의 자리가 같지않습니다.");
		}
		else
			System.out.println("잘못된 입력입니다!!");
	}

}
