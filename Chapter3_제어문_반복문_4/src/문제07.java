import java.util.Scanner;
public class 문제07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		if(score>=60 && score<=100)
			System.out.println("합격");
		else if(score>100)
			System.out.println("점수를 잘못 입력하였습니다.");
		else
			System.out.println("불합격");

	}

}
