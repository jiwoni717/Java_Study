/*
 * 		반복제어문
 * 		break
 * 			=> 반복문을 종료
 * 			=> 반복문(for, do~while, while), 선택문(switch~case)
 * 			=> break문 밑에는 코딩이 불가능하다.
 * 		continue
 * 			=> 특정 부분을 제외할 때 사용(반복문을 계속 수행)
 * 			=> 반복문(for, while, do~while)에서만 사용이 가능
 * 			=> 웹에서는 특별한 경우에만 사용
 */
public class 반복제어문_1 {

	public static void main(String[] args) {
		
		System.out.println("========== break ==========");
		for(int i=1;i<=10;i++)
		{
			if(i==5)
				break; // 반복문 중단
			System.out.print(i+" ");
		}
		
		/*
		 *  for => break 종료, continue => 증감식으로 이동
		 *  while => break 종료, continue => 조건식으로 이동(처음부터 다시 실행할 때 사용)
		 *  					-------- 잘못 적용하면 무한루프에 빠지게 됨
		 */
		
		System.out.println("\n======== continue ========");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5 || i==7 || i==9)
				continue; // 밑으로 내려가지 않고 i++로 이동
				// 게임 : 잘못된 입력이 있는 경우 처음으로 다시 돌아갈 때
			System.out.print(i+" ");
		}

	}

}
