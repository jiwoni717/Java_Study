import java.util.Arrays;

/*
 * 1. 달력 만들기
 * 	1) 년도 / 월 입력
 * 	2) 1일자의 요일 확인 => 세분화
 * 	3) 달력 출력
 * 	재사용할 수 있는 메소드 : 윤년 체크
 * 
 * 2. 숫자야구게임
 * 	1) 난수 발생
 * 	2) 사용자 입력
 * 	3) 비교
 * 	4) 힌트
 * 	5) 종료여부 확인
 * 
 */
public class 메소드조립법_1 {
	static void sort(int[] arr,int n) // n=1 ASC, n=2 DESC
	{
		
		// ASC
	
		for(int i=0;i<arr.length-1;i++)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				boolean bCheck = false;
				
				if(n==1)
					bCheck = arr[i]>arr[j];
				else
					bCheck = arr[i]<arr[j];
				
				if(bCheck)
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
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
	}
	public static void main(String[] args) {
		
		int[] arr = new int[5];
		rand(arr);
		System.out.println("정렬 전 : "+Arrays.toString(arr));
		
		sort(arr,1);
		System.out.println("ASC 정렬 후 : "+Arrays.toString(arr));
		
		sort(arr,2);
		System.out.println("DESC 정렬 후 : "+Arrays.toString(arr));

	}

}
