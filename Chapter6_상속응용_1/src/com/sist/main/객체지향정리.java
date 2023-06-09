package com.sist.main;
/*
 * 		메모리구조
 * 		--------------------------------------------------------------------
 * 		MethodArea, static => 컴파일러가 자동 저장
 * 		method도 메모리에 저장
 * 		void method()
 * 		{
 * 			구현부가 있어야 저장된다
 * 		}
 * 		=> 메소드가 선언만 된 경우에는 클래스를 저장하지 못한다
 * 		   (미완성된 클래스 => 추상클래스, 인터페이스) => 요구사항 분석
 * 						void method(); ㄴ데이터베이스 연결, 윈도우, 네트워크 서버, 웹 구현
 * 		--------------------------------------------------------------------
 * 		Stack : LIFO
 * 		지역변수, 매개변수 저장 => 메모리 자체에서 관리 => 블럭이 사라지면 종료된다
 * 		--------------------------------------------------------------------
 * 		Heap : 동적메모리 할당
 * 		new => 객체변수, 배열(참조변수값) 저장 => 프로그래머가 관리 => GC(자동메모리 회수)에 의해 종료
 * 															 (객체 : null)	
 * 		--------------------------------------------------------------------
 * 
 * 		클래스
 * 		-변수만 모아서 관리 : 사용자 정의 데이터형 (~VO, ~DTO, ~Bean)
 * 			getter / setter는 메소드 => 읽기/쓰기 기능
 * 		-메소드만 모아서 관리 : 액션 클래스 (~System, ~DAO, ~Manager, ~Service...)
 * 		-변수 + 메소드 : 조립 (~Model, ~Controller, ~Action)
 * 		1. 구성요소
 * 			1) 변수
 * 				= 인스턴스변수 : 객체마다 메모리를 따로 저장
 * 							 new를 이용해 메모라 저장공간이 만들어진 경우 생성
 * 				= 정적변수 : 메모리 공간 1개 (공유변수, 클래스변수)
 * 						   컴파일시 자동 생성
 * 				------------------- ↓ 메소드 호출시 생성 -------------------
 * 				= 지역변수 : 기능 처리에 필요한 데이터 설정 (메소드 종료와 동시에 사라짐)
 * 				= 매개변수 : 사용자 요청값 (메소드 종료와 동시에 사라짐)
 * 
 * 			class A
 * 			{
 * 				String addr;
 * 				void Address(String addr)
 * 				{
 * 					this.addr = addr
 * 				}
 * 				void 지도출력()
 * 				{
 * 					addr
 * 				}
 * 			}
 * 				↑ 전역변수
 * 			2) 메소드 : 다른 클래스와의 통신 담당
 * 				종류
 * 				-인스턴스메소드 : 따로 작동하는 메소드
 * 				-정적메소드 : 동시에 작동(static => 자동 저장)
 * 				-추상메소드 : 설계 => 모든 개발자가 같은 메소드를 제어 => 표준화 작업 => 여러개의 클래스를 묶어서 한개의 이름으로 제어 가능
 * 				-종단메소드 : final~ => 변경할 수 없는 메소드(확장 불가 => 오버라이딩, 오버로딩x)
 * 			3) 생성자
 * 				-객체 생성시 호출되는 메소드
 * 				-멤버변수의 초기화
 * 				-클래스명과 동일해야한다
 * 				-리턴형이 없다
 * 				-생성자는 여러개 존재할 수 있다(오버로딩)
 * 				-클래스 안에 생성자를 반드시 구현하는 것은 아니다(=> 구현이 되지 않으면 컴파일러가 기본 생성자를 자동으로 추가해줌)
 * 		2. 클래스 설계
 * 			1) 기능 설계 : 메소드 추출
 * 			2) 기능에서 사용하는 변수 추출
 * 			3) 클래스 설계
 * 			4) 메모리 저장
 * 			5) 활용
 * 			6) 소멸
 * 				null값을 줌
 * 		3. 접근지정어
 * 			-private : 자신의 클래스에서만 접근 가능 => 데이터보호(캡슐화)
 * 			-default : 같은 패키지 안에서만 접근 가능
 * 			-protected : 같은 패키지 안에서만 접근 가능 + 상속이 있는 경우 다른 패키지에 접근 가능
 * 			-public : 모든 클래스에 접근 가능
 * 			멤버변수 : [접근지정어] 데이터형 변수명
 * 			메소드 : [접근지정어][제어어] 리턴형 메소드명(매개변수목록) {}
 * 		4. 객체지향의 특성
 * 			1) 캡슐화 => 데이터를 은닉화한 후 메소드를 통해 접근 가능
 * 			2) 재사용
 * 				-상속(is-a) : 기존의 기능을 변경해서 사용
 * 				-포함(has-a) : 기존의 기능을 있는 그대로 사용
 * 			3) 수정, 추가 => 다형성 (수정 : 오버라이딩 / 추가 : 오버로딩)
 * 		5. 제어자
 * 			static / abstract / final
 * 			=> static final : 상수
 * 			=> final : 상수형 변수 => 변경x / 메소드 안에서 사용 가능
 * 				ㄴ오라클 주소, 계정명, 비밀번호...
 */
public class 객체지향정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
