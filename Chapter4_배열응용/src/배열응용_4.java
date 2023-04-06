/*
 * 	숫자 야구게임
 * 	1. 컴퓨터가 임의의 숫자(1~9까지 중복x) 3개 발생
 * 	2. 사용자가 숫자를 입력해서 발생된 난수를 맞춰야함
 * 	3. 못맞추면 힌트
 * 		숫자가 맞는데 자리가 안맞으면 볼
 * 		숫자가 맞고 자리가 맞으면 스트라이크
 * 		3S면 게임 종료
 */
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_4 {

	public static void main(String[] args) {
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		// 중복없는 난수 발생
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
					
			}
		}
		
		// 사용자가 숫자 입력
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			if(input<100 || input>999)
			{
				System.out.println("잘못된 정수입니다.");
				continue; // while에서는 다시 수행!!
			}
			
			// 사용자가 세자리 정수 입력했다면
			user[0] = input/100; //100의 자리 수 ex) 369/100 =>3
			user[1] = (input%100)/10; //10의 자리 수 ex) 369%100 = 69/10 = 6
			user[2] = input%10; //1의 자리 수 ex) 369%10 = 9
			
			// 1. 같은 정수를 입력하면 안됨
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("중복된 수는 입력할 수 없습니다.");
				continue;
			}
			
			// 2. 0을 포함할 수 없음
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0을 포함할 수 없습니다.");
				continue;
			}
			
			// 힌트 준비
			int s=0, b=0;
			for(int i=0;i<com.length;i++)
			{
				for(int j=0;j<user.length;j++)
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			
			// 힌트 제공
			//System.out.printf("Input : %d \nResult:%dS-%d\n",input,s,b);
			System.out.println("---------");
			System.out.print(" S : ");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\n B : ");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n---------");
			
			// 종료 시점 -> 3S
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
		}

	}

}
