
public class 문제05 {

	
	static int plus()
	{
		int sum = 0;
		for(int i=0;i<=10;i++)
		{
			sum+=i;
		}
		
		return sum;
	}
/*	static void num()
	{
		int num = 0;
		for(int i=0;i<=10;i++)
		{
			num+=i;
		}
		
		System.out.println("1부터 10까지의 합 : "+num);
	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//num();
		int sum = plus();
		System.out.println("sum = "+sum);
		
	}

}
