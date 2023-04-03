/*
 * 		자바에서 지원하는 반복문
 * 			1. for : 반복 횟수가 지정된 경우에 주로 사용 => 코딩 테스트는 2차(중첩) for문****
 * 				1) 일반 for
 * 				2) for-each : 출력용(웹에서 가장 많이 등장 : 향상된 for문)
 * 
 * 			2. while : 반복 횟수를 모르는 경우(선 조건)
 * 
 * 			3. do~while : 반복 횟수를 모르는 경우(후 조건) => 무조건 1번 이상 수행
 * 		=>유사한 내용을 여러번 출력하고 싶을 때 주로 사용
 * 			ex) 합계 구하기, 통계, 목록 출력
 * 
 * 			형식
 * 				1. for
 * 					for(초기값;조건식;증감식) => for(int i=1;i<=10;i++)
 * 					{
 * 						반복 실행 문장
 * 					}
 * 					초기값 : 시작점 -> 한번만 수행
 * 					조건식 : 수행을 중단할 때(종료점)
 * 					증감식 : 초기값부터 시작해서 조건식이 false일 때까지 수행
 * 					증가(감소)는 여러개 증가(감소)도 가능 => for(int i=1;i<=10;i+=2)
 * 
 * 				실행 순서*** (프로그램에서 가장 많이 사용되는 제어문 : for, if)
 * 				=> for문은 한문장만 수행이 가능
 * 				   여러문장 사용시에는 {}을 이용해서 처리한다
 * 
 * 				   	 false면 반복문 종료
 *							 ↑
 * 						①	 ②  ← ④
 * 				=> for(초기값;조건식;증감식)
 * 				   {			  ↑
 * 				   		③↓ 반복 실행 문장 (조건식이 true일 때 수행)
 * 				   }
 * 					①초기값 => ②조건식에 대입 => ③조건식이 true면 반복 실행 문장 수행 => ④초기값 증감 => ②조건식에 대입... => ③
 * 					②가 false가 나올 때 까지 수행 false면 for문 종료
 */
public class 반복문_1 {

	public static void main(String[] args) {
		// Hello Java를 10번 출력
		
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");
		
		System.out.println("==============for문 이용==============");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i+". Hello Java");
		}
		
	}

}
