// do~while => 후조건 / 무조건 1번은 수행
/*
 * 		1. 초기화
 * 		2. 게임
 * 		3. 형식
 * 				초기값
 * 				do
 * 				{
 * 					반복 실행 문장
 * 					증감식
 * 				}while(조건식); => 증가된 변수로 조건 검색
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		// 1~10
		int i = 1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println("\n============================");
		Scanner scan = new Scanner(System.in);
		System.out.print("단 입력 : ");
		int dan = scan.nextInt();
		
		i = 1;
		do {
			System.out.printf("%-2d*%2d = %d \n",dan,i,dan*i); // %nd => 왼쪽 띄어쓰기 / %-nd => 오른쪽 띄어쓰기
			i++;
		}while(i<=9);
		
		
		System.out.println("======== for ========");
		i=10;
		for(i=10;i<10;i++) {
			System.out.println("i = "+i);
		}
		
		System.out.println("======== while ========");
		i=10;
		while(i<10) {
			System.out.println("i = "+i);
			i++;
		}
		
		System.out.println("======== do~while ========");
		i=10;
		do {
			System.out.println("i = "+i);
			i++;
		}while(i<10);

	}

}
