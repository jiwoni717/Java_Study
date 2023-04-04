
public class 반복문_문제08 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)
				sum+=i;
		}
		
		System.out.println("짝수의 합 : "+sum);

	}

}
