# kimyongyeon

package com.kh.project.movie.LogIn.view;

import java.io.Serializable;

public class LonIn implements Serializable{// 처음 로그인 창 VO
	private String idInput; //회원 가입된  아이디 받아오기
	private String pswInput; //회원 가입된  비밀번호 받아오기
	
	
	public LonIn() {}
	public LonIn(String idInput, String pswInput) {
		super();
		this.idInput = idInput;
		this.pswInput= this.pswInput;
	}
	public String getIdInput() {
		return idInput;
	}
	public void setIdInput(String idInput) {
		this.idInput = idInput;
	}
	public String getPswInput() {
		return pswInput;
	}
	public void setPswInput(String pswInput) {
		this.pswInput = pswInput;
	}
	@Override
	public String toString() {
		return idInput + pswInput;
	}
	
}
