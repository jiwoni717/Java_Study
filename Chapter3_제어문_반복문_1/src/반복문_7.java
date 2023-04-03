// 1~100사이의 수 반복문 수행
// 11, 22, 33, 44, 55... ==두자리수가 같은 정수이다. / !=두자리수가 다른 정수이다.
public class 반복문_7 {

	public static void main(String[] args) {
		
		for(int i=10;i<=99;i++)
		{
			if(i%11==0)
				System.out.println(i+"는(은) 두자리수가 같은 정수입니다.");
			else
				System.out.println(i+"는(은) 두자리수가 다른 정수입니다.");
		}
		

	}

}
