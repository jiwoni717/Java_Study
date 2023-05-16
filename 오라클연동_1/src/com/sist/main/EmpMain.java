package com.sist.main;
import java.util.*;
import com.sist.dao.*;
public class EmpMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		EmpDAO dao = new EmpDAO();
		while(true)
		{
			System.out.println("======= 메뉴 =======");
			System.out.println("1. 사원 목록");
			System.out.println("2. 사원 상세보기");
			System.out.println("3. 사원 찾기");
			System.out.println("9. 종료");
			System.out.println("===================");
			System.out.print("메뉴 입력 : ");
			int menu = scan.nextInt();
			if(menu==9)
			{
				System.out.println("프로그램 종료!");
				break;
			}
			else if(menu==1)
			{
				List<EmpVO> list = dao.empListDate();
				for(EmpVO vo:list)
				{
					System.out.println(vo.getEmpno()+" "+vo.getEname()+" "+vo.getJob()+" "+vo.getHiredate().toString()+" "+vo.getSal());
				}
			}
			else if(menu==2)
			{
				List<Integer> list = dao.empGetEmpno();
				String s = "";
				for(int no:list)
				{
					s+=no+",";
				}
				s = s.substring(0, s.lastIndexOf(","));
				System.out.println(s);
				System.out.print("사번 입력 : ");
				int empno = scan.nextInt();
				EmpVO vo = dao.empDetailDate(empno);
				
				System.out.println(vo.getEname()+" 사원 정보");
				System.out.println("사번 : "+vo.getEmpno());
				System.out.println("이름 : "+vo.getEname());
				System.out.println("직위 : "+vo.getJob());
				System.out.println("사수번호 : "+vo.getMgr());
				System.out.println("입사일 : "+vo.getHiredate().toString());
				System.out.println("급여 : "+vo.getSal());
				System.out.println("성과급 : "+vo.getComm());
				System.out.println("부서 번호 : "+vo.getDeptno());
			}
			else if(menu==3)
			{
				List<EmpVO> list = new ArrayList<EmpVO>();
//				String s = "";
//				for(String ss:list)
//				{
//					s+=ss+",";
//				}
//				s = s.substring(0,s.lastIndexOf(","));
//				System.out.println(s);
				System.out.print("검색할 이름 입력 : ");
				String ename = scan.next().toUpperCase();
				EmpVO vo = (EmpVO) dao.empSearchData(ename);
				
				for(EmpVO v:list)
				{
					System.out.println(vo.getEname()+"님의 정보 입니다");
					System.out.println("사번 : "+vo.getEmpno());
					System.out.println("이름 : "+vo.getEname());
					System.out.println("직위 : "+vo.getJob());
					System.out.println("입사일 : "+vo.getHiredate().toString());
					System.out.println("부서 번호 : "+vo.getDeptno());
				}
				
			}
		}

	}

}
