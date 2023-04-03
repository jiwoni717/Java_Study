// 성적 계산 == A+(97점 이상), A0, A-
import java.util.Scanner;
public class 다중조건문_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("세개의 정수를 입력하시오(90 80 70) : ");
		int kor = scan.nextInt();
		int math = scan.nextInt();
		int eng = scan.nextInt();
		
		int avg = (kor+eng+math)/3; // 학점 계산용
		
		System.out.println("국어 점수 : "+kor);
		System.out.println("수학 점수 : "+math);
		System.out.println("영어 점수 : "+eng);
		
		System.out.println("총점 : "+(kor+math+eng));
		System.out.printf("평균 : %.2f \n",(kor+math+eng)/3.0);
		
		//학점 계산 / 옵션(+,-,0)
		char score = 'F'; // 값이 변경이 없는 경우 처리되는 값
		char op = '-';
		if(avg>=90)
		{
			score = 'A';
			if(avg>=97)
				op = '+';
			else if(avg>=94)
				op = '0';
		}
		
		else if(avg>=80)
		{
			score = 'B';
			if(avg>=87)
				op = '+';
			else if(avg>=84)
				op = '0';
		}
		
		else if(avg>=70)
		{
			score = 'C';
			if(avg>=77)
				op = '+';
			else if(avg>=74)
				op = '0';
		}
		
		else if(avg>=60)
		{
			score = 'D';
			if(avg>=67)
				op = '+';
			else if(avg>=64)
				op = '0';
		}
		
		else
		{
			score = 'F';
			op = ' ';
		}

		System.out.println("학점 : "+score+op); // score+op를 괄호로 묶으면 연산처리 됨

	}

}
