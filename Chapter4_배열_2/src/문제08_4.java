import java.util.Arrays;

public class 문제08_4 {

	public static void main(String[] args) {
		int[] num = new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println(Arrays.toString(num));
		
		int max = num[0];
		for(int i:num)
		{
			if(max<i)
				max=i;
		}
		
		System.out.println("최대값 : "+max);

	}

}
