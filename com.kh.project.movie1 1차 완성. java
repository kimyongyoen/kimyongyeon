package com.kh.project.movie1;

import java.awt.Color;
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
		frame.add(LoginPanel);
		
		
		
	////////////////////////////////////////////////	
		
		
		
//		// 메인로그인 페이지에 확인 및 로그인 폴더 생성
		JButton LoginButton = new JButton("로그인");//확인 클릭시 로그인 성공
		JButton  MemberShipButton = new JButton("회원 가입");
		LoginButton.setBounds(360, 366, 105, 27);
		MemberShipButton.setBounds(360, 411, 105, 27);

		// 로그인 프레임에 버튼 넣기
		LoginPanel.add(LoginButton);
		LoginPanel.add(MemberShipButton);
////////////////////////////////////////////////
		
		//logInSuccessPanel 패널에 버튼 생성 

		logInSuccessPanel logInSuccessPanel =new logInSuccessPanel();
		JButton	myPageButton = new JButton("마이 페이지");
		myPageButton.setBounds(80, 200, 120, 45);
		JButton	reservationButton = new JButton("영화 예매");
		reservationButton.setBounds(80, 300, 120, 45);
		JButton	 withdrawalButton = new JButton("회원 탈퇴");
		withdrawalButton.setBounds(80, 400, 120, 45);
		JButton	 bookingConfirmationButton = new JButton("예매조회");
		bookingConfirmationButton.setBounds(80, 100, 120, 45);
				
		//logInSuccessPanel 버튼 넣기
		logInSuccessPanel.add(myPageButton);
		logInSuccessPanel.add(reservationButton);
		logInSuccessPanel.add(withdrawalButton);
		logInSuccessPanel.add(bookingConfirmationButton);	
////////////////////////////////////////////////
		
		//MembershipPanel panel 회원가입
		MembershipPanel MembershipPanel = new MembershipPanel();
		//MembershipPanel panel 버튼생성및 위치 설정
		JButton duplicationButton = new JButton("중복확인");
		duplicationButton.setBounds(308, 100, 88, 30);
		JRadioButton genderMenButton = new JRadioButton("남자");
		genderMenButton.setBounds(160,280, 100, 30);
		JRadioButton genderWomanButton = new JRadioButton("여자");
		genderWomanButton.setBounds(260,280, 100, 30);
		JButton	confirmButton = new JButton("확 인");
		confirmButton.setBounds(80, 400, 80, 45);
		JButton cancelButton = new JButton("취 소");
		cancelButton.setBounds(220, 400, 80, 45);
				
		MembershipPanel.add(duplicationButton);
		MembershipPanel.add(confirmButton);
		MembershipPanel.add(cancelButton);
		MembershipPanel.add(genderMenButton);
		MembershipPanel.add(genderWomanButton);

		
		// 라디오 버튼 중복 선택 불가능하게 학기
		ButtonGroup genderGruop = new ButtonGroup();
		genderGruop.add(genderMenButton);
		genderGruop.add(genderWomanButton);
				
		genderMenButton.setBackground(Color.white);
		genderWomanButton.setBackground(Color.white);
////////////////////////////////////////////////
		
		
		//BookingConfirmationPanel  생성
		BookingConfirmationPanel BookingConfirmationPanel = 
				new BookingConfirmationPanel();
		JButton	confirmButton2 = new JButton("확인");
		confirmButton2.setBounds(308, 100, 100, 30);
		JButton	PreviousButton = new JButton("이전");
		PreviousButton.setBounds(80, 400, 120, 45);
				
				
		BookingConfirmationPanel.add(confirmButton2);
		BookingConfirmationPanel.add(PreviousButton);	
////////////////////////////////////////////////
		
		
		
		//WithdrawalPanel panel 버튼 생성
		WithdrawalPanel WithdrawalPanel = new WithdrawalPanel();
		JButton	confirmButton1 = new JButton("확인");// WithdrawalPanel
		confirmButton1.setBounds(80, 400, 120, 45);
		JButton	cancelButton1 = new JButton("취소");// WithdrawalPanel
		cancelButton1.setBounds(250, 400, 120, 45);
								
		WithdrawalPanel.add(confirmButton1);
		WithdrawalPanel.add(cancelButton1);		
////////////////////////////////////////////////
		
		
		
//		메인로그인 페이지 로그인  버튼 누르면  panel로 이동 logInSuccessPanel 이동
		LoginButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(LoginPanel);
				frame.setTitle("마이페이지");
				frame.add(logInSuccessPanel);
				frame.revalidate();
				frame.repaint();
			}
		});	
//		메인로그인 페이지  회원 가입 버튼 누르면  이동
		MemberShipButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(LoginPanel);
				frame.setTitle("회원가입");
				frame.add(MembershipPanel);
				frame.revalidate();
				frame.repaint();
			}
		});	
////////////////////////////////////////////////
		
		
		
		
		
//		회원가입  페널에서  확인 누르면  로그인 페이지호 이동
		confirmButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(MembershipPanel);
				frame.setTitle("로그인");
				frame.add(LoginPanel);
				frame.revalidate();
				frame.repaint();
			}
		});			
//		회원 가입 페널에서 취소 눌렀을때 다시 회워가입 페이지로 이동
		cancelButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.remove(MembershipPanel);
				frame.setTitle("회원가입");
				frame.add(MembershipPanel);
				frame.revalidate();
				frame.repaint();
			}
		});		
////////////////////////////////////////////////
		

			// 마이 페이지에서 bookingConfirmationButton 누르면 예약 조회로 이동	
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
////////////////////////////////////////////////
		// 예약 조회 페널에서 이전 누르면 마이페이지로 이동
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
	
////////////////////////////////////////////////
		// 회원 탈퇴에서 취소 누르면 회원 탈퇴로 다시
		cancelButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(WithdrawalPanel);
			frame.setTitle("회원가입");
			frame.add(WithdrawalPanel);
			frame.revalidate();
			frame.repaint();
			}
		});	
		
		// 마이 페이지에서 회원 탈퇴 버튼 누르면 회원탈퇴로 이동
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
		
		// 회원 탈퇴에서 확인 버튼 누르면 다시 로그인로 이동
		confirmButton1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			frame.remove(WithdrawalPanel);
			frame.setTitle("회원가입");
			frame.add(LoginPanel);
			frame.revalidate();
			frame.repaint();
			}
		});	
	
	
////////////////////////////////////////////////
		
		// 메인 로그인 페이지에서 회원가입 버튼 누르면 회원가입 창으로 이동하면서 메세지 
		MemberShipButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "회원가입  페이지로 이동합니다.", "회원가입 ", 
		JOptionPane.PLAIN_MESSAGE); 
		}
	   });	
		// 메인 로그인 페이지에서 로그인버튼 누르면 마이페이지로  이동하면서 메세지 
		LoginButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "로그인 성공하였습니다 .", "로그인 성공 ", 
		JOptionPane.PLAIN_MESSAGE); 
		}
	   });	
		
		// 회원 가입 에서 취소 버튼 누른때
		cancelButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "취소하시겠습니까?.", "회원가입 ", 
		JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "취소되었습니다. .", "회원가입", 
		JOptionPane.WARNING_MESSAGE); 
		}
	   });	
		// 회원 가입 에서 확인 버튼 누른때
		confirmButton.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "회원가입되었습니다.", "회원가입 성공", 
		JOptionPane.PLAIN_MESSAGE);
		}
	  });	
		// 회원 탈퇴화면에서 확인 누르면
		confirmButton1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "회원탈퇴되었습니다.", "회원 탈퇴", 
		JOptionPane.PLAIN_MESSAGE);
		}
  });	
		// 회원 가입 에서 취소 버튼 누른때
		cancelButton1.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent e) {
		JOptionPane.showMessageDialog(null, "취소하시겠습니까?.", "회원탈퇴 ", 
		JOptionPane.ERROR_MESSAGE);
		JOptionPane.showMessageDialog(null, "취소되었습니다. .", "회원탈퇴", 
		JOptionPane.WARNING_MESSAGE); 
		}
	   });
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// 로고 이미지 인데 이건 내일 다시 수정 할께요!
		try {
		frame.setIconImage(ImageIO.read(new File("image/logo3.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
					

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
