import java.util.Scanner;
public class 문제07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세개의 정수를 입력하시오(ex 80 90 94) : ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		int total = kor+eng+math;
		double avg = total/3.0;
		char a = 'A';
		
		if(avg>=90 && avg<=100)
			a = 'A';
		if(avg>=80 && avg<90)
			a = 'B';
		if(avg>=70 && avg<80)
			a = 'C';
		if(avg>=60 && avg<70)
			a = 'D';
		if(avg<60)
			a = 'F';
		
		System.out.println("국어점수 : "+kor+"점");
		System.out.println("영어점수 : "+eng+"점");
		System.out.println("수학점수 : "+math+"점");
		System.out.println("총합 : "+total+"점");
		System.out.printf("평균 : %.2f 점\n",avg);
		System.out.println("학점 : "+a);

	}

}
