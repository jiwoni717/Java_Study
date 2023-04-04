/*
 * 		반복문 : 유사한 내용이 여러번 반복할 때 주로 사용
 * 			ex) 영화 목록, 맛집 목록(=>목록 출력), 메인화면, 상세보기(if)
 * 				페이징
 * 
 * 		반복문의 종류
 * 			반복횟수가 정해져 있는 경우 : for
 * 			반복횟수가 정해지지 않은 경우 : while
 * 			한번이상 수행 가능 : do~while
 * 			-----------------------------
 * 			자바 : 출력, 제어 => for(중첩 for문까지)
 * 				  데이터베이스, 네트워크 => while(1차)
 * 
 * 		형식
 * 			for
 * 				for(초기값;조건식;증감식)
 * 				{
 * 					반복 수행 문장
 * 				};
 * 
 * 			while
 * 				초기값
 * 				while(조건문)
 * 				{
 * 					반복 수행 문장
 * 					증가식
 * 				}
 * 				=> 위에서 밑으로 순차적으로 수행됨
 * 				시작하자마자 조건문이 false면 수행하지 않음
 * 				=> 무한루프 (네트워크 서버, 데이터베이스 값 읽기, 파일 읽기)
 * 				=> 파일 읽기 => -1(EOF)
 * 
 * 			do~while
 * 				초기값
 * 				do{
 * 					반복 수행 문장
 * 					증가식
 * 				}while(조건문);
 * 				=> 수행을 한 후 조건 확인
 * 				한번 이상은 무조건 수행함
 * 
 * 			for => 2차
 * 				
 * 			
 */
public class 반복문_1 {

	public static void main(String[] args) {
/*		
		String[] food =
		{
			"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
			"아삭아삭한 고추된장박이",
			"달콤 짭조름♡ 떡 베이컨 간장조림♡",
			"누텔라 견과류 토스트 만들기",
			"등갈비김치찜 김치넣고 푹푹 익히기만 하세요 복잡한건 정말 싫으네요 (양념도 초심플)"
		};
		
		String[] chef =
		{
			"루던",
			"돌하우스",
			"요블리",
			"dddd516",
			"즐거운날랄라"
		};
		
		for(int i=0;i<5;i++)
		{
			System.out.println(food[i]+"("+chef[i]+")");
		}
*/
		
		for(int i=1;i<=10;i++) // i를 for문 밖에서도 사용하고 싶다면 밖에서 변수 선언 하기 / i는 지역변수 => 스택에 쌓임 => 매모리에 의해 자동 삭제
		{
			System.out.print(i+" ");
		}
		
		System.out.println("\n===========================");
		
		// A~Z 출력
/*		for(char c = 'A';c<='Z';c++)
		{
			System.out.print(c+" ");
		}
		
		System.out.println(" ");
*/		
		char c = 'A';
		for(int i=0;i<26;i++)
		{
			System.out.print(c++ +" ");
		}
		
		System.out.println("\n===========================");
		
		System.out.println("===========while===========");
		
		int i=1; // 초기값(시작점)
		while(i<=10) // 조건식(종료점)
		{
			System.out.print(i+" ");
			i++; // 제어 => 1에서 10까지 증가
		}
		
		System.out.println("\n===========================");
		
		c='A'; //출력용
		while(c<='Z')
		{
			System.out.print(c++ +" ");
		}
		
		System.out.println("\n==========do~while=========");
		
		i = 1;
		do
		{
			System.out.print(i+" ");
			i++;
		}while(i<=10);
		
		System.out.println("\n===========================");
		
		c='A';
		i=0;
		do {
			System.out.print(c++ + " ");
			i++;
		}while(i<26);
		
		
	}

}
