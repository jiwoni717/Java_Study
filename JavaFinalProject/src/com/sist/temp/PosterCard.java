package com.sist.temp;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.net.*;
import com.sist.common.ImageChange;
import com.sist.manager.GenieMusicVO;
public class PosterCard extends JPanel {
	JLabel poLa = new JLabel(); // 이미지 출력
	JLabel tLa = new JLabel(); // 제목
	
	public PosterCard(GenieMusicVO vo)
	{
		setLayout(null);
		poLa.setBounds(5, 5, 150, 130);
		tLa.setBounds(5, 135, 150, 30);
		
		add(poLa);
		add(tLa);
		
		try {
			URL url = new URL("http:"+vo.getPoster());
			Image img = ImageChange.getImage(new ImageIcon(url), 150, 130);
			poLa.setIcon(new ImageIcon(img));
			tLa.setText(vo.getTitle());
		} catch(Exception ex) {}
	}
}
