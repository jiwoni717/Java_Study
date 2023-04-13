
/*
 * 		1. 같은 자바파일에 클래스 여러개를 만들 수 있다.
 * 		   ---------------
 * 		   public은 한개의 클래스에만 사용이 가능
 * 		2. 권장사항 : 파일을 따로 만든다
 */
class category{
	String poster;
	String title;
	String subject;
	int no; // 구분자 -> 중복이 안된 숫자 -> primary key -> 상세보기가능
}
/*
 * 		멤버변수(인스턴스변수)
 * 		---------------
 * 		1. 기본형
 * 		2. 배열
 * 		3. 클래스
 */
class foodHouse_2 {
	int no;
	int cno; // 카테고리 번호 -> 참조키 -> foreign key
	String[] poster = new String[5];
	String name;
	double score;
	String address1, address2;
	String tel;
	String type;
	String price;
	String parking;
	String stime, etime;
	String hol;
	String menu;
}
public class 사용자정의_데이터형_3 {

	public static void main(String[] args) {
		
		
	}

}
