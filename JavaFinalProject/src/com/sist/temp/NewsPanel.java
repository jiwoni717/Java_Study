package com.sist.temp;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;

import com.sist.manager.NaverNewsManager;
import com.sist.manager.NewsVO;

public class NewsPanel extends JPanel implements ActionListener {
	
	NewsCard[] cards = new NewsCard[10];
	JTextField tf;
	JButton b1;
	JPanel pan;
	
	public NewsPanel()
	{
		// 초기화
		tf = new JTextField();
		b1 = new JButton("검색");
		
		for(int i=0;i<cards.length;i++)
		{
			cards[i] = new NewsCard();
			
		}
		
		pan = new JPanel();
		pan.setLayout(new GridLayout(5,1,5,5));
		setLayout(null);
		
		// 배치
		tf.setBounds(300, 20, 200, 30);
		b1.setBounds(505, 20, 70, 30);
		pan.setBounds(10, 55, 840, 690);
		add(tf); add(b1);
		add(pan);
		
		// 등록
		tf.addActionListener(this);
		b1.addActionListener(this);
		
		newsPrint("음악");
	}
	
	public void newsPrint(String fd)
	{
		List<NewsVO> list = NaverNewsManager.newsSearchData(fd);
		int i=0;
		for(NewsVO vo : list)
		{
			cards[i].titleLa.setText(vo.getTitle());
			cards[i].contentTa.setText(vo.getContent());
			cards[i].dateLa.setText(vo.getDate());
			pan.add(cards[i]);
			i++;
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==tf || e.getSource()==b1)
		{
			String fd = tf.getText();
			// 유효성 검사
			if(fd.length()<1)
			{
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요.");
				tf.requestFocus();
				return;
			}
			newsPrint(fd);
		}
	}
}
