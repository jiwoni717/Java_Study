package com.sist.manager;
import java.util.*;

import com.sist.inter.BoardInterface;

import java.io.*;

public class BoardManager implements BoardInterface {
//게시물 전체를 가지고 있는다 => List => 접속한 모든 사람이 공유
	private static List<BoardVO> list = new ArrayList<BoardVO>();
	
	/*
	 * 초기화
	 * 
	 * 멤버변수에 대한 초기화
	 * -----
	 * 	인스턴스 변수 : new를 이용해서 메모리 저장시마다 따로 저장된다
	 * 				(heap공간에 저장)
	 * 	정적변수(static) : 컴파일시 자동 저장
	 * 
	 *  1) 명시적인 초기화
	 *  2) 생성자
	 *  3) 초기화 블럭
	 *  	= 인스턴스 변수를 초기화
	 *  		{
	 *  		}
	 *  	= static 변수를 초기화
	 *  		static
	 *  		{
	 *  		}
	 *  	명시적초기화 = static {} = {} = 생성자
	 *  	---------------------------------
	 *  	명시적초기화는 선언과 동시에 값을 부여
	 *  	-------- 구현이 필요할 경우에는 사용할 수 없다
	 *  			파일읽기, 데이터읽기, 메소드를 호출...
	 */
	
	
	
	static {
		FileInputStream fis=null;
		try {
			fis=new FileInputStream("c:\\java_datas\\board.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			list = (List<BoardVO>)ois.readObject();
			
			ois.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

	//목록출력
	@Override
	public List<BoardVO> boardListData(int page) {
		// TODO Auto-generated method stub
		List<BoardVO> bList = new ArrayList<BoardVO>();
		List<BoardVO> temp = new ArrayList<BoardVO>();
		
		for(int i=list.size()-1;i>=0;i--) {
			temp.add(list.get(i));
		}
	
		int j=0;
		int rowSize=10;
		int start=(page-1)*rowSize;
		if(boardTotalPage() == page) {
			for(int i=0;i<temp.size();i++) {
				if(j<temp.size()%rowSize && i>=start) {
					bList.add(temp.get(i));
					j++;
				}
			}
		} else {
			for(int i=0;i<temp.size();i++) {
				if(j<rowSize && i>=start) {
					bList.add(temp.get(i));
					j++;
				}
			}
		}
		
		return bList;
	}
	
	//1-1 총페이지
	public int boardTotalPage() {
		return (int)(Math.ceil(list.size()/10.0));
	}

	//상세보기
	@Override
	public BoardVO boardDetailData(int no) {
		// TODO Auto-generated method stub
		BoardVO vo = new BoardVO();
		for(BoardVO bvo:list) {
			if(no==bvo.getNo()) {
				bvo.setHit(bvo.getHit()+1); //조회수
			}
		}
		for(BoardVO bvo:list) {
			if(bvo.getNo()==no) {
				vo = bvo;
			}
		}
		return vo;
	}

	//생성
	@Override
	public void boardInsert(BoardVO vo) {
		// TODO Auto-generated method stub
		int no=noIncrement();
		vo.setNo(no);
		vo.setRegdate(new Date());
		list.add(vo);
		try {
			FileOutputStream fos = new FileOutputStream("c:\\java_datas\\board.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			fos.close();
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 수정
	@Override
	public BoardVO boardUpdateData(int no) {
		// TODO Auto-generated method stub
		BoardVO vo = new BoardVO();
		for(BoardVO bvo:list) {
			if(bvo.getNo()==no) {
				vo=bvo;
			}
		}
		return vo;
	}

	//실제 수정
	@Override
	public String boardUpdate(BoardVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

	//삭제
	@Override
	public String boardDelete(int no, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	//자동 증가
	@Override
	public int noIncrement() {
		// TODO Auto-generated method stub
		int max=0;
		for(BoardVO vo:list) {
			if(vo.getNo()>max)
				max=vo.getNo();
		}
		
		return max+1;
	}
	
	//기능 설정
	//1. 목록 출력
	//2. 글쓰기
	//3. 상세보기
	//4. 수정
	//5. 삭제
}
