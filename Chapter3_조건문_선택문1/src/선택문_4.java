/*
 * 		중첩 switch문
 * 			- 특별한 경우가 아니면 거의 사용하지 않음
 * 
 * 			switch()
 * 			{
 * 				case 값:
 * 					switch()
 * 					{
 * 					
 * 					}
 * 			}
 */
// 가위바위보
/*
 * 		가위
 * 		 가위
 * 		 바위
 * 		 보
 * 		바위
 * 		 가위
 * 		 바위
 * 		 보
 * 		보
 * 		 가위
 * 		 바위
 * 		 보
 */
import java.util.Scanner;
public class 선택문_4 {

	public static void main(String[] args) {
		
		// 컴퓨터가 먼저 가위바위보 설정 -> 사용자 입력 -> 비교(처리) -> 결과값 출력
		
		int com = (int)(Math.random()*3); // 0 : 가위 / 1 : 바위 // 2 : 보
		Scanner scan = new Scanner(System.in);
		System.out.print("가위(0) / 바위(1) / 보(2) 입력 : ");
		int user = scan.nextInt();
		
		switch(com) // break; 밑에 코딩하면 오류 발생
		{
		case 0:
			System.out.println("컴퓨터 : 가위");
			break;
		case 1:
			System.out.println("컴퓨터 : 바위");
			break;
		case 2:
			System.out.println("컴퓨터 : 보");
			break;
		}
		
		switch(user)
		{
		case 0:
			System.out.println("플레이어 : 가위");
			break;
		case 1:
			System.out.println("플레이어 : 바위");
			break;
		case 2:
			System.out.println("플레이어 : 보");
			break;
		}

		// 비교
		switch(com)
		{
		case 0: //가위
			switch(user)
			{
				case 0:
					System.out.println("비겼다!!");
					break;
				case 1:
					System.out.println("사용자 Win!!");
					break;
				case 2:
					System.out.println("컴퓨터 Win!!");
					 break;
			}
			break;
			
		case 1: //바위
			switch(user)
			{
				case 0:
					System.out.println("컴퓨터 Win!!");
					break;
				case 1:
					System.out.println("비겼다!!");
					break;
				case 2:
					System.out.println("사용자 Win!!");
					break;
			}
			break;
			
		case 2: //보
			switch(user)
			{
				case 0:
					System.out.println("사용자 Win!!");
					break;
				case 1:
					System.out.println("컴퓨터 Win!!");
					break;
				case 2:
					System.out.println("비겼다!!");
					break;
			}
			break;
		}
		

	}

}
