package com.sist.server;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.*;
import java.util.*;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.table.*;
import javax.swing.text.Document;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;

import com.sist.common.Function;
public class ClientMain extends JFrame implements ActionListener, Runnable {
	
	JTextPane pane; // 편집이 가능
	JTextField tf;
	JButton b1, b2;
	JTable table;
	JComboBox<String> box;
	DefaultTableModel model;
	
	//네트워크에 필요한 클래스 설정
	Socket s;
	BufferedReader in; // 서버에서 보내주는 데이터를 읽음
	OutputStream out; // 서버에 요청
	
	public ClientMain()
	{
		// 초기화
		pane = new JTextPane();
		pane.setEditable(false);
		JScrollPane js1 = new JScrollPane(pane);
		tf = new JTextField();
		box = new JComboBox<String>();
		box.addItem("black");
		box.addItem("blue");
		box.addItem("yellow");
		box.addItem("green");
		box.addItem("pink");
		box.addItem("orange");
		box.addItem("cyan");
		
		b1 = new JButton("서버 연결");
		b2 = new JButton("서버 해제");
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		
		// 테이블
		String[] col = {"아이디","이름","성별"};
		String[][] row = new String[0][3];
		model = new DefaultTableModel(row,col);
		table = new JTable(model);
		JScrollPane js2 = new JScrollPane(table);
		
		// 배치
		setLayout(null);
		js1.setBounds(10, 15, 600, 600);
		tf.setBounds(20, 620, 460, 30);
		box.setBounds(480, 620, 115, 30);
		js2.setBounds(620, 15, 230, 250);
		p.setBounds(620, 270, 230, 35);
		
		add(js1);
		add(tf);
		add(box);
		add(js2);
		add(p);
		
		String[] data = {"hong", "홍길동", "남자"};
		model.addRow(data);
		
		setSize(900, 700);
		setVisible(true);
		
		b1.addActionListener(this); // 서버 연결
		tf.addActionListener(this); // 채팅
	}
	
	public static void main(String[] args) {
		new ClientMain();
	}
	
	public void initStyle()
	{
		Style black = pane.addStyle("black", null);
		StyleConstants.setForeground(black, Color.black);
		
		Style blue = pane.addStyle("blue", null);
		StyleConstants.setForeground(blue, Color.blue);
		
		Style yellow = pane.addStyle("yellow", null);
		StyleConstants.setForeground(yellow, Color.yellow);
		
		Style pink = pane.addStyle("pink", null);
		StyleConstants.setForeground(pink, Color.pink);
		
		Style green = pane.addStyle("green", null);
		StyleConstants.setForeground(green, Color.green);
		
		Style cyan = pane.addStyle("cyan", null);
		StyleConstants.setForeground(cyan, Color.cyan);
		
		Style orange = pane.addStyle("orange", null);
		StyleConstants.setForeground(orange, Color.orange);
	}
	
	public void append(String msg, String color)
	{
		try {
			Document doc = pane.getDocument();
			doc.insertString(doc.getLength(), msg+"\n", pane.getStyle(color));
		}catch(Exception ex) {}
	}
	
	// 서버와 연동
	@Override
	public void run() {
		try{
			while(true)
			{
				// 서버에서 들어온 값을 받음
				String msg = in.readLine();
				StringTokenizer st = new StringTokenizer(msg, "|");
				int protocol = Integer.parseInt(st.nextToken());
				switch(protocol)
				{
					case Function.CHAT:
					{
						initStyle();
						append(st.nextToken(), st.nextToken());
					}
					break;
				}
			}
		}catch (Exception ex) {}
	}
	
	// 버튼 눌렀을 때
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				s = new Socket("localhost",11111);
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				out = s.getOutputStream();
			}catch (Exception ex) {}
			new Thread(this).start();
		}
		else if(e.getSource()==tf)
		{
			try {
				// 입력한 데이터 읽기
				String msg = tf.getText();
				if(msg.length()<1) return;
				String color = box.getSelectedItem().toString();
				out.write((Function.CHAT+"|"+msg+"|"+color+"\n").getBytes());
				tf.setText("");
			}catch(Exception ex) {}
		}
	}
}
