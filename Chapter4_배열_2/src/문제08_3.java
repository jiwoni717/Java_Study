
public class 문제08_3 {

	public static void main(String[] args) {
		
		int[] num = new int[10];
		for(int i=0;i<num.length;i++)
		{
			num[i] = (int)(Math.random()*10)+1;
			System.out.print(num[i]+" ");
		}
		
		System.out.println();
		
		//System.out.println(num[2]+" "+num[4]+" "+num[num.length-1]);
		
		for(int i=0;i<num.length;i++)
		{
			if(i==2 || i==4 || i==(num.length-1))
				System.out.print(num[i]+" ");
		}
		
		
	}

}
