package com.sist.client;

import java.awt.Font;

import javax.swing.*;

import com.sist.manager.BoardManager;

public class BoardUpdatePanel {
	ControlPanel cp;
    JLabel titleLa;
    JLabel la1,la2,la3,la4,la5;
    JTextField tf1,tf2;
    JPasswordField pf;
    JTextArea ta;
    JButton b1,b2;
    BoardManager bm=new BoardManager();
	
	public BoardUpdatePanel(ControlPanel cp) {
		this.cp=cp;

		titleLa = new JLabel("수정하기");
		titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 45));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		 la1=new JLabel("이름");//<label for="name">이름</label>
    	 la2=new JLabel("제목");
    	 la3=new JLabel("내용");
    	 la4=new JLabel("비밀번호");
    	 la5=new JLabel("");
    	 la5.setVisible(false);
    	 tf1=new JTextField();//<input type=text>
    	 tf2=new JTextField();
    	 ta=new JTextArea();//<textarea></textarea>
    	 JScrollPane js=new JScrollPane(ta);
    	 pf=new JPasswordField();//<input type=password>
    	 
    	 b1=new JButton("수정");//<input type=button>
    	 b2=new JButton("취소");
	}
}
