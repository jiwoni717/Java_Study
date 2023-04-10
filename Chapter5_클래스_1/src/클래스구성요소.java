/*
 * 		자바 형식
 * 			package : 클래스의 위치 지정 => 한번 사용
 * 			import : 외부 라이브러리 불러올 때 => 여러번 사용이 가능
 * 			public class ClassName
 * 			{
 * 				------------------------------------------------
 * 				멤버변수
 * 					= 인스턴스 변수 => new를 사용할 때마다 메모리가 따라 생성
 * 					= 정적 변수(공유변수) => 메모리가 한개만 생성
 * 				-------------------------------------------------
 * 				생성자 : 메모리 할당시 호출되는 메소드
 * 					=> 멤버변수에 대한 초기화
 * 				-------------------------------------------------
 * 				메소드 : 특정 작업을 수행하는 명령문의 집합
 * 				-------------------------------------------------
 * 				main() : 프로그램의 시작점
 * 				-------------------------------------------------
 * 			}
 * 			===> OOP답게 변환(객체 지향 프로그램)
 * 				1) 데이터 보호(캡슐화)
 * 				2) 재사용(상속/포함)
 * 				3) 수정, 추가가 가능해야함(다형성) => 오버라이딩/오버로딩
 * 			===> 클래스의 종류(추상클래스 / 인터페이스)
 * 			===> 예외처리
 * 			------------------------------------------------ 자바언어의 기초
 * 			===> 라이브러리 : 사용자정의 라이브러리, 자바에서 지원하는 라이브러리, 외부 업체에서 지원하는 라이브러리(Jsoup)
 * 			
 * 		메소드 기초
 * 			메소드 : 한개의 기능을 수행할 목적
 * 				1.메소드 제작 목적
 * 					= 재사용(다른 클래스에서 사용하기 위해 만든다)
 * 					= 중복된 코드를 제거
 * 					ex)
 * 						데이터베이스 연결
 * 						------------ 목록
 * 						  오라클 연결*
 * 					  목록에 출력할 데이터 읽기
 * 						  오라클 닫기*
 *  					------------ 데이터 추가
 *  					  오라클 연결*
 * 						  데이터 추가
 * 						  오라클 닫기*
 *   					------------ 데이터 수정
 *   					  오라클 연결*
 * 						  데이터 수정
 * 						  오라클 닫기*
 *    					------------ 데이터 삭제
 *    					  오라클 연결*
 * 						  데이터 삭제
 * 						  오라클 닫기*
 * 						------------
 * 						= 구조화된 프로그램 = 단락을 나눠서 처리(에러...)
 * 				2. 메소드 형식
 * 					선언부
 * 					public static void main(String[] args)
 * 					구현부
 * 					{
 * 					}
 * 				3. 메소드 구성요소
 * 					결과값 메소드명(매개변수...)
 * 					---- 1개    --------- 여러개 사용 가능
 * 					=> 사용자의 요청값을 받아서 처리 결과값을 넘겨준다
 * 					   ---------- 매개변수		----- 리턴형
 * 					ex) 로그인
 * 						사용자 요청값 : ID, 비밀번호
 * 						결과값 : 로그인 여부(boolean)
 * 						boolean isLogin(String id, String pwd)
 * 
 * 						사칙연산
 * 						사용자 요청값(매개변수) : 정수 2개
 * 						결과값 : 정수 2개를 계산한 값
 * 					=> 
 * 					리턴형(결과값)		매개변수
 * 					---------------------
 * 					 O				  O
 * 					리턴형		메소드명(매개변수..)
 * 					String substring(int s, int e)
 *  				---------------------
 *  				 O				  X
 *  				리턴형		   메소드명()
 *  				String trim()
 *  				double random()
 *   				---------------------
 *   				 X				  O
 *   				void		메소드명(매개변수..)
 *   				void main(String[] arg)
 *   				void println(String a) => 출력만 하지 결과값x
 *    				---------------------
 *    				 X				  X
 *    				void		   메소드명()
 *    				void println()
 *     				---------------------
 *     				리턴형 : 기본형, 배열, 클래스 가능
 *     				메소드명
 *     				= 알파벳이나 한글 사용 가능(알파벳은 대소문자 구분함)
 *     				= 숫자 사용 가능(맨앞은X)
 *     				= 특수문자 사용 가능(_, $)
 *     				= 키워드는 사용할 수 없다.
 *     				= 공백이 있으면 안된다.
 *     				= 소문자로 시작한다(약속사항)
 *     					ㄴ 두개의 단어가 연결 : 두번쨰 시작은 대문자, _ (ex fileName. file_name)
 *     				매개변수 : 사용자가 요청한 값 => 3개이상은 배열이나 클래스
 *     						ex) 게시판 글쓰기, 수정, 회원가입
 *     				
 *     		형식
 *     			두개의 정수를 보내주고 => 더한값을 받는다
 *     			int add(int a, int b) // 선언부
 *     			--- 더 큰 데이터형 가능
 *     			{
 *     				// 구현부
 *     				int c = a+b;
 *     				return c;
 *     					  --- 데이터형이 작거나 같아야함
 *     			}
 * 
 * 				void gugudan()
 * 				---- 결과값이 없이 자체에서 출력
 * 				{
 * 					구구단 출력
 * 
 * 					return; ==> 메소드는 종료시점이 return에서 종료
 * 					------- void일 때는 생략이 가능하지만 생략하게되면 컴파일러가 자동으로 return을 추가한다
 * 				}
 * 
 * 			변수(20%) / 메소드(80%)
 * 
 * 		메소드 사용 방법
 * 			= 프로그램
 * 				1. 재사용
 * 				2. 가독성 : 보기 편하다 => 유지보수가 쉬움
 * 				3. 반복 제거 : 소스양을 줄여야함
 * 			= 모든 프로그램 => 메소드 제작
 * 				1. 사용자 입력
 * 				2. 사용자 요청 처리 => 세분화
 * 				3. 결과값 출력
 * 
 * 		메소드 호출
 * 			리턴형이 있는 경우 =======> 데이터형 변수명 = 메소드명()
 * 			int add(int a, int b)
 * 			{
 * 				return a+b;
 * 			}
 * 
 * 			int c = add(10, 20)
 * 			리턴형이 없는 경우(void)==> 메소드명()
 * 			void gugudan()
 * 			{
 * 				구구단 출력
 * 			}
 * 
 * 			gugudan()
 * 			
 * 			=> 메소드를 호출하면 메소드 전체를 수행하고 호출된 위치로 다시 복귀
 * 				main()
 * 				{
 * 					1
 * 					2
 * 					3
 * 					gugudan() ====> 7 8 9 10 11
 * 					4
 * 					5
 * 					6
 * 				}
 * 				void gugudan()
 * 				{
 * 					7
 * 					8
 * 					9
 * 					10
 * 					11
 * 				}
 * 				실행순서 : 1 2 3 7~11 4 5 6
 * 
 * 			return은 항상 마지막에 있다
 * 			중간에 있는 경우도 있다 => 메소드 종료
 * 
 * 			
 */
// 1. 3개의 정수를 받아서
// 2. 총점, 평균, 학점을 구해서 출력
import java.util.Scanner;
public class 클래스구성요소 {
	/*
	 * 		메소드
	 * 		1) 인스턴스 메소드 => 객체 생성시마다 따로 저장
	 * 			class A
	 * 			{
	 * 				void display(){}
	 * 			}
	 * 			A a = new A() => display()
	 * 			A b = new A() => display()
	 * 			A c = new A() => display()
	 * 		2) 정적 메소드 => 한개의 공간에만 저장(JVM에 의해 메모리에 자동 저장)
	 * 			static
	 * 		3) 추상 메소드 => 선언만 하는 메소드(추상클래스, 인터페이스)
	 * 			abstract
	 * 		4) 종단 메소드 => 수정이 불가능한 메소드
	 * 			final
	 */
	static int input(String subject)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print(subject +" 점수 입력 : ");
		int value = scan.nextInt();
		
		return value;
	}
	static int totalGesan(int kor, int eng, int math, int hi, int phy)
	{
		return kor+eng+math+hi+phy;
	}
	static double avgGesan(int total)
	{
		return total/5.0;
	}
	static char scoreGesan(double avg)
	{
		char score = 'A';
		switch((int)(avg/10))
		{
		case 10:
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default :
			score = 'F';
		}
		return score;
	}
	public static void main(String[] args) {		
		//반복 제거
		int kor = input("국어");
		int eng = input("영어");
		int math = input("수학");
		int hi = input("국사");
		int phy = input("물리");
		System.out.println("국어 : "+kor+"점");
		System.out.println("영어 : "+eng+"점");
		System.out.println("수학 : "+math+"점");
		System.out.println("국사 : "+hi+"점");
		System.out.println("물리 : "+phy+"점");
		
		//총점 계산
		int total = totalGesan(kor, eng, math, hi, phy); // 갯수가 많으면 배열로 넘기기
		System.out.println("총점 : "+total+"점");
		
		//평균 계산
		double avg = avgGesan(total);
		System.out.printf("평균 : %.2f점\n",avg);
		
		//학점 계산
		char score = scoreGesan(avg);
		System.out.println("학점 : "+score);
	}

}
