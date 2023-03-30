/*
 * 	이항연산자 : 피연산자가 2개
 * 		1) 산술연산자* (+, -, *, /, %)
 * 		2) 쉬프트연산자 (비트이동연산자) (<<, >>)
 * 		3) 비트연산자 (&, |, ^)
 * 		4) 비교연산자* (==, !=, <, >, <=, >=)
 * 		5) 논리연산자* (&&(직렬), ||(병렬)) : 효율적인 연산
 * 			(조건) && (조건) => 조건 2개가 모두 true여야 true
 * 			(조건) || (조건) => 조건중 1개만 true여도 true
 * 		6) 대입연산자* (=, +=, -=, op=)
 * -----------------------------------------------------
 * 	38page
 * 		산술연산자
 * 			+, -, * => 형변환* => 자바에서 모든 연산은 같은 데이터형끼리만 연산 가능
 * 					   ----
 * 						int + double => int를 double로 변환 => 결과값이 double
 * 						10 + 20.5 => 10.5 + 20.5 = 30.5
 * 						=> 자동으로 !큰 데이터형!으로 변환 후 연산을 한다.
 * 
 * 						'A' + 10 => char + int => char가 int로 변환(65)
 * 							=>65 + 10 = 75
 * 						*char는 모든 연산자를 이용해서 연산처리를 하면 => 자동으로 int로 변환
 * 							ex) 'A' < 60 = false
 * 
 * 						int이하의 데이터형(byte, short, char)은 연산시 결과값이 int다.
 * 							short + long = long
 * 							byte + double = double
 * 							char + char = int
 * 							byte + byte = int
 * 			/ => 정수 / 정수 = 정수
 * 				 정수 / 실수 = 실수
 * 				 0으로 나누면 에러 발생	 	
 * 			% => 결과값은 왼쪽 부호가 남는다.
 * 					5 % 2 = 1
 * 					-5 % 2 = -1
 * 					5 % -2 = 1
 * 					-5 % -2 = -1
 * 
 * 조건문 => 비교 논리 부정
 */


// 사용자가 정수 3개를 입력 => 결과값 출력 (1.총점 / 2.평균)
import java.util.Scanner; // 외부에서 클래스를 불러온다.
// 키보드로부터 입력된 값을 얻어오는 클래스 : Scanner(scanf())
// BufferedReader => 예외처리가 안됨
public class 산술연산자 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 클래스 선언(new)
		//            -----       -----------
		//		   동적 메모리 할당 키보드 입력값 받아올 때
		System.out.println("국어 점수 입력 : ");
		int kor = scan.nextInt();
		
		System.out.println("수학 점수 입력 : ");
		int math = scan.nextInt();
		
		System.out.println("영어 점수 입력 : ");
		int eng = scan.nextInt();
		
		//총점
		int total = kor + math + eng;
		
		//평균
		double avg = total / 3.0;
		
		System.out.println("총점 : "+total+"점");
		//System.out.println("평균 : "+avg+"점");
		
		System.out.printf("평균 : %.2f점",avg); //형식이 있을 때 printf
		
		
//		System.out.println("국어 : "+kor+"점");
//		System.out.println("수학 : "+math+"점");
//		System.out.println("영어 : "+eng+"점");

	}

}
