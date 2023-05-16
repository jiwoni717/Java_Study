package com.sist.dao;
/* 
 		오라클 연결 => 인터페이스 구현
 		1. 드라이버 등록 => 메모리 할당
 		  Class.forName("oracle.jdbc.driver.OracleDriver"); => 각 업체에서 제공
 		  ojdbc8.jar => 18c부터~
 		2. 오라클 연결
 		  Connection => getConnection(URL, username, password)
 		3. SQL 문장 전송(송수신)
 		  Statement => executeQuery(SQL)
 		  Resultset : 결과값을 받는 클래스
 		  Resultset에 있는 데이터를 List나 VO에 넣어줌
 		4. resultSet.close()
 		5. statement.close()
 		6.connection.close()
 		
 */
import java.sql.*; // checkedException
import java.util.*;
public class EmpDAO {
	// 오라클 연결 객체
	private Connection conn;
	
	// 오라클 통신(SQL 전송, 결과값 받음)
	private PreparedStatement ps;
	
	// ------------------------------
	// 오라클 주소
	// 드라이버 이름
	// 사용자명
	// 비밀번호
	// ------------------------------파일에 저장(보안)
	
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private final String USERNAME = "hr";
	private final String PASSWORD = "happy";
	
	// 드라이버 -> 딱 한번만 수행
	public EmpDAO()
	{
		try {
			Class.forName(DRIVER);
		}catch(Exception ex) {}
	}
	
	// 오라클 연결
	public void getConnection()
	{
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		}catch(Exception ex) {}
	}
	
	// 오라클 연결 해제
	public void disConnection()
	{
		try {
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
		}catch(Exception ex) {}
	}
	
	// 기능 => sql문장을 만들어서 오라클 연동
	// 1. 사용자가 사원 전체 목록 요청
	public List<EmpVO> empListDate()
	{
		List<EmpVO> list = new ArrayList<EmpVO>();
		try {
			getConnection();
			
			// 사용자가 요청한 SQL문장 제작
			String sql = "SELECT empno, ename, job, hiredate, sal FROM emp ORDER BY 1";
			
			// 오라클로 전송
			ps = conn.prepareStatement(sql);
			
			// 오라클에 명령을 내림(SQL문장 실행 후 결과값 가지고 온다)
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				EmpVO vo = new EmpVO();
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setSal(rs.getInt(5));
				list.add(vo);
			}
			rs.close();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}
	
	// 2. 상세보기
	public EmpVO empDetailDate(int empno)
	{
		EmpVO vo = new EmpVO();
		try {
			getConnection();
			String sql = "SELECT * FROM emp WHERE empno="+empno;
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			rs.next();
			
			vo.setEmpno(rs.getInt(1));
			vo.setEname(rs.getString(2));
			vo.setJob(rs.getString(3));
			vo.setMgr(rs.getInt(4));
			vo.setHiredate(rs.getDate(5));
			vo.setSal(rs.getInt(6));
			vo.setComm(rs.getInt(7));
			vo.setDeptno(rs.getInt(8));
			rs.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return vo;
	}
	
	// 2-1 사번 읽기
	public List<Integer> empGetEmpno()
	{
		List<Integer> list = new ArrayList<Integer>();
		try {
			getConnection();
			
			String sql = "SELECT DISTINCT empno FROM emp";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				list.add(rs.getInt(1));
			}
			rs.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}

	// 3. 검색
	public List<EmpVO> empSearchData(String ename)
	{
		List<EmpVO> list = new ArrayList<EmpVO>();
		EmpVO vo = new EmpVO();
		
		try {
			getConnection();
			
			String sql = "SELECT empno, ename, job, hiredate, deptno FROM emp WHERE ename LIKE '%"+ename+"%'";
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
//			rs.next();
			
//			vo.setEmpno(rs.getInt(1));
//			vo.setEname(rs.getString(2));
//			vo.setJob(rs.getString(3));
//			vo.setHiredate(rs.getDate(4));
//			vo.setDeptno(rs.getInt(5));
			
			while(rs.next())
			{
				
				vo.setEmpno(rs.getInt(1));
				vo.setEname(rs.getString(2));
				vo.setJob(rs.getString(3));
				vo.setHiredate(rs.getDate(4));
				vo.setDeptno(rs.getInt(5));
				list.add(vo);
			}
			
			rs.close();
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			disConnection();
		}
		return list;
	}
	
}
