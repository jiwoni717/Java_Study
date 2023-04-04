import java.util.Scanner;
public class 반복문_문제02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("문자를 입력하시오 : ");
		char ch = scan.next().charAt(0);
		
		if(ch!=' ' && ch!='	')
		{
			System.out.println("true");
		}
		else
			System.out.println("false");

	}

}
