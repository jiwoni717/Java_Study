/*
 * 	업다운 게임
 * 	컴퓨터가 난수 발생(1~100)
 * 	=> 사용자 입력
 * 	=> 입력시에 힌트(업, 다운)
 * 	=> for문 횟수는 무한루프 : for(;;)
 */
import java.util.Scanner;
public class 반복문_6 {

	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100)+1;
		int count = 0;
		Scanner scan = new Scanner(System.in);		
			
		for(;;) // 무한루프 => 보통은 while문 => 종료시점 정해둬야함
		{
			System.out.print("1~100사이의 정수를 입력하시오 : ");
			int user = scan.nextInt();
			count++;
			
			if(user>=1 && user<=100) {
				//힌트
				if(user<com)
					System.out.println("입력한 수보다 큰 수를 입력하시오");
				else if(user>com)
					System.out.println("입력한 수보다 작은 수를 입력하시오");
				else if(user==com)
				{
					System.out.println("정답!!");
					System.out.println(count+"번만에 정답을 맞췄습니다.");
					System.exit(0);
				}
			}
			else
				System.out.println("잘못된 입력입니다!!");
		}

	}

}
