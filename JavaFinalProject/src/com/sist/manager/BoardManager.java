package com.sist.manager;

import java.util.*;

import com.sist.inter.BoardInterface;

import java.io.*;

public class BoardManager implements BoardInterface {
	private static List<BoardVO> list= new ArrayList<BoardVO>();
	
	// 초기화
	static
	{
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c:\\java_datas\\board.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<BoardVO>)ois.readObject();
			ois.close();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			}catch(Exception ex) {}
		}
	}

	// 기능 설정
	// 1. 목록 출력
	@Override
	public List<BoardVO> boardListData(int page) {
		List<BoardVO> bList = new ArrayList<BoardVO>();
		
		int j=0;
		int rowSize = 10;
		int start = (page-1)*rowSize;
		
		for(int i=0;i<list.size();i++)
		{
			if(j<10 && i>=start)
			{
				bList.add(list.get(i));
				j++;
			}
		}
		
		return bList;
	}
	// 1-1 총페이지
	public int boardTotalPage()
	{
		return (int)(Math.ceil(list.size()/10.0));
	}

	// 3. 상세보기
	@Override
	public BoardVO boardDetailDate(int no) {
		BoardVO vo = new BoardVO();
		
		// 먼저 조회수를 증가 시킨 후에 내용을 가져옴
		for(BoardVO bvo:list)
		{
			if(no==bvo.getNo())
			{
				bvo.setHit(bvo.getHit()+1);
			}
		}
		for(BoardVO bvo:list)
		{
			if(no==bvo.getNo())
				vo = bvo;
		}
		
		return vo;
	}
	
	// 2. 글쓰기
	@Override
	public void boardInsert(BoardVO vo) {
		int no = noIncrement();
		vo.setNo(no);
		vo.setRegdate(new Date());
		list.add(vo);
		try {
			FileOutputStream fos = new FileOutputStream("C:\\java_datas\\board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
		}catch(Exception EX) {}
	}

	// 4. 수정
	@Override
	public BoardVO boardUpdateData(int no) {
		BoardVO vo = new BoardVO();
		
		for(BoardVO bvo:list)
		{
			if(bvo.getNo()==no)
				vo=bvo;
		}
		
		return vo;
	}
	
	// 4-1. 진짜 수정
	@Override
	public String boardUpdate(BoardVO vo) {
		
		String result = "NO";
		for(BoardVO bvo:list)
		{
			if(bvo.getNo()==vo.getNo())
			{
				result="YES";
				bvo.setName(vo.getName());
				bvo.setSubject(vo.getSubject());
				bvo.setContent(vo.getContent());
				
				try {
					FileOutputStream fos = new FileOutputStream("c:\\java_datas\\board.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(list);
					fos.close();
					oos.close();
				}catch(Exception ex) {}
				break;
			}
		}
		
		return result;
	}

	// 5. 삭제
	@Override
	public String boardDelete(int no, String pwd) {
		
		String res = "NO";
		int i=0;
		for(BoardVO bvo:list)
		{
			if(bvo.getNo()==no)
			{
				
				if(bvo.getPwd().equals(pwd))
				{
					res="YES";
					list.remove(i);
					try {
						FileOutputStream fos = new FileOutputStream("c:\\java_datas\\board.txt");
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(list);
						fos.close();
						oos.close();
					}catch(Exception ex) {}
				break;
				}
			}
			i++;
		}
		return res;
	}

	//자동 증가 번호
	@Override
	public int noIncrement() {
		int max = 0;
		for(BoardVO vo:list)
		{
			if(vo.getNo()>max)
				max = vo.getNo();
		}
		return max+1;
	}
	
}
