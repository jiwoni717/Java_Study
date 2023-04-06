// 년도 / 월 / 일을 입력하면 요일이 나온다~~~~
// => Calendar
import java.util.Scanner;
public class 배열_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("년도를 입력하시오 : ");
		int year = scan.nextInt();
		System.out.print("월을 입력하시오 : ");
		int month = scan.nextInt();
		System.out.print("일을 입력하시오 : ");
		int day = scan.nextInt();
		
		// 요일
		char[] strWeek = {'일','월','화','수','목','금','토'};
		
		// 각 달의 마지막 날
		int[] lastday ={31,28,31,30,31,30,
				31,31,30,31,30,31};
		
		// 윤년일 때
		if((year%4==0 && year%100!=0)||(year%400==0))
			lastday[1]=29;
		else
			lastday[1]=28;
		
		// 1년도 1월 1일 ~ 전년도까지의 총날수
		int total = (year-1)*365 
				+ (year-1)/4 
				- (year-1)/100 
				+ (year-1)/400;
		
		// 전달까지의 합
		for(int i=0;i<month-1;i++)
		{
			total+=lastday[i];
		}
		total+=day;
		
		// 요일 구하기
		int week = total%7;
		
		System.out.printf("%d년 %d월 %d일은 %c요일입니다.",year,month,day,strWeek[week]);

	}

}
