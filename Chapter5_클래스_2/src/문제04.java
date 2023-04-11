import java.util.Arrays;

public class 문제04 {

	static void process()
	{
		int[] num = new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i] = i+1;
		}
		System.out.println(Arrays.toString(num));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}

}
