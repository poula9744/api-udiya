package com.javaex.vo;

public class KjhVo {

	//필드
	private String nick;
	private int mile;
	
	
	//생성자
	public KjhVo() {
		super();
	}


	public KjhVo(String nick, int mile) {
		super();
		this.nick = nick;
		this.mile = mile;
	}


	public String getNick() {
		return nick;
	}


	public void setNick(String nick) {
		this.nick = nick;
	}


	public int getMile() {
		return mile;
	}


	public void setMile(int mile) {
		this.mile = mile;
	}


	@Override
	public String toString() {
		return "KjhVo [nick=" + nick + ", mile=" + mile + "]";
	}
	
	
	
	//메소드  - g/s
	
	
	
	//메소드 - 일반
}
