
public class 반복문_문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c3 = 0, c5=0;
		for(int i=1;i<=10;i++)
		{
			int num=(int)(Math.random()*100)+1;
			System.out.println("num = "+num);
			if(num%3==0)
				c3++;
			if(num%5==0)
				c5++;
		}
		
		System.out.println("갯수 : "+(c3+c5));

	}

}
