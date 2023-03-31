
public class 문제06 {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*2);
		char a;
		
		if(num==0)
			a = (char)((Math.random()*26)+65);
		else
			a = (char)((Math.random()*26)+97);
		
		if(a>='A' && a<='Z')
			System.out.println(a+"은(는) 대문자입니다.");
		else
			System.out.println(a+"은(는) 소문자입니다.");

	}

}
