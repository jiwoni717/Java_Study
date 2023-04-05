import java.util.Arrays;

public class 배열_9 {

	public static void main(String[] args) {
		// 배열 확장
		int[] arr1 = {10,20,30,40,50};
		int[] arr2 = new int[10];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); // System.arraycopy(복제할 배열, 몇번째부터?, 복제한게 들어가는 배열, 몇번째부터?, 몇개?)
		
		System.out.println(Arrays.toString(arr2));

	}

}
