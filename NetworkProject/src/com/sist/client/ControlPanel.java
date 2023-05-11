package com.sist.client;
import java.awt.CardLayout;
import javax.swing.JPanel;

public class ControlPanel extends JPanel {
	HomePanel hp;
	ChartPanel cp;
	DetailPanel dp;
	BoardListPenal bp;
	BoardInsertPanel ip;
	BoardDetailPenal bdp;
	FindPanel fp = new FindPanel();
	ChatPanel chatp = new ChatPanel();
	MagPanel magp = new MagPanel(); //매거진
	
	CardLayout card = new CardLayout();
	
	public ControlPanel()
	{
		cp = new ChartPanel(this);
		dp = new DetailPanel(this);
		hp = new HomePanel(this);
		bp = new BoardListPenal(this);
		ip = new BoardInsertPanel(this);
		bdp= new BoardDetailPenal(this);
		setLayout(card);
		add("home",hp);
		add("detail",dp);
		add("chart",cp);
		add("find",fp);
		add("chat",chatp);
		add("magazine",magp);
		add("board", bp);
		add("insert", ip);
		add("bdp", bdp);
	}
}
