
public class 반복문_문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=1;i<=100;i++)
		{
			if(i%4==0)
				sum+=i;
		}
		
		System.out.println("4의 배수의 합계 : "+sum);

	}

}
