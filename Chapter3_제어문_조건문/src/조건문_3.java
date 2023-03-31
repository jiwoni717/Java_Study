// 3개의 정수를 입력을 받아서 총점 / 평균 / 학점
import java.util.Scanner;
public class 조건문_3 {

	public static void main(String[] args) {
		
		int kor,eng,math;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오(80 90 70) : ");
		kor = scan.nextInt();
		eng = scan.nextInt();
		math = scan.nextInt();
		
		// 결과값 출력
		int total = kor+eng+math;
		double avg = total/3.0;
		
		//학점
		int temp = (int)avg;
		char score = ' ';
		
		if(temp>=90 && temp<=100) // 독립적인 문장 => 모든 if 다 수행 = 속도가 느림
			score = 'A';
		
		if(temp>=80 && temp<90)
			score = 'B';
		
		if(temp>=70 && temp<80)
			score = 'C';
		
		if(temp>=60 && temp<70)
			score = 'D';
		
		if(temp<60)
			score = 'F';
		
		System.out.println("국어점수 : "+kor+"점");
		System.out.println("영어점수 : "+eng+"점");
		System.out.println("수학점수 : "+math+"점");
		System.out.println("총점 : "+total+"점");
		System.out.printf("평균 : %.2f점\n",avg);
		System.out.println("학점 : "+score);
		
		

	}

}
