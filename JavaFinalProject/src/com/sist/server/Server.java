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
		 	스레드가 작동하는 과정
		 	생성
		 	 new Thread() =====> 대기 상태 =====> Running =====> 대기
		 	 			  start()		 run()	  │	   sleep()
		 	 									 Dead => interrupt()
		 	 									 
		4. 서버의 역할
		 1) 저장(클라이언트 정보)
		 	waitVc(Vector)
		 2) 검색
		 3) 수정
		 4) 클라이언트로 전송
		 5) 요청 처리 기능
 */
package com.sist.server;
import java.util.*;
import com.sist.common.Function;
import java.net.*;
import java.io.*;
public class Server implements Runnable {
	// 클라이언트 접속시 정보 저장 => IP
	private Vector<Client> waitVc = new Vector<Client>(); // Vector => 동기화
	private ServerSocket ss;
	private final int PORT = 11111;
	
	// 서버 가동 => 한 컴퓨터 안에서는 서버를 두개 실행할 수 없다
	public Server()
	{
		try {
			ss = new ServerSocket(PORT); // 뒤에 숫자 안쓰면 디폴트 50명
			System.out.println("Server Start...");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	// 접속시마다 처리
	public void run()
	{
		try{
			while(true)
			{
				Socket s = ss.accept();
				// 접속시마다 발신자 정보 확인 => 전화번호 => Socket(ip)
				Client client = new Client(s);
				//waitVc.add(client);
				client.start(); // 클라이언트마다 따로 생성 => 각자 통신이 가능하게 만든다
			}
		}catch(Exception ex) {}
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();
		// 서버 클래스 안에 있는 run을 호출
	}
	
	// 통신 서버 => 저장된 클라이언트 정보 사용
	class Client extends Thread
	{
		//내부 클래스 => 클래스끼리 공유하는 변수 / 메소드가 있는 경우 => 서버 프로그램 / 빅데이터 프로그램
		String id, name, sex;
		
		// 클라이언트가 보낸 값 읽기
		BufferedReader in;
		
		// 클라이언트에게 결과값 전송
		OutputStream out;
		
		// 클라이언트와 연결 ==> 연결 기기(전화기)
		Socket s;
		
		// 연결 시도
		public Client(Socket s)
		{
			try{
				this.s = s;
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch(Exception ex) {}
		}
		
		// 개인적으로 전송
		public synchronized void messageTo(String msg)
		{
			// synchronized : 동기화 => 디폴트는 비동기화임
			try {
				out.write((msg+"\n").getBytes());
				// Byte 단위 => Char단위로 변경 => InputStreamReader()
			}catch(Exception ex) {}
		}
		
		// 접속자 전체 전송
		public synchronized void messageAll(String msg)
		{
			try {
				for(Client c : waitVc)
				{
					c.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		
		// 요청에 대한 처리
		public void run()
		{
			while(true) {
			try{
				//요청값 받음
				String msg = in.readLine();
				
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.LOGIN:
					{
						id = st.nextToken();
						name = st.nextToken();
						sex = st.nextToken();
						
						// 이미 접속한 사람에게 정보 전송
						messageAll(Function.LOGIN+"|"+id+"|"+name+"|"+sex);
						
						//waitVc에 첨부
						waitVc.add(this);
						
						// 로그인은 종료 => main창을 보여준다
						messageTo(Function.MYLOG+"|"+name+"|"+id);
						
						// 로그인 하는 사람에게 모든 정보 전송
						for(Client user:waitVc)
						{
							messageTo(Function.LOGIN+"|"+user.id+"|"+user.name+"|"+user.sex);
						}
					}
					break;
					
					case Function.CHAT:
					{
						String strMsg = st.nextToken();
						String color = st.nextToken();
						messageAll(Function.CHAT+"|["+name+"]"+strMsg+"|"+color);
					}
					break;
					
					case Function.INFO:
					{
						// 상대방 ID 받기
						String youId = st.nextToken();
						for(Client user:waitVc)
						{
							if(youId.equals(user.id))
							{
								messageTo(Function.INFO+"|"+user.id+"|"+user.name+"|"+user.sex);
								break;
							}
						}
					}
					break;
					
					case Function.MSGSEND:
					{
						String youId = st.nextToken();
						String strMsg = st.nextToken();
						for(Client user:waitVc)
						{
							if(youId.equals(user.id))
							{
								user.messageTo(Function.MSGSEND+"|"+id+"|"+strMsg);
								break;
							}
						}
					}
					break;
					
					case Function.EXIT:
					{
						String mid = st.nextToken();
						int i=0;
						for(Client user:waitVc)
						{
							if(user.id.equals(mid))
							{
								user.messageTo(Function.MYEXIT+"|");
								waitVc.remove(i);
								in.close();
								out.close();
								// 서버 종료
								break;
							}
							i++;
						}
						// 전체 메세지
						messageAll(Function.EXIT+"|"+mid);
					}
					break;
				}
			}catch(Exception ex) {}
			}
		}
		
	}

}
