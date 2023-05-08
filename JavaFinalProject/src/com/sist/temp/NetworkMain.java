package com.sist.temp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import com.sist.common.Function;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
import com.sist.manager.MusicSystem;
// ↓ 네트워크 관련
import java.util.*;
import java.util.List;
import java.io.*;
import java.net.*;
/*
 		프로그램 => 2개
 		1) 로그인, 채팅문자열 입력... => 일반 사용자
 		2) 서버에서 전송되는 데이터 출력 => 스레드
 */
public class NetworkMain extends JFrame implements ActionListener,Runnable{
	
	MenuPanel mp;
	ControlPanel cp;
	TopPanel tp;
	JButton b1,b2,b3,b4,b5;
	JLabel logo;
	Login login = new Login();
	
	//페이지 지정
	int curpage = 1;
	int totalpage = 0;
	MusicSystem ms = new MusicSystem();
	
	//네트워크와 관련된 클래스
	//1.서버연결
	Socket s; // 서버의 메모리 연결
	//2.서버에서 보내준 값을 받음
	BufferedReader in;
	//3.서버로 값을 보냄
	OutputStream out;
	
	public NetworkMain()
	{
		setTitle("네트워크 뮤직 프로그램");
		
		mp = new MenuPanel();
		cp = new ControlPanel();
		tp = new TopPanel();
		
		setLayout(null); // 사용자 정의 레이아웃
		
		logo = new JLabel();
		Image img = ImageChange.getImage(new ImageIcon("C:\\javaDev\\Music.png"), 20, 20);
		logo.setIcon(new ImageIcon(img));
		
		mp.setBounds(15, 150, 80, 200);
		cp.setBounds(110, 10, 850, 750);
		tp.setBounds(980, 10, 200, 750);
		
		b1 = new JButton("홈");
		b2 = new JButton("음악 검색");
		b3 = new JButton("채팅");
		b4 = new JButton("뉴스 검색");
		b5 = new JButton("음악 추천");
		mp.setLayout(new GridLayout(5,1,10,10));
		mp.add(b1); mp.add(b2); mp.add(b3); mp.add(b4); mp.add(b5);
		
		add(mp);
		add(cp);
		add(tp);
		add(logo);
		
		setSize(1200,800);
//		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		//로그인 처리
		login.b1.addActionListener(this);
		login.b2.addActionListener(this);
		
		//메인페이지
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage = ms.musicTotalPage();
		cp.hp.b1.addActionListener(this);
		cp.hp.b2.addActionListener(this);
		cp.hp.pageLa.setText(curpage+" page / "+totalpage+" pages");
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
		}catch(Exception ex) {}
		new NetworkMain();
	}
	
	public void musicDisplay()
	{
		List<GenieMusicVO> list = ms.musicListData(curpage);
		cp.hp.cardInit(list);
		cp.hp.cardPrint(list);
		totalpage = ms.musicTotalPage();
		cp.hp.pageLa.setText(curpage+" page / "+totalpage+" pages");
	}
	
	//버튼 처리
	@Override
	public void actionPerformed(ActionEvent e) {
		//메뉴 버튼
		if(e.getSource()==b1)
		{
			curpage = 1;
			musicDisplay();
			cp.card.show(cp, "home");
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "find");
		}
		else if(e.getSource()==b3)
		{
			cp.card.show(cp, "chat");
		}
		else if(e.getSource()==b4)
		{
			cp.card.show(cp, "news");
		}
		else if(e.getSource()==b5)
		{
			cp.card.show(cp, "recom");
		}
		else if(e.getSource()==login.b1)
		{
			// 로그인 데이터 읽기
			String id = login.tf1.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "ID를 입력하세요");
				login.tf1.requestFocus();
				return;
			}
			String name = login.tf2.getText();
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this, "이름을 입력하세요");
				login.tf2.requestFocus();
				return;
			}
			String sex = "남자";
			if(login.rb1.isSelected())
			{
				sex = "남자";
			}
			else
			{
				sex = "여자";
			}
			
			// 입력값(아이디, 이름, 성별)을 서버로 전송
			try {
				// 서버 연결, localhost는 나중에 서버 컴퓨터 IP로 변경할 것
				s = new Socket("localhost", 11111);
				
				//읽는 위치, 쓰는 위치
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
				
				//서버로 로그인 요청
				out.write((Function.LOGIN+"|"+id+"|"+name+"|"+sex+"\n").getBytes());
			}catch (Exception ex) {}
			//서버로 전송된 값을 받아온다
			new Thread(this).start(); // run() 호출
		}
		else if(e.getSource()==login.b2)
		{
			System.exit(0);
		}
		else if(e.getSource()==cp.cp.tf)
		{
			String msg = cp.cp.tf.getText();
			String color = cp.cp.box.getSelectedItem().toString();
			if(msg.length()<1) return;
			
			// 서버로 전송
			try {
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
			}catch(Exception ex) {}
			
			cp.cp.tf.setText("");
		}
		else if(e.getSource()==cp.hp.b1)
		{
			if(curpage>1)
			{
				curpage--;
				musicDisplay();
			}
		}
		else if(e.getSource()==cp.hp.b2)
		{
			if(curpage<totalpage)
			{
				curpage++;
				musicDisplay();
			}
		}
	}

	@Override
	public void run() {
		//서버에서 결과값을 받아서 출력 => 스레드(자동화)
		try {
			while(true)
			{
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.LOGIN :
					{
						// 로그인하면 정보 테이블에 추가 => 출력
						String[] data = {st.nextToken(), st.nextToken(), st.nextToken()};
						cp.cp.model.addRow(data);
					}
					break;
					// 모든 명령을 서버로부터 받아서 처리해야함
					case Function.MYLOG :
					{
						setTitle(st.nextToken());
						login.setVisible(false);
						setVisible(true);
					}
					break;
					
					case Function.CHAT :
					{
						cp.cp.initStyle();
						cp.cp.append(st.nextToken(), st.nextToken());
						//			   채팅 문자열			글씨 색상
					}
					break;
				}
			}
		}catch(Exception ex) {}
	}
	
}
