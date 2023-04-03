// 1~100까지의 합
public class 반복문_2 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			//System.out.println("sum : "+sum+", i : "+i);
		}
		
		System.out.println("============최종 결과============");
		System.out.println("1~100까지의 합 : "+sum);

		//짝수의 합
		sum = 0; //초기값 변경 => 다시 누적 / 곱이라면 1로
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		}
		
		System.out.println("============최종 결과============");
		System.out.println("1~100까지 짝수의 합 : "+sum);
		
		//홀수의 합
		sum = 0;
		for(int i=1;i<=100;i+=2)
		{
			sum+=i;
		}
		
		System.out.println("============최종 결과============");
		System.out.println("1~100까지 홀수의 합 : "+sum);
		
		//3의 배수의 합
		sum = 0;
		for(int i=3;i<=100;i+=3)
		{
			sum+=i;
		}
		
		System.out.println("============최종 결과============");
		System.out.println("1~100까지 3의 배수의 합 : "+sum);

	}

}
