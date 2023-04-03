
public class 문제08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for(int i=2;i<=100;i+=2)
		{
			sum+=i;
		} // i는 }에서 자동으로 사라진다.
		System.out.println("2+4+...+100의 합 : "+sum);
	}

}
