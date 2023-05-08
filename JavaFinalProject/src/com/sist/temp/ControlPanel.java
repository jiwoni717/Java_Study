package com.sist.temp;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.*;
public class ControlPanel extends JPanel{
	NewsPanel np = new NewsPanel();
	ChatPanel cp = new ChatPanel();
	FindPanel fp = new FindPanel();
	HomePanel hp = new HomePanel();
	RecommandPanel rp = new RecommandPanel();
	CardLayout card = new CardLayout();
	public ControlPanel()
	{
		setLayout(card);
		add("home",hp);
		add("find",fp);
		add("news",np);
		add("chat",cp);
		add("recom",rp);
	}
	
}
