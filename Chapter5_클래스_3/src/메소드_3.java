import java.util.Arrays;

public class 메소드_3 {
	static int[] rand()
	{
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		return arr;
	}
	static void rand2(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
	public static void main(String[] args) {
		// 리턴형으로 값을 채워줌
		int[] arr1 = rand();
		System.out.println(Arrays.toString(arr1));
		
		// 매개변수를 이용해 값을 채운다 (Call By Reference) => 활용도↑
		// 배열, 클래스는 리턴형으로 값을 받지 않아도 값이 채워짐
		int[] arr2 = new int[5];
		rand2(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
