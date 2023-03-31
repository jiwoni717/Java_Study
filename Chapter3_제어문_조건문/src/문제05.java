import java.util.Scanner;
public class 문제05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = scan.nextInt();
		
		if(num>0)
			System.out.println(num+"은(는) 양수입니다.");
		else
			System.out.println(num+"은(는) 음수입니다.");
	}
}
