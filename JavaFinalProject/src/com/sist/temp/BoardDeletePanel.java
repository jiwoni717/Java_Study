package com.sist.temp;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.sist.manager.BoardManager;

public class BoardDeletePanel extends JPanel implements ActionListener {
	
	ControlPanel cp;
	JLabel titleLa, la1, la2;
	JPasswordField pf;
	JButton b1,b2;
	BoardManager bm = new BoardManager();
	
	public BoardDeletePanel(ControlPanel cp)
	{
		this.cp = cp;
		
		titleLa = new JLabel("삭제하기");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,45));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		la1 = new JLabel("비밀번호");
		pf = new JPasswordField();
		
		la2 = new JLabel();
		la2.setVisible(false);
		
		b1 = new JButton("삭제");
		b2 = new JButton("취소");
		
		setLayout(null);
		titleLa.setBounds(0, 20, 860, 40);
		
		la1.setBounds(200, 100, 80, 30);
		pf.setBounds(285, 100, 200, 30);
		
		JPanel p = new JPanel();
		p.add(b1); p.add(b2);
		p.setBounds(200, 175, 290, 35);
		
		add(titleLa);
		add(la2);
		add(la1); add(pf);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			String pwd = String.valueOf(pf.getPassword());
			if(pwd.length()<1)
			{
				pf.requestFocus();
				return;
			}
			
			String res = bm.boardDelete(Integer.parseInt(la1.getText()), pwd);
			
			if(res.equals("NO"))
			{
				JOptionPane.showMessageDialog(this, "비밀번호가 틀립니다.");
				pf.setText("");
				pf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "삭제되었습니다!");
				cp.card.show(cp, "board");
				cp.bp.boardPrint();
			}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "board");
		}
		
	}
}
