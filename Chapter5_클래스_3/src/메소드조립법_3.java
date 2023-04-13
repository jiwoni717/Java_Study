/*
 *  1.난수 발생
 *  2.사용자 입력
 *  -----------
 *  3.비교
 *  4.힌트
 *  -----------
 *  5.종료여부
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드조립법_3 {
	
	// 숫자 입력
	static void num_input(int[] com, int[] user)
	{
		// 중복없는 난수 발생
		for(int i=0;i<com.length;i++)
		{
			com[i] = (int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++) // 중복없는 난수 발생
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		// 사용자값 입력
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			
			// 정상 입력 => && / 오류처리 => ||
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("수를 중복없이 입력해야합니다!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다!");
				continue;
			}
			
			// 비교
			int s = compare(com, user);
			
			// 종료 여부
			if(isEnd(s))
        	{
        		System.out.print("게임을 다시할까요?(y/n):");
        		char c=scan.next().charAt(0);
        		if(c=='y')
        		{
        			System.out.println("새 게임을 시작합니다!!");
        			process();
        		}
        		else
        		{
        			System.out.println("게임을 종료합니다!!");
        			System.exit(0);
        		}
        	}
		}
		
	}
	
	// 비교, 힌트출력
	static int compare(int[] com, int[] user)
	{
		int s=0, b=0;
		
		for(int i=0;i<3;i++) // com
		{
			for(int j=0;j<3;j++) // user
			{
				if(com[i]==user[j]) // 같은 수가 있는지 확인
				{
					if(i==j) // 자리도 같은지 확인
						s++;
					else // 자리가 다르다면
						b++;
				}
			}
		}
		
		System.out.printf("Input : %d%d%d / Hint : %dS-%dB\n",user[0],user[1],user[2],s,b);
		
		return s;
	}
	
	// 종료
	static boolean isEnd(int s)
	{
		boolean bCheck = false;
		if(s==3)
			bCheck = true;
		
		return bCheck;
	}
	
	static void process()
	{
		int[] com=new int[3];
		int[] user = new int[3];
		num_input(com,user);
	}
	public static void main(String[] args) {
		
		process();

/*		int[] com=new int[3];
		int[] user = new int[3];

		
		for(int i=0;i<com.length;i++)
		{
			com[i] = (int)(Math.random()*9)+1; // 1~9
			for(int j=0;j<i;j++) // 중복없는 난수 발생
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		Scanner scan = new Scanner(System.in);
		// 사용자 입력
		while(true)
		{
			System.out.print("세자리 정수 입력 : ");
			int input = scan.nextInt();
			
			// 정상 입력 => && / 오류처리 => ||
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다!!");
				continue;
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
			
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("수를 중복없이 입력해야합니다!");
				continue;
			}
			
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 입력할 수 없습니다!");
				continue;
			}
			
			// 비교
			int s=0, b=0;
			
			for(int i=0;i<3;i++) // com
			{
				for(int j=0;j<3;j++) // user
				{
					if(com[i]==user[j]) // 같은 수가 있는지 확인
					{
						if(i==j) // 자리도 같은지 확인
							s++;
						else // 자리가 다르다면
							b++;
					}
				}
			}
			
			// 힌트
			System.out.printf("Input : %d, Result : %dS-%dB\n",input,s,b);
			if(s==3)
			{
				System.out.println("Game over!!");
				break;
			}
		}
*/	
	}

}
