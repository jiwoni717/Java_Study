import java.util.Arrays;

public class 문제07 {

	public static void main(String[] args) {

		int[] num = new int[10];
		int total = 0;
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*10)+1;	
		}
		
		for(int a:num)
		{
			total+=a;
		}
		
		System.out.println(Arrays.toString(num));
		System.out.printf("평균 : %.2f점\n",(total/10.0));
	}

}
