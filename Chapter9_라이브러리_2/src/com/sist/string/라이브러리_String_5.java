package com.sist.string;

import java.util.Arrays;

/*
 * 		라이브러리 => 1. 기능 / 2. 리턴형 / 3. 매개변수 / 4. 사용처
 * 
 *		concat : 문자열 결합(+)
 *
 *		String s1 = "Hello ";
 *		String s2 = "Java!!";
 *		s1.concat(s2) ==> "Hello Java!!"
 *
 *		리턴형 : String
 *
 *		==> MySQL LIKE 문장을 만들 때
 *
 *		endsWith : 끝나는 문자열이 같은 경우 사용
 *		boolean endsWith(String s)
 *		리턴형 : boolean
 *		
 */
public class 라이브러리_String_5 {

	public static void main(String[] args) {
/*			String s1 = "Hello ";
			String s2 = "Java!!";
			
			System.out.println(s1.concat(s2));
			System.out.println(s1+s2);
			
			if(s1.endsWith("o"))
			{
				System.out.println("o자로 끝납니다 ");
			}
			else
				System.out.println("o자로 끝나지 않습니다");
*/
		
		String[] data = {"JAVA", "java", "Java", "JAva", "JAVa", "jaVA", "javA"};
		
		for(String s:data)
		{
			if(s.equals("java")) // 대소문자 구분해서 비교
			{
				System.out.println(s);
			}
		}
		
		System.out.println("=============== ↓ equalsIgnorecase() ===============");
		
		for(String s:data)
		{
			if(s.equalsIgnoreCase("java")) // 검색할 때 많이 사용
			{
				System.out.println(s);
			}
		}
		
		
		System.out.println("============ length() ============");
		String[] data2 = {"apple", "avocado", "banana", "blackberry", "blueberry", "cherry tomato", "cherry", "coconut"
				  , "grape", "kiwi"
				  ,"lemon"
				  ,"lime"
				  ,"mango"
				  ,"melon"
				  ,"orange"
				  ,"papaya"
				  ,"peach"
				  ,"pear"
				  ,"persimmon"
				  ,"pineapple"
				  ,"plum"
				  ,"strawberry"
				  ,"tangerin"
				  ,"tomato"
				  ,"watermelon"};
		
		// 각 과일명의 문자 길이 출력
		for(String s:data2)
		{
			System.out.println(s+":"+s.length());
		}
		System.out.println("==========================================");
		System.out.println("가장 긴 이름의 과일명을 출력하시오");
		
		int max=0;
		
		for(String s:data2)
		{
			if(s.length()>max)
				max=s.length();
		}
		
		for(String s:data2)
		{
			if(s.length()==max)
			{
				System.out.println(s);
			}
		}
		
		System.out.println("============== startsWith() =============="); // 자동 완성기, 쿠키 검색
		
		for(String s:data2)
		{
			if(s.startsWith("p"))
			{
				System.out.println(s);
			}
		}
		
		System.out.println("================= trim() =================");
		/*
		 * 	좌우 공백 제거
		 * 	원형 : String trin()
		 * 	사용처 : 로그인, 회원가입, 검색...
		 */
		
		String id = "admin";
		if(id.equals(" admin".trim()))
		{
			System.out.println("같은 아이디입니다");
		}
		else
			System.out.println("다른 아이디입니다");
		
		System.out.println("================ contains ================");
		/*
		 * 	포함 문자열 찾을 때
		 * 	원형 : boolean contains(String s)
		 * 	사용처 : 검색, 추천...
		 */
		
		for(String s:data2)
		{
			if(s.contains("a"))
			{
				System.out.println(s);
			}
		}
		
		System.out.println("=============== valueOf() ===============");
		/*
		 * 	String에서 유일한 static 메소드
		 * 	모든 데이터형을 문자열로 변환
		 * 	원형 : static String valueOf((type)) => 오버로딩이 되어있는 상태
		 * 	사용처 : 자바에서 윈도우 전송, 네트워크 전송, 웹 전송 (=> String만 인식하기 때문)
		 */
		
		System.out.println(String.valueOf(10)+String.valueOf(30));
		
		System.out.println("=============== substring ===============");
		/* 	substring() indexOf(), lastIndexOf()
		 * 	원형 : String substring(int s) / String substring(int s, int e)
		 * 	사용처 : URL주소 제어, 문자열이 긴 경우...
		 */
		String ss = "http://localhost:8080/JSPProject/main/main.do";
		String res = ss.substring(ss.lastIndexOf("/")+1);
		System.out.println(res);
		ss = ss.substring(ss.indexOf("//")+2);
		res = ss.substring(0,ss.indexOf("/"));
		System.out.println(res);
		
		ss = "서울특별시 용산구 소월로2길 27 지번 서울시 용산구 후암동 445-8";
		res = ss.substring(0,ss.indexOf("지"));
		System.out.println(res.trim());
		res = ss.substring(ss.indexOf("지")+2);
		System.out.println(res.trim());
		
		System.out.println("================= split =================");
		/*
		 * 	특수문자별로 잘라서 배열에 저장
		 * 	원형 : String[] split(String regexp)
		 * 	구분할 수 있는 문자열이 있는 경우 분리..
		 */
		ss = "홍길동,이순신,강감찬,박문수,을지문덕,심청이,춘향이";
		String[] names = ss.split(",");
		
		for(String name:names)
		{
			System.out.println(name);
		}
		
		ss="물고기 모듬회(소)"
			+ " 60,000원"
			+ "주택 모듬회(소)"
			+ " 70,000원";
		
		String[] menu = ss.split("원");
		for(String m:menu)
		{
			System.out.println(m+"원");
		}
		
		ss = "red|blue|green|black|white|yellow";
		String[] colors = ss.split("\\|"); // 정규식에서 사용하는 기호는 앞에 "\\"
		for(String c:colors)
		{
			System.out.println(c);
		}
		
		System.out.println("=============== replace ===============");
		/*
		 * 	replace() : 문자나 문자열 변경
		 * 	원형 : String replace(char old, char new) => old를 new로 변경
		 * 						------------------- char뿐만 아니라 String도 가능
		 * 	데이터 수집 => html 제거...
		 */
		
		ss = "https://mp-seoul-image-production-s3.mangoplate.com/756210_1667892732041968.jpg?fit=around|512:512&crop=512:512;*,*&output-format=jpg&output-quality=80";
		// 오라클에 저장 => 오라클에서는 &가 scanner
		
		res = ss.replace("&", "^");
		System.out.println(res);
		System.out.println(res.replace("^", "&"));
	}

}
