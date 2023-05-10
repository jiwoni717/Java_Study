package com.sist.temp;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sist.manager.BoardManager;
import com.sist.manager.BoardVO;

public class BoardUpdatePanel extends JPanel implements ActionListener {
	
	ControlPanel cp;
	JLabel titleLa;
	JLabel la1, la2, la3, la4, la5;
	JTextField tf1, tf2;
	JPasswordField pf;
	JTextArea ta;
	JButton b1, b2;
	BoardManager bm = new BoardManager();
	
	public BoardUpdatePanel(ControlPanel cp)
	{
		// 초기화
		this.cp = cp;
		titleLa = new JLabel("수정하기");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		la1 = new JLabel("이름");
		la2 = new JLabel("제목");
		la3 = new JLabel("내용");
		la4 = new JLabel("비밀번호");
		la5 = new JLabel("");
		la5.setVisible(false);
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		ta = new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		pf = new JPasswordField();
		
		b1 = new JButton("수정");
		b2 = new JButton("취소");
		
		
		
		// 배치
		setLayout(null);
		titleLa.setBounds(0, 20, 860, 40);
		
		la1.setBounds(40, 80, 60, 30);
		tf1.setBounds(103, 80, 150, 30);
		
		la2.setBounds(40, 115, 60, 30);
		tf2.setBounds(103, 115, 450, 30);
		
		la3.setBounds(40, 150, 60, 30);
		js.setBounds(103, 150, 450, 450);
		
		la4.setBounds(40, 605, 60, 30);
		pf.setBounds(103, 605, 150, 30);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(10, 660, 860, 30);
		
		add(titleLa);
		add(la1); add(tf1);
		add(la2); add(tf2);
		add(la3); add(js);
		add(la4); add(pf);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String name = tf1.getText();
			if(name.length()<1)
			{
				tf1.requestFocus();
				return;
			}
			
			String subject = tf2.getText();
			if(subject.length()<1)
			{
				tf2.requestFocus();
				return;
			}
			
			String content = ta.getText();
			if(content.length()<1)
			{
				ta.requestFocus();
				return;
			}
			
			String pwd = String.valueOf(pf.getPassword()); //pf→char 배열
			if(pwd.length()<1)
			{
				pf.requestFocus();
				return;
			}
			
			BoardVO vo = new BoardVO();
			vo.setName(name);
			vo.setContent(content);
			vo.setSubject(subject);
			vo.setPwd(pwd);
			vo.setNo(Integer.parseInt(la5.getText()));
			
			String res = bm.boardUpdate(vo);
			if(res.equals("NO"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				pf.setText("");
				pf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "수정 완료!");
				BoardVO dvo=bm.boardDetailDate(Integer.parseInt(la5.getText()));
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				cp.bdp.pane.setText(vo.getContent());
				cp.card.show(cp, "bdp");
			}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "bdp");
		}
		
	}
}
