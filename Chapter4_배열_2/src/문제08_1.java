import java.util.Scanner;
public class 문제08_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
/*		int[] num1 = new int[5];
		for(int i=0;i<num1.length;i++)
		{
			num1[i] = (int)(Math.random()*10)+1;
			System.out.print(num1[i]+" ");
		}
*/		
		System.out.print("정수 5개 입력 : ");
		int[] arr = new int[5];
		arr[0] = scan.nextInt();
		arr[1] = scan.nextInt();
		arr[2] = scan.nextInt();
		arr[3] = scan.nextInt();
		arr[4] = scan.nextInt();
		
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}

}
