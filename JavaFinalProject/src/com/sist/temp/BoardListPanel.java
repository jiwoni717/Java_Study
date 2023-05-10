package com.sist.temp;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;
import java.util.List;
import java.net.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import com.sist.manager.*;
import javax.swing.table.*;

public class BoardListPanel extends JPanel implements ActionListener, MouseListener {
	JTable table;
	DefaultTableModel model;
	JLabel pageLa, titleLa;
	JButton b1, b2, b3;
	
	int curpage = 1;
	int totalpage = 0;
	
	TableColumn column;
	
	BoardManager bm = new BoardManager();
	
	ControlPanel cp;
	
	public BoardListPanel(ControlPanel cp)
	{
		this.cp = cp;
		
		// 초기화
		b1 = new JButton("새 글");
		b2 = new JButton("이전");
		b3 = new JButton("다음");
		pageLa = new JLabel("0 page / 0 pages");
		titleLa = new JLabel("자유게시판");
		titleLa.setFont(new Font("맑은 고딕",Font.BOLD,35));
		titleLa.setHorizontalAlignment(JLabel.CENTER);
		
		String[] col = {"번호", "제목", "이름", "작성일", "조회수"};
		String[][] row = new String[0][5];
		model = new DefaultTableModel(row,col)
		{
			// 편집 방지
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};
		
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		
		// 배치
		setLayout(null);
		titleLa.setBounds(0, 20, 860, 40);
		b1.setBounds(10, 100, 70, 30);
		js.setBounds(10, 140, 840, 500);
		JPanel p = new JPanel();
		p.add(b2);
		p.add(pageLa);
		p.add(b3);
		p.setBounds(10, 650, 840, 30);
		
		// 컬럼 간격 조절
		table.getColumn("번호").setPreferredWidth(30);
		table.getColumn("제목").setPreferredWidth(400);
		table.getColumn("이름").setPreferredWidth(100);
		table.getColumn("작성일").setPreferredWidth(200);
		table.getColumn("조회수").setPreferredWidth(50);
		table.getTableHeader().setReorderingAllowed(false);
		table.setShowVerticalLines(false);
		table.setRowHeight(40);
		
		add(titleLa);
		add(b1);
		add(js);
		add(p);
		
		// 글자 가운데 정렬
		for(int i=0;i<col.length;i++)
		{
			column = table.getColumnModel().getColumn(i);
			DefaultTableCellRenderer dt = new DefaultTableCellRenderer();
			if(i!=1)
			{
				dt.setHorizontalAlignment(JLabel.CENTER);
			}
			column.setCellRenderer(dt);
		}
		
		boardPrint();
		
		// 이벤트 등록
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		table.addMouseListener(this);
		
	}
	
	public void boardPrint()
	{
		// 테이블에 출력된 내용 지우기
		for(int i=model.getRowCount()-1;i>=0;i--)
		{
			model.removeRow(i);
		}
		// 재배치
		// 1. 데이터 읽기
		List<BoardVO> list = bm.boardListData(curpage);
		totalpage = bm.boardTotalPage();
		pageLa.setText(curpage+" page / "+totalpage+" pages");
		
		// 최신순으로 출력
		for(int i=list.size()-1;i>0;i--)
		{
			BoardVO vo = list.get(i);
			String[] data = {
				String.valueOf(vo.getNo()),
				vo.getSubject(),
				vo.getName(),
				new SimpleDateFormat("yy.MM.dd").format(vo.getRegdate()),
				String.valueOf(vo.getHit())
			};
			model.addRow(data);
		}
	}

	// 테이블 더블 클릭 → 상세보기
	@Override
	public void mouseClicked(MouseEvent e) {
		
		if(e.getSource()==table)
		{
			if(e.getClickCount()==2)
			{
				int row = table.getSelectedRow();
				String no = table.getValueAt(row, 0).toString();
				BoardVO vo =  bm.boardDetailDate(Integer.parseInt(no));
				cp.bdp.noLa.setText(String.valueOf(vo.getNo()));
				cp.bdp.nameLa.setText(vo.getName());
				cp.bdp.subLa.setText(vo.getSubject());
				cp.bdp.pane.setText(vo.getContent());
				cp.bdp.dateLa.setText(new SimpleDateFormat("yyyy-MM-dd").format(vo.getRegdate()));
				cp.bdp.hitLa.setText(String.valueOf(vo.getHit()));
				cp.card.show(cp, "bdp");
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	// 버튼
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1)
		{
			cp.ip.tf1.setText("");
			cp.ip.tf2.setText("");
			cp.ip.ta.setText("");
			cp.ip.pf.setText("");
			cp.card.show(cp, "insert");
		}
	}
}
