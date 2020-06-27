package com.kh.project.movie1;

import java.awt.Color;
import java.awt.Image;
import java.awt.Label;
import java.awt.TextField;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WithdrawalPanel extends JPanel{
	public WithdrawalPanel() {
	
		setBounds(800, 400, 350, 600);
		setBackground(Color.white);//panel 색 설정
		 setLayout(null);
		
		  // 라벨 생성
		  Label nameLabel = new Label("이름 :");	
		  Label  idLabel = new Label("아이디 :");
		  Label pswLabel = new Label("패스워드 :");
		  Label ageLabel = new Label("생년월일  :");
		  
		  
		  
		 //텍스트란 생성
		  TextField  nameText = new TextField();//이름 입력란
		  TextField  idText = new TextField();//아이디 입력란
		  TextField  pswText = new TextField();//패스워드 입력란
		  JTextField  ageText = new JTextField(6);//생년월일 입력
		  
		//패스워드 *표시
		 pswText.setEchoChar('*');
		    
		 //라벨 패널에 넣기
		 add(nameLabel);
		 add(idLabel);
		 add(pswLabel);
		 add(ageLabel);
		  
		 //텍스트 패널에 넣기
		 add(nameText);
		 add(idText);
		add(pswText);
		add(ageText); 
		
		
		//라벨 위치 설정
	    nameLabel.setBounds(20, 50, 100, 40);
	    idLabel.setBounds(20, 100, 100, 40);
	    pswLabel.setBounds(20,150,100,40);
	    ageLabel.setBounds(20, 200, 100, 40);
	    
	    //텍스트 위치 설정
	    nameText.setBounds(150, 50, 200, 30);
	    idText.setBounds(150, 100, 200, 30);
	    pswText.setBounds(150, 150, 200, 30);
	    ageText.setBounds(150, 200, 200, 30);
		
	    // 이미지 생성
	 	ImageIcon imageIcon = new ImageIcon("image/logo1.PNG");
	 	Image image = imageIcon.getImage();
	 	Image icon = image.getScaledInstance(900, 850, 150);
	 			
	 			
	 	// 라벨에 이미지 넣기
	 	JLabel imageLabel = new JLabel(new ImageIcon(icon));
	 	// 이미지라벨 크기&위치 지정
	 	imageLabel.setBounds(230, 80, 700, 300);
	 	// 패널에 이미지 라벨 끼우기
	 	add(imageLabel);
		

		
		
	}
}
