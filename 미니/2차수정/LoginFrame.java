package com.kh.project.movie1;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class LoginFrame {
	public LoginFrame() {
		JFrame frame = new JFrame();
	
		frame.setTitle("우리동네 영화관 로그인 페이지");
		frame.setBounds(600, 300, 800, 550);
	
		LoginPanel LoginPanel = new LoginPanel();
		logInSuccessPanel logInSuccessPanel =new logInSuccessPanel();
		MembershipPanel MembershipPanel = new MembershipPanel();
		BookingConfirmationPanel BookingConfirmationPanel = new BookingConfirmationPanel();
		WithdrawalPanel WithdrawalPanel= new WithdrawalPanel();
		CancelPanel CancelPanel = new CancelPanel();
		MyPage MyPage = new MyPage();
		frame.add(LoginPanel);

		

		// 메인로그인 페이지에 확인 및 로그인 폴더 생성
		JButton LoginButton = new JButton("로그인");//확인 클릭시 로그인 성공
		JButton  MemberShipButton = new JButton("회원 가입");
		LoginButton.setBounds(360, 366, 105, 27);
		MemberShipButton.setBounds(360, 411, 105, 27);

		// 로그인 프레임에 버튼 넣기
		LoginPanel.add(LoginButton);
		LoginPanel.add(MemberShipButton);
		
		
		
		
		
		
		// 로그인 화면(LoginPanel)에서 로그인(LoginButton) 버튼누르면 logInSuccessPanel로 이동
		LoginButton.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(LoginPanel);
				frame.setTitle("마이페이지");
				frame.add(logInSuccessPanel);
				frame.revalidate();
				frame.repaint();
				JOptionPane.showMessageDialog(null, "회원가입  페이지로 이동합니다.", "회원가입 ", JOptionPane.PLAIN_MESSAGE); 
			}
		});	
		// 로그인 화면(LoginPanel)에서 회원가입(MemberShipButton) 버튼누르면 회원가입(MembershipPanel)로 이동
		MemberShipButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(LoginPanel);
				frame.setTitle("회원가입");
				frame.add(MembershipPanel);
				frame.revalidate();
				frame.repaint();
				JOptionPane.showMessageDialog(null, "로그인 성공하였습니다 .", "로그인 성공 ", JOptionPane.PLAIN_MESSAGE); 
			}
		});		
		
////////////////////////////////////////////////////////////
		
		//로그인 완료(logInSuccessPanel) 페이지 버튼 생성 	
		JButton	myPageButton = new JButton("마이 페이지");
		myPageButton.setBounds(80, 20, 120, 45);
		JButton	reservationButton = new JButton("영화 예매");
		reservationButton.setBounds(80, 120, 120, 45);
		JButton	 withdrawalButton = new JButton("회원 탈퇴");
		withdrawalButton.setBounds(80, 220, 120, 45);
		JButton	 bookingConfirmationButton = new JButton("예매조회");
		bookingConfirmationButton.setBounds(80, 320, 120, 45);
		JButton	bookingCancelButton  = new JButton("예매취소");
		bookingCancelButton.setBounds(80, 420, 120, 45);
	
			
		//logInSuccessPanel 버튼 넣기
		logInSuccessPanel.add(myPageButton);
		logInSuccessPanel.add(reservationButton);
		logInSuccessPanel.add(withdrawalButton);
		logInSuccessPanel.add(bookingConfirmationButton);
		logInSuccessPanel.add(bookingCancelButton);	
		
		
		
	//	메인화면(logInSuccessPanel)에서  예약조회(bookingConfirmationButton)버튼 누르면 예약조회(BookingConfirmationPanel)
		bookingConfirmationButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(logInSuccessPanel);
			frame.setTitle("예약조회");
			frame.add(BookingConfirmationPanel);
			frame.revalidate();
			frame.repaint();
		}
			
	});	
		// 메인화면 (logInSuccessPanel)에서 회원 탈퇴 버튼(withdrawalButton) 누르면  회원탈퇴(WithdrawalPanel)로 이동
		withdrawalButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(logInSuccessPanel);
			frame.setTitle("회원 탈퇴");
			frame.add(WithdrawalPanel);
			frame.revalidate();
			frame.repaint();
			}
		});	
		// 메인화면(logInSuccessPanel)에서 마이페이지 버튼(myPageButton)누르면  마이페이지(MyPage)로 이동
		myPageButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(logInSuccessPanel);
				frame.setTitle("마이페이지");
				frame.add(MyPage);
				frame.revalidate();
				frame.repaint();
			}
		});
		//메인화면(logInSuccessPanel)에서  예약취소(bookingCancelButton) 버튼 누루면 예약 취소(CancelPanel) 화면으로 이동
		bookingCancelButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			frame.remove(logInSuccessPanel);
			frame.setTitle("예약취소");
			frame.add(CancelPanel);
			frame.revalidate();
			frame.repaint();
		}
				
	});
			
		
	/////////////////////////////////////////////////////	
		
		//MembershipPanel panel 버튼생성및 위치 설정
		JButton duplicationButton = new JButton("중복확인");
		duplicationButton.setBounds(308, 100, 88, 30);
//		JRadioButton genderMenButton = new JRadioButton("남자");
//		genderMenButton.setBounds(160,280, 100, 30);
//		JRadioButton genderWomanButton = new JRadioButton("여자");
//		genderWomanButton.setBounds(260,280, 100, 30);
		JButton	confirmButton = new JButton("확 인");
		confirmButton.setBounds(80, 400, 80, 45);
		JButton cancelButton = new JButton("취 소");
		cancelButton.setBounds(220, 400, 80, 45);
				
		MembershipPanel.add(duplicationButton);
		MembershipPanel.add(confirmButton);
		MembershipPanel.add(cancelButton);
//		MembershipPanel.add(genderMenButton);
//		MembershipPanel.add(genderWomanButton);		
		
//		// 라디오 버튼 중복 선택 불가능하게 학기
//		ButtonGroup genderGruop = new ButtonGroup();
//		genderGruop.add(genderMenButton);
//		genderGruop.add(genderWomanButton);
//				
//		genderMenButton.setBackground(Color.white);
//		genderWomanButton.setBackground(Color.white);	
		
		
		
		
		
		
//		회원가입(MembershipPanel)에서  확인(confirmButton) 누르면  로그인 페이지(LoginPanel)로 이동
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(MembershipPanel);
				frame.setTitle("로그인");
				frame.add(LoginPanel);
				frame.revalidate();
				frame.repaint();
				JOptionPane.showMessageDialog(null, "취소되었습니다. .", "회원가입", JOptionPane.WARNING_MESSAGE); 
			}
		});			
//		회원가입(MembershipPanel)에서  취소(cancelButton) 누르면  로그인 페이지(LoginPanel)로 이동
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(MembershipPanel);
				frame.setTitle("회원가입");
				frame.add(LoginPanel);
				frame.revalidate();
				frame.repaint();
				JOptionPane.showMessageDialog(null, "취소하시겠습니까?.", "회원가입 ", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "취소되었습니다. .", "회원가입", JOptionPane.WARNING_MESSAGE); 
			}
		});			
		
		// 예약조회(BookingConfirmationPanel) 버튼 생성
		
		JButton	confirmButton2 = new JButton("ID검색");
		confirmButton2.setBounds(308, 50, 100, 30);
		JButton	PreviousButton = new JButton("확인");
		PreviousButton.setBounds(80, 400, 120, 45);
				
				
		BookingConfirmationPanel.add(confirmButton2);
		BookingConfirmationPanel.add(PreviousButton);
		
		// 예약 조회(BookingConfirmationPanel) 에서 확인(PreviousButton) 메인화면(logInSuccessPanel) 이동
		PreviousButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(BookingConfirmationPanel);
			frame.setTitle("마이 페이지");
			frame.add(logInSuccessPanel);
			frame.revalidate();
			frame.repaint();
			}
		});		
		
		//회원 탈퇴 페이지 (WithdrawalPanel) 버튼 생성
	
		JButton	confirmButton1 = new JButton("확인");// 
		confirmButton1.setBounds(80, 400, 120, 45);
		JButton	cancelButton1 = new JButton("취소");
		cancelButton1.setBounds(250, 400, 120, 45);
			
		WithdrawalPanel.add(confirmButton1);
		WithdrawalPanel.add(cancelButton1);	
		
		// 회원 탈퇴에서 취소(cancelButton1) 누르면 메인 화면 (logInSuccessPanel)로이동
		cancelButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(WithdrawalPanel);
			frame.setTitle("회원가입");
			frame.add(logInSuccessPanel);
			frame.revalidate();
			frame.repaint();
			JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다.", "회원 탈퇴", JOptionPane.PLAIN_MESSAGE);
			}
		});		
		// 회원 탈퇴(WithdrawalPanel)에서 확인(confirmButton1) 버튼 누르면 다시 로그인(LoginPanel)로 이동
		confirmButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(WithdrawalPanel);
			frame.setTitle("회원가입");
			frame.add(LoginPanel);
			frame.revalidate();
			frame.repaint();
			JOptionPane.showMessageDialog(null, "취소하시겠습니까?.", "회원탈퇴 ", JOptionPane.ERROR_MESSAGE);
			JOptionPane.showMessageDialog(null, "취소되었습니다. .", "회원탈퇴", JOptionPane.WARNING_MESSAGE); 
			
			}
		});			
		
		
		
		
		
		
		// 마이페이지(MyPage) 확인 버튼생성
		JButton bookingButton = new JButton("예약 조회");
		bookingButton.setBounds(200, 410, 100, 40);
		JButton bookingNo = new JButton("이전");
		 bookingNo.setBounds(500, 410, 100, 40);
		 JButton Cancel= new JButton("예매취소");
		 Cancel.setBounds(350, 410, 100, 40);
		

		MyPage.add(bookingButton);
		MyPage.add(bookingNo);
		MyPage.add(Cancel);		
		
		//마이 페이지(MyPage)에서  확인 버튼 (bookingButton)누루면 예약 조회(BookingConfirmationPanel) 화면으로 이동
		bookingButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			frame.remove(MyPage);
			frame.setTitle("마이페이지");
			frame.add(BookingConfirmationPanel);
			frame.revalidate();
			frame.repaint();
		}
		
		});	
		//마이 페이지(MyPage)에서  이전 버튼 (bookingNo)누루면 메인화면(logInSuccessPanel) 화면으로 이동
		bookingNo.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			frame.remove(MyPage);
			frame.setTitle("마이페이지");
			frame.add(logInSuccessPanel);
			frame.revalidate();
			frame.repaint();
			
		}
		
	});
		
		
		
		//예약취소 (CancelPanel) 버튼생성
		JButton	SearchButton = new JButton("ID검색");// 
		SearchButton.setBounds(320, 100, 80, 30);
		JButton yesButton = new JButton("예");
		yesButton .setBounds(120, 400, 90, 30);
		JButton noButton = new JButton("아니오");
		noButton.setBounds(240, 400, 90, 30);
		
		
		CancelPanel.add(yesButton);
		CancelPanel.add(noButton);
		CancelPanel.add(SearchButton);	
		
		
		//예약취소(CancelPanel) 예 버튼(yesButton)누르면 메인화면(logInSuccessPanel)로이동
		yesButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
			frame.remove(CancelPanel);
			frame.setTitle("마이페이지");
			frame.add(logInSuccessPanel);
			frame.revalidate();
			frame.repaint();
			
		}
		
	});
		//예약취소(CancelPanel) 아니요 버튼(noButton)누르면  메인화면(logInSuccessPanel)로이동
		noButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(CancelPanel);
				frame.setTitle("마이페이지");
				frame.add(logInSuccessPanel);
				frame.revalidate();
				frame.repaint();
			}
		});
			
		
		
		
	}
}
