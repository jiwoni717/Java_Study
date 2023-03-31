import java.util.Scanner;
public class 문제04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("세개의 정수를 입력하시오(ex 80 90 70) : ");
		int a = scan.nextInt();
		System.out.println("a : "+a);
		int b = scan.nextInt();
		System.out.println("b : "+b);
		int c = scan.nextInt();
		System.out.println("c : "+c);
		
		int total = a+b+c;
		double avg = total/3.0;
		int max = a;
		int min = a;
		
		System.out.println("total : "+total);
		System.out.printf("평균 : %.2f \n",avg);
		
		// 최대
		if(b>max)
			max = b;
	
		if(c>max)
			max = c;
		System.out.println("최대값 : "+max);
		
		// 최소
		if(b<min)
			min = b;

		if(c<min)
			min = c;
		System.out.println("최소값 : "+min);
	}

}
