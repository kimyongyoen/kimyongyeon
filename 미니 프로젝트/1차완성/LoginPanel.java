package com.kh.project.movie1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LoginPanel extends JPanel {

	public LoginPanel() {	
		setBounds(800, 400, 350, 600);
		setBackground(Color.WHITE);//panel 색 설정
		setLayout(null);
		  
		//JLabel label = new JLabel(new ImageIcon("image/cgv.png")); // panel 있는 로고 
		Label textLabel1= new Label(" 우리 동네 영화관에 오신걸 환영합니다.");
		Label textLabel2= new Label("ID 입력 후 로그인 버튼을 클릭하세요.");
		Label textLabel3= new Label("청정 구역^^");
		Label textLabel4= new Label("코로나 걱정 없어요!!");
		Label idLabel= new Label("아이디  :");//아이디 라벨
		Label pswLabel= new Label("비밀번호  :");// 비밀번호 라벨
				
		//텍스트 칸 생성
		TextField idText = new TextField();// 아이디 입력칸
		TextField pswText = new TextField();// 비밀번호 입력칸
			
		pswText.setEchoChar('*');// 비밀 번호 암호화
			
			
		//라벨 끼워 넣기
		add(textLabel1);
		add(textLabel2);
		add(textLabel3);
		add(textLabel4);
		add(idLabel);
		add(pswLabel);
		
		//텍스트칸 끼워 넣기
		add(idText);
		add(pswText);
		
		
		
		// 라벨 위치 설정
		textLabel1.setBounds(548, 100, 300, 70);//"CGV에 오신걸 환영합니다."
		textLabel2.setBounds(560,360, 300, 80);//"ID입력 후 로그인 버튼을 클릭하세요."
		textLabel3.setBounds(552,150, 300, 80);//"청정 구역^^"
		textLabel4.setBounds(553,200, 300, 80);//""코로나 걱정 없어요!!"
		idLabel.setBounds(64, 365, 60, 40);//"아이디:"
		pswLabel.setBounds(65, 410, 60, 40);//"비밀번호:"
		
		//label.setBounds(40, 50, 330, 300);// 우리동네 영화관
		textLabel1.setBounds(548, 100, 300, 70);//"CGV에 오신걸 환영합니다."
		textLabel2.setBounds(560,360, 300, 80);//"ID입력 후 로그인 버튼을 클릭하세요."
		textLabel3.setBounds(552,150, 300, 80);//"청정 구역^^"
		textLabel4.setBounds(553,200, 300, 80);//""코로나 걱정 없어요!!"
		idLabel.setBounds(64, 365, 60, 40);//"아이디:"
		pswLabel.setBounds(65, 410, 60, 40);//"비밀번호:"
		idText.setBounds(150, 365, 200, 30);// 아이디 입력칸
		pswText.setBounds(150, 410, 200, 30);// 비밀번호 입력칸
		
		// 이미지 생성
		ImageIcon imageIcon = new ImageIcon("image/logo1.PNG");
		Image image = imageIcon.getImage();
		Image icon = image.getScaledInstance(900, 850, 150);
					
					
		// 라벨에 이미지 넣기
		JLabel imageLabel = new JLabel(new ImageIcon(icon));
		imageLabel.setBounds(-100, 10, 800, 300);
		add(imageLabel);
				
	

	}
}
