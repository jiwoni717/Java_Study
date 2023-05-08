/*
		1. 전화 / 우편
			┌전화 : 신뢰성이 뛰어남, 속도가 느림 => TCP
			└우편 : 손실 우려가 있음, 속도가 빠름 => UDP
		 TCP + UDP의 장점 =====> RTCP(화상)
			↓
		2. TCP 제작
		 1) PORT => 연결선(전화선)
		 	0~65535까지 사용이 가능
		 	알려진 포트(이미 사용중인 포트)
		 		0 ~ 1023
		 		80 : http(웹)
		 		23 : telnet
		 		25 : smtp
		 		21 : ftp
		 		8080 : 프록시
		 		4000 : 머드서버
		 		1521 : 오라클 서버
		 		1433 : MS-SQL
		 		3306 : MySQL
		 		3000 : ReactJS
		 		화상은 30000번대, 음성은 20000번대
		 2) IP => 컴퓨터 구분(전화번호)
		 	서버는 1대 / 클라이언트는 여러대
		 	
		3. 프로그램 작성
		 1) 서버 동작
		 	ServerSocket ss = new ServerSocket(port 번호)
		 	 => bind() : 개통(ip,port) => 유심(개통)
		 	 => listen() : 클라이언트 연결시까지 대기
		 2) 클라이언트가 접속시 처리
		 	=> ss.accept() : 클라이언트가 서버 연결 호출(연결시마다 호출)
		 	=> 클라이언트 정보 (ip, port => Socket)
		 3) 클라이언트마다 따로 통신이 가능하게 넘겨준다
		 
 */
package com.sist.server;

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
