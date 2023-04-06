
public class 배열_2 {

	public static void main(String[] args) {
		// 1. 선언 -> 2. 초기화 -> 3.출력 -> 4. 제어 -> 5. 결과값 출력
		int[] arr = new int[5]; // new : 동적 메모리 할당
		
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		
		// 출력
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		
		// 제어(정렬)
		
		

	}

}
