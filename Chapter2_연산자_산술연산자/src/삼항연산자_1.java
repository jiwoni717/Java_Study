
public class 삼항연산자_1 {

	public static void main(String[] args) {
		
		int no = (int)(Math.random()*2); // 0과 1만 나옴
		char c1 = (char)((Math.random()*26)+65); //대문자
		char c2 = (char)((Math.random()*26)+97); //소문자
		char res = (no==0?c1:c2); // 0이 나오면 대문자 1이면 소문자
		
		System.out.println(res);
		System.out.println(res>='A' && res<='Z'?
				res+"는(은) 대문자다.":res+"는(은) 소문자다.");

	}

}
