//업다운 게임
package com.sist.exception;
/*
 * 		예외처리 방법
 * 		1. 예외 복구 : try~catch~finally => 가장 많이 사용되는 예외처리
 * 		2. 예외 회피 : throws
 * 		---------------- ↑ 라이브러리에 주로 있다 ---------------------
 * 		3. 임의 발생 : throw
 * 		4. 사용자 정의 : 지원하지 않는 경우에 직접 제작(사용빈도 거의 없음) => if문 주로 사용
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class 예외처리_예외복구_7 extends JFrame implements ActionListener {
	private JTextField tf;
	private JButton b1, b2; // 부분적으로 예외처리
	private int com;
	
	public 예외처리_예외복구_7() // 생성자 => 초기화 및 시작과 동시에 처리하는 내용
	{
		tf = new JTextField(20);
		b1 = new JButton("시작");
		b2 = new JButton("종료");
		tf.setEnabled(false);
		
		JPanel p = new JPanel();
		p.add(tf);p.add(b1);p.add(b2);
		add("Center",p);
		
		setSize(390,150);
		setVisible(true);
		
		b1.addActionListener(this); // b1번을 클릭하면 actionPerformed 호출(이벤트 등록)
		b2.addActionListener(this);
		tf.addActionListener(this); // tf에서 엔터 쳤을 때
	}
	
	public static void main(String[] args) {
		new 예외처리_예외복구_7();
	}
	
	// 버튼 처리하는 메소드 : 정의(용도가 여러개이기 때문에 구현을 하지 못한다)
	// 자동 호출이나 구현은 사용자에게 맡김
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b2) // b2를 클릭했다면~
		{
			System.exit(0);
		}
		else if(e.getSource()==b1)
		{
			com = (int)(Math.random()*100)+1;
			JOptionPane.showMessageDialog(this, "게임을 시작합니다");
			tf.setEnabled(true);
			tf.requestFocus();
			b1.setEnabled(false);
		}
		else if(e.getSource()==tf)
		{
			String strNum = tf.getText();
			if(strNum.trim().length()<1) // 입력이 안된 경우, 공백제거 필수
			{
				JOptionPane.showMessageDialog(this, "1~100 사이의 정수를 입력하세요!");
				tf.requestFocus();
				return; // 메소드종료
			}
			
			//입력이 된 상태
			int num = 0;
			
			try
			{
				num = Integer.parseInt(strNum); // 문자열 정수로 변경
				
			}catch(NumberFormatException ex)
			{
				// 잘못된 입력인 경우 복구
				JOptionPane.showMessageDialog(this, "정수만 입력이 가능합니다!");
				tf.setText("");
				tf.requestFocus();
				return;
			}
			
			//숫자 비교
			if(com>num)
			{
				JOptionPane.showMessageDialog(this, "입력한 수보다 큰 수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else if(com<num)
			{
				JOptionPane.showMessageDialog(this, "입력한 수보다 작은 수를 입력하세요");
				tf.setText("");
				tf.requestFocus();
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Game Over!!");
				tf.setText("");
				tf.setEnabled(false);
				b1.setEnabled(true);
			}
		}
	}

}
