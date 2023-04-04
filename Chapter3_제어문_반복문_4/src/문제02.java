
public class 문제02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0, count=0;
		
		for(int i=100;i<=999;i++)
		{
			if(i%4!=0)
			{
				count++;
				sum+=i;
			}
		}
		
		System.out.println("4의 배수가 아닌 수의 갯수 : "+count);
		System.out.println("4의 배수가 아닌 수의 합 : "+sum);

	}

}
