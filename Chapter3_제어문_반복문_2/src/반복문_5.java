// 가위바위보 게임
/*
 * 	가위0		가위0		비김0
 * 			바위1		이김-1
 * 			보2		짐-2
 * 	바위1		가위0		짐1
 * 			바위1		비김0
 * 			보2		이김-1
 * 	보2		가위0		이김2
 * 			바위1		짐1
 * 			보2		비김0
 * 
 * 비기는 경우 : 0
 * 사용자가 이기는 경우 : -1 / 2
 * 컴퓨터가 이기는 경우 : -2 / 1
 */
import java.util.Scanner;
public class 반복문_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int win = 0, lose = 0, same = 0;
		
		while(true) // for(;;)
		{
			System.out.print("가위(0), 바위(1), 보(2), 종료(9) : ");
			int com = (int)(Math.random()*3);
			int user = scan.nextInt();
			
			if(user==9)
			{
				System.out.println("게임 종료!!");
				//System.exit(0);
				break; // while 종료
			}
			
			// 컴퓨터와 사용자의 가위바위보
			if(com==0)
				System.out.println("컴퓨터 : 가위");
			else if(com==1)
				System.out.println("컴퓨터 : 바위");
			else if(com==2)
				System.out.println("컴퓨터 : 보");
			
			if(user==0)
				System.out.println("사용자 : 가위");
			else if(user==1)
				System.out.println("사용자 : 바위");
			else if(user==2)
				System.out.println("사용자 : 보");
			
			// 결과값
			switch(com-user)
			{
				case -1: case 2:
					System.out.println("사용자 Win!!");
					win++;
					break;
				case -2: case 1:
					System.out.println("컴퓨터 Win!!");
					lose++;
					break;
				case 0:
					System.out.println("비겼다!!");
					same++;
					break;
			}
			
		}
		
		System.out.println("============== 결과값 ==============");
		int total = win+lose+same;
		System.out.printf("%d전 %d승 %d패 %d무\n",total,win,lose,same);

	}

}
