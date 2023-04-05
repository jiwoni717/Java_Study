import java.util.Arrays;

public class 배열_8 {

	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = arr1.clone();  // 별칭(참조데이터) / arr1과 arr2는 주소가 같음 => 하나를 변경하면 둘 다 바뀐다.
									// .clone()이면 새로운 공간을 만들어줌 => 값 변경해도 원본 데이터가 바뀌지 않음
		
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println("arr1 = "+Arrays.toString(arr1));
		System.out.println("arr2 = "+Arrays.toString(arr2));
		
		System.out.println("=========== 배열값 변경 ===========");
/*		arr2[0]=100;
		arr2[1]=200;
		arr2[2]=300;
		arr2[3]=400;
		arr2[4]=500;
*/		
		System.out.println("arr1 = "+Arrays.toString(arr1));
		System.out.println("arr2 = "+Arrays.toString(arr2));
		
		int[] arr3 = new int[10];
		for(int i=0;i<arr1.length;i++)
		{
			arr3[i] = arr1[i];
		}
		// 복제할 때는 배열크기가 동일하거나 커야함

	}

}
