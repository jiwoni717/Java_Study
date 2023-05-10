/*
 		기능 설정
 		클라이언트 => 서버로 요청 (어떤 기능인지 설정 => 번호로 구분)
 		웹에서는 파일명으로 구분한다
 		↓
 		내부 프로토콜 : 서버 / 클라이언트의 약속
 		
 		ex)
 			방 들어가기 => 먼저 들어간 사람 / 이제 들어가는 사람
 			방 나가기 => 남아 있는 사람 / 나가는 사람
 			채팅 종료 => 남아 있는 사람 / 채팅 종료하는 사람
 			-> 나눠서 다 처리를 해줘야 함.........
 */	
package com.sist.common;
public class Function {
	public static final int LOGIN = 100; // 로그인 처리(이미 로그인된 유저)
	public static final int MYLOG = 110; // 로그인 처리(로그인 하는 유저)
	public static final int CHAT = 200; // 채팅
	public static final int MSGSEND = 300; // 쪽지 보내기
	public static final int INFO = 400; // 정보 보기
	public static final int MYEXIT = 900; // 나가는사람
	public static final int EXIT = 990; // 남아있는 사람
}
