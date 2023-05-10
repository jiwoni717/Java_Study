package com.sist.temp;

import java.util.*;
import java.awt.*;
import javax.swing.*;
import com.sist.manager.*;
import java.awt.event.*;

public class DetailPanel extends JPanel implements ActionListener {
	JLabel imgLa;
	JLabel la1, la2, la3, la4, la5;
	JButton b1, b2;
	JLabel titleLa, singerLa, albumLa, stateLa, crementLa, keyLa;
	ControlPanel cp;
	
	public DetailPanel(ControlPanel cp)
	{
		this.cp = cp;
		
		// 초기화
		imgLa = new JLabel();
		la1 = new JLabel("제목 : ");
		la2 = new JLabel("가수명 : ");
		la3 = new JLabel("앨범명 : ");
		la4 = new JLabel("상태 : ");
		la5 = new JLabel("등폭 : ");
		b1 = new JButton("동영상");
		b2 = new JButton("목록");
		titleLa = new JLabel("");
		singerLa = new JLabel("");
		albumLa = new JLabel("");
		stateLa = new JLabel("");
		crementLa = new JLabel("");
		keyLa = new JLabel("");
		
		// 배치
		setLayout(null);
		imgLa.setBounds(275, 15, 300, 300);
		
		la1.setBounds(150, 350, 60, 20);
		titleLa.setBounds(215, 350, 300, 20);
		
		la2.setBounds(150, 375, 60, 20);
		singerLa.setBounds(215, 375, 300, 20);
		
		la3.setBounds(150, 400, 60, 20);
		albumLa.setBounds(215, 400, 300, 20);
		
		la4.setBounds(150, 425, 60, 20);
		stateLa.setBounds(215, 425, 300, 20);
		
		la5.setBounds(150, 450, 60, 20);
		crementLa.setBounds(215, 450, 300, 20);
		
		keyLa.setBounds(100, 480, 300, 40);
		keyLa.setVisible(false);
		
		JPanel p = new JPanel();
		p.add(b1);
		p.add(b2);
		p.setBounds(275, 530, 360, 40);
		
		//윈도우에 추가
		add(imgLa);
		add(la1); add(titleLa);
		add(la2); add(singerLa);
		add(la3); add(albumLa);
		add(la4); add(stateLa);
		add(la5); add(crementLa);
		add(keyLa);
		add(p);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	//C:\Program Files\Google\Chrome\Application\chrome.exe
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
										+"http://youtube.com/embed/"
										+keyLa.getText());
			}catch(Exception ex) {}
		}
		else if(e.getSource()==b2)
		{
			cp.card.show(cp, "home");
		}
		
	}
	
}
