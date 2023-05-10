package com.sist.temp;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.sist.manager.*;

public class BoardDetailPanel extends JPanel implements ActionListener {
	ControlPanel cp;
	JLabel titleLa, la1, la2, la3, la4, la5, noLa, nameLa, dateLa, hitLa, subLa;
	JTextPane pane;
	JButton b1,b2,b3;
	
	BoardManager bm = new BoardManager();
	
	public BoardDetailPanel(ControlPanel cp)
	{
		// 초기화
		this.cp = cp;
		titleLa = new JLabel("내용 보기");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		la1 = new JLabel("번호");
		la1.setHorizontalAlignment(JLabel.CENTER);
		
		la2 = new JLabel("작성일");
		la2.setHorizontalAlignment(JLabel.CENTER);
		
		la3 = new JLabel("이름");
		la3.setHorizontalAlignment(JLabel.CENTER);
		
		la4 = new JLabel("조회수");
		la4.setHorizontalAlignment(JLabel.CENTER);
		
		la5 = new JLabel("제목");
		la5.setHorizontalAlignment(JLabel.CENTER);
		
		noLa = new JLabel();
		nameLa = new JLabel();
		subLa = new JLabel();
		dateLa = new JLabel();
		hitLa = new JLabel();
		
		pane = new JTextPane();
		JScrollPane js = new JScrollPane(pane);
		
		b1 = new JButton("수정");
		b2 = new JButton("삭제");
		b3 = new JButton("목록");
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2); p.add(b3);
		
		// 배치
		setLayout(null);
		titleLa.setBounds(0, 20, 860, 40);
		
		la1.setBounds(10, 65, 60, 30); noLa.setBounds(75, 65, 300, 30);
		
		la2.setBounds(385, 65, 60, 30); dateLa.setBounds(450, 65, 300, 30);
		
		la3.setBounds(10, 100, 60, 30); nameLa.setBounds(75, 100, 300, 30);
		
		la4.setBounds(385, 100, 60, 30); hitLa.setBounds(450, 100, 300, 30);
		
		la5.setBounds(10, 140, 60, 30); subLa.setBounds(75, 140, 615, 30);
		
		js.setBounds(10, 175, 675, 150);
		
		p.setBounds(10, 330, 675, 30);
		
		add(titleLa);
		add(la1); add(noLa);
		add(la2); add(dateLa);
		add(la3); add(nameLa);
		add(la4); add(hitLa);
		add(la5); add(subLa);
		add(js);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b3)
		{
			cp.card.show(cp, "board");
			cp.bp.boardPrint();
		}
		else if(e.getSource()==b1)
		{	// 수정
			int no = Integer.parseInt(noLa.getText());
			BoardVO vo = bm.boardUpdateData(no);
			cp.bup.tf1.setText(vo.getName());
			cp.bup.tf2.setText(vo.getSubject());
			cp.bup.ta.setText(vo.getContent());
			cp.bup.la5.setText(String.valueOf(no));
			cp.bup.pf.setText("");
			cp.card.show(cp, "bup");
		}
		else if(e.getSource()==b2)
		{	// 삭제
			cp.bdelp.la1.setText(noLa.getText());
			cp.bdelp.pf.setText("");
			cp.card.show(cp, "delete");
		}
		
	}
}
