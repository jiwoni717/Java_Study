/*
 * 	데이터 / 기능
 * 	명사형 / 동사형
 * 
 * 	번호 작성자 내용 제목 작성일 비밀번호 조회수 ===> 명사형(변수)
 * 	글쓰기 수정하기 내용보기 삭제하기 조회수 올리기 ===> 동사형(메소드)
 * 
 * 	학생 => 유형
 * 	게시판 => 무형
 * 	----------- 모든것을 단순화 => 객체 지향 프로그램
 * 	
 * 	클래스
 * 	 = 변수 여러개 저장 => 사용자정의 데이터형(데이터형 클래스)
 * 		~VO(Spring), ~DTO(MyBatis), ~Bean
 * 	  value   			 data
 * 	  object 		   transfer
 * 			  		    object
 * 	 = 기능만 설정하는 클래스 : ~DAO, ~Service, ~Manager => 액션 클래스
 * 						데이터베이스 브라우저	  
 * 						  연결	  전송
 * 	 = 변수+메소드 혼합 => 극히 드묾
 */
class Board {
	int no;
	String name;
	String subject;
	String content;
	String pwd; //본인여부 확인
	String regdate;
	int hit;
}
public class 사용자정의_데이터형_2 {

	public static void main(String[] args) {
		//첫번쨰 게시물
		Board b1 = new Board();
		System.out.println("b1 = "+b1); // Board@515f550a => 7개를 저장할 수 있는 메모리 공간 생성
		b1.no = 1;
		b1.name = "홍길동";
		b1.subject = "메모리 공간 만들기(사용자 정의)";
		b1.content = "class를 이용해 데이터를 모아서 관리";
		b1.regdate = "2023-04-12";
		b1.pwd = "1234";
		System.out.println("No.0"+b1.no);
		System.out.println("제목 : "+b1.subject);
		System.out.print(" 작성자 : "+b1.name);
		System.out.print("        게시일 : "+b1.regdate+"\n");
		System.out.println("   "+b1.content+"   ");
		System.out.println("조회수 : "+b1.hit);
		
		

	}

}
