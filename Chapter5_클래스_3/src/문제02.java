import java.util.Arrays;

public class 문제02 {
	/*
	static void process2()
	{
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		// ASC 정렬
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후(ASC) : "+Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("정렬 후(DESC) : "+Arrays.toString(arr));
		
	}
*/	
	
	static void sort(int[] arr,int num)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				boolean bCheck = false;
				if(num==1)
					bCheck = arr[i]>arr[j];
				else
					bCheck = arr[i]<arr[j];
					
				if(bCheck)
				{
					int a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}
	}
	static void rand(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("정렬 전 : "+Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		rand(arr);
		sort(arr,1);
		System.out.println("정렬 후(ASC) : "+Arrays.toString(arr));
		sort(arr,2);
		System.out.println("정렬 후(DESC+) : "+Arrays.toString(arr));
	}

}
