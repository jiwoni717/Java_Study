// while ==> 반복 횟수가 없는 경우 주로 사용(무한 루프)
public class 반복문_2 {

	public static void main(String[] args) {
		
		// 1부터 100까지의 합/짝수의 합/홀수의 합
		
		int sum = 0, even = 0, odd = 0;
		
		// 1~100까지 증가하는 변수 => 루프변수
		int i = 1;
		while(i<=100)
		{
			sum+=i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			i++;
		}
		
		System.out.println("1~100까지의 총합 : "+sum);
		System.out.println("1~100까지의 짝수의 합 : "+even);
		System.out.println("1~100까지의 홀수의 합 : "+odd);

		for(i=1;i<=100;i++)
		{
			sum+=i;
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		
		System.out.println("1~100까지의 총합 : "+sum);
		System.out.println("1~100까지의 짝수의 합 : "+even);
		System.out.println("1~100까지의 홀수의 합 : "+odd);

	}

}
