// 성적 계산
// 세개의 정수를 받아 평균을 구해서 등급 출력
/*
 *  >=90
 *  >=80
 *  >=70
 *  >=60
 *  -------else
 */
import java.util.Scanner;
public class 다중조건문_2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// System.in => 키보드 입력값을 받아 메모리에 저장
		//		정수 : nextInt(); / 실수 : nextDouble(); / 논리 : nextBoolean(); / 문자열 : next();
		//		=> char는 존재하지 않는다. => next.charAT(); 사용
		// Scanner는 도스에서만 사용 가능
		int kor,eng,math;
		System.out.print("세개의 정수를 입력하시오(90 80 70) : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		int avg = (kor+eng+math)/3;
		
		System.out.println("국어 점수 : "+kor);
		System.out.println("영어 점수 : "+eng);
		System.out.println("수학 점수 : "+math);
		
		System.out.println("총점 : "+(kor+eng+math));
		System.out.printf("평균 : %.2f \n",(kor+eng+math)/3.0);
		
		//학점 계산
		char score = 'F'; // 값이 변경이 없는 경우 처리되는 값
		if(avg>=90)
			score = 'A';
		else if(avg>=80)
			score = 'B';
		else if(avg>=70)
			score = 'C';
		else if(avg>=60)
			score = 'D';
		else // 생략가능
			score = 'F';
		System.out.println("학점 : "+score);
		
	}

}
