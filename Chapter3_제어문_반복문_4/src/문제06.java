
public class 문제06 {

	public static void main(String[] args) {
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.print(i+" ");
		}
		
		System.out.println();
		
		// 10의 자리, 1의 자리 잘라서 비교하는 버젼
		for(int i=10;i<=99;i++)
		{
			int a = i/10;
			int b = i%10;
			if(a==b)
			{
				System.out.print(i+" ");
			}
		}

	}

}
