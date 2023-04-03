//4년에 한번 100년에 한번은 빼고 400년에 한번 포함
import java.util.Scanner;
public class 문제04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = scan.nextInt();
		
		if((year%4==0 && year%100!=0) || (year%400==0))
		{
			System.out.println(year+"년도는 윤년입니다.");
		}
		else
			System.out.println(year+"년도는 윤년이 아닙니다.");
	}

}
