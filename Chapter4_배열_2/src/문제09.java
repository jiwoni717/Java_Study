import java.util.Arrays;

public class 문제09 {

	public static void main(String[] args) {
		
/*		int[] kor = new int[10];
		int[] eng = new int[10];
		int[] math = new int[10];
		
		int[] total = new int[10];
		double[] avg = new double[10];
		
		for(int i=0;i<kor.length;i++)
		{
			kor[i] = (int)(Math.random()*100)+1;
			eng[i] = (int)(Math.random()*100)+1;
			math[i] = (int)(Math.random()*100)+1;
			total[i] = kor[i]+eng[i]+math[i];
			avg[i] = total[i]/3.0;
		}
		
		for(int i=0;i<kor.length;i++)
		{
			System.out.printf("%d번 총점 : %2d, 평균 : %-7.2f",i+1,total[i],avg[i]);
			System.out.println();
		}
*/
		
		int[] num = new int[10];
		int total = 0;
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*100)+1;	
		}
		
		for(int a:num)
		{
			total+=a;
		}
		
		System.out.println(Arrays.toString(num));
		System.out.printf("총점 : %d점, 평균 : %.2f점\n",total,(total/10.0)); // 반올림됨

	}

}
