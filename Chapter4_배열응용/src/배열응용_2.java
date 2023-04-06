import java.util.Arrays;

// 정수 10개 저장하는 배열 => 임의로 초기화(1~100 난수발생)
// 최대값과 최소값의 위치
public class 배열응용_2 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		//최대값, 최소값
		int max=arr[0],min=arr[0];
		for(int i:arr)
		{
			if(max<i)
				max=i;
			if(min>i)
				min=i;
		}
		System.out.println("최대값 : "+max+", 최소값 : "+min);
		
		//위치
		int index1 = 0,index2 = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				index1=i;
			}
			else if(arr[i]==min)
			{
				index2=i;
			}
		}
		System.out.println("최대값의 위치(index) : "+(index1+1)+"번째, 최소값의 위치(index) : "+(index2+1)+"번째");
	}

}
