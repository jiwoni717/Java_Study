
public class 문제01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 0;
		for(int i=100;i<=999;i++)
		{
			if(i%7==0)
			{
				count++;
				sum+=i;
			}
		}
		
		System.out.println("7의 배수 갯수 : "+count);
		System.out.println("7의 배수 합 : "+sum
				);

	}

}
