import java.util.Arrays;

/*
 * 	버블 정렬 : 인접한 데이터끼리 비교
 * 	=> 선택 정렬은 앞에서부터 정렬하지만 버블 정렬은 !뒤에서!부터 정렬(=고정)한다
 * 	
 *	ASC	
 * 	40 30 10 50 20
 *  -- --
 *  30 40
 * 	   -- --
 * 	   10 40
 * 		  -- --
 * 		  40 50
 * 			 -- --
 * 			 20 50
 * 	------------------- 1 round
 * 	30 10 40 20 (50)→고정
 *  -- --
 *  10 30
 *     -- --
 *     30 40
 *        -- --
 *        20 40
 *  ------------------- 2 round
 *  10 30 20 (40 50)
 *  -- --
 *  10 30
 *     -- --
 *     20 30
 *  ------------------- 3 round
 *  10 20 (30 40 50)
 *  -- --
 *  10 20
 *  ------------------- 4 round
 *  10 20 30 40 50
 *  
 *		i		j
 *	  start	   횟수
 *  	0		4
 *  	1		3
 *  	2		2
 *  	3		1
 *     ----------- i+j=4 => j=4-i (4 : length - 1)
 *  
 */
public class 배열응용_알고리즘_3 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("========= 정렬전 =========");
		System.out.println(Arrays.toString(arr));
		
		//ASC
		System.out.println("======= 정렬후(ASC) =======");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]>arr[j+1]) // 버블정렬은 인접한 것끼리 비교하기 때문
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
		//DESC
		System.out.println("====== 정렬후(DESC) ======");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
				if(arr[j]<arr[j+1]) // 버블정렬은 인접한 것끼리 비교하기 때문
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
