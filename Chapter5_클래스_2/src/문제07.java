
public class 문제07 {
	static double method4(int a, int b)
	{
		return a/(double)b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = (int)(Math.random()*100)+1;
		int b = (int)(Math.random()*10)+1;
		
		double div = method4(a,b);
		System.out.printf("%d / %d = %.2f\n",a,b,div);
	}

}
