
public class 문제02 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*100);
		
		if(num%3==0)
			System.out.println(num+"은(는) 3의 배수입니다.");
		else
			System.out.println(num+"은(는) 3의 배수가 아닙니다.");

	}

}
