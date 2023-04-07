/*
 * 	같은 문자열인지 확인
 * 	- 기본형 비교 : ==, !=
 * 	- 문자열 비교 : equals(), !equals()
 * 				----------
 * 				대소문자를 구분한다
 * 	대소문자를 구분하지 않을 때는 equalsIgnoreCase
 * 	
 * 	로그인, 아이디 찾기, 아이디 중복체크, 비밀번호 찾기
 * 	
 * 	login => id, password
 */
import java.util.Scanner;
public class 문자열_3 {

	public static void main(String[] args) {
		final String ID = "hong";
		final String PWD = "H1234";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디 입력 : ");
		String id = scan.next();
		System.out.print("비밀번호 입력 : ");
		String pwd = scan.next();
		
		// 로그인 처리
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))
		{
			System.out.println(id+"님 로그인되었습니다.");
		}
		else
		{
			System.out.println("아이디나 비밀번호가 틀립니다.");
		}

	}

}
