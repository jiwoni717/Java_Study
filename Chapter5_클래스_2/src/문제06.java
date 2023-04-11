import java.util.Scanner;
public class 문제06 {
	
	static int method3(int num)
	{
		int total = 0;
		for(int i=0;i<=num;i++)
		{
			total+=i;
		}
		
		return total;
	}
	static void process()
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scan.nextInt();
		int total = method3(num);
		
		System.out.println("1부터 "+num+"까지의 합 : "+total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
