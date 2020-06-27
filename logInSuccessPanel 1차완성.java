package com.kh.project.movie1;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class logInSuccessPanel extends JPanel{
	public logInSuccessPanel() { 
		
		setBounds(800, 400, 350, 600);
		setBackground(Color.white);//panel 색 설정
		 setLayout(null);
		  
		  
		  
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
