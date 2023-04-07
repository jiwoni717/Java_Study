/*
 * 		문자열 데이터형 : 참조형 
 * 		=> String : 문자열 저장
 * 		   문자, 문자열 => 여러개의 문자를 동시에 저장 => " "
 * 		   ---
 * 		   ' ' => 한글자 저장(char)
 * 		   String = char[]
 * 		   "홍길동"   {'홍','길','동'}
 * 
 * 		String => java.lang.String에 존재 => 라이브러리
 * 		------
 * 		일반데이터(문자열 저장), 클래스형 => 지원하는 기능 (메소드)
 * 		가장 많이 사용되는 데이터형임 (기본형처럼 사용 가능)
 * 		웹, 윈도우는 무조건 문자열 통신
 * 		-------- <input type="text">
 * 		가장 많이 사용되는 데이터형 : int, String
 * 
 * 		사용법
 * 			String name = "홍길동";
 * 			String name = new String("");
 * 
 * 		String에서 지원하는 메소드** (변경할 수 없음 => 표준화)
 * 			┌───────────────────────────────────────────┐
 * 			|Math.random(), Math.ceil(), Math.round()...|
 * 			| 임의로 숫자 추출	   올림		    반올림		|
 * 			|		=> 메소드는 결과값을 받아서 처리 해야한다.		|
 * 			└───────────────────────────────────────────┘
 * 			1) 대문자 변환 toUpperCase()
 * 				String s = "hello java";
 * 				String result = s.toUpperCase()
 * 				result = "HELLO JAVA"
 * 			2) 소문자 변환 toLowerCase()
 * 				String s = "Hello Java";
 * 				String result = s.toLowerCase()
 *				result = "hello java"
 *			3) 찾기***
 *				----------
 *				startsWith => 시작문자열 => 결과값이 true/false => if문으로 많이 쓰임
 *				endsWith   => 끝나는 문자열 =>		〃		=>	 	 〃
 *				---------- -> 서제스트(=자동 완성기)에 사용
 *				contains   => 포함 문자(검색) => 추천 => 결과값이 true/false
 *			
 */
public class 문자열_1 {

	public static void main(String[] args) {
		
		char[] msg = {'H','e','l','l','o','J','a','v','a'};
		System.out.println("======= 대문자 변환 =======");
		for(char c:msg)
		{
			if(c>='a' && c<='z')
			{
				System.out.print((char)(c-32)); // c-32 => 대문자와 소문자 차이가 32 (A = 65, a = 97)
			}
			if(c>='A' && c<='Z')
			{
				System.out.print(c);
			}
		}
		System.out.println("\n======= 소문자 변환 =======");
		for(char c:msg)
		{
			if(c>='a' && c<='z')
			{
				System.out.print(c); // c-32 => 대문자와 소문자 차이가 32 (A = 65, a = 97)
			}
			if(c>='A' && c<='Z')
			{
				System.out.print((char)(c+32));
			}
		}
		
		System.out.println("\n======== 문자열 ========");
		String s = "Hello Java";
		System.out.println("=== 문자열에서 대문자 변환 ===");
		System.out.println(s.toUpperCase());
		System.out.println("=== 문자열에서 소문자 변환 ===");
		System.out.println(s.toLowerCase());

	}

}
