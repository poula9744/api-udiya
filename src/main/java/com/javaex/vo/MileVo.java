package com.javaex.vo;

public class MileVo {

	//필드
	private int users_no; //유저넘버
	private String date; //마일리지
	private int mile;
	private String accumulate;
	private int totalmile;
	
	
	//생성자
	public MileVo() {
		super();
	}


	public MileVo(int users_no, String date, int mile, String accumulate, int totalmile) {
		super();
		this.users_no = users_no;
		this.date = date;
		this.mile = mile;
		this.accumulate = accumulate;
		this.totalmile = totalmile;
	}


	//메소드 - g/s
	public int getUsers_no() {
		return users_no;
	}


	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public int getMile() {
		return mile;
	}


	public void setMile(int mile) {
		this.mile = mile;
	}


	public String getAccumulate() {
		return accumulate;
	}


	public void setAccumulate(String accumulate) {
		this.accumulate = accumulate;
	}


	public int getTotalmile() {
		return totalmile;
	}


	public void setTotalmile(int totalmile) {
		this.totalmile = totalmile;
	}


	//메소드 - 일반
	@Override
	public String toString() {
		return "MileVo [users_no=" + users_no + ", date=" + date + ", mile=" + mile + ", accumulate=" + accumulate
				+ ", totalmile=" + totalmile + "]";
	}
	
	
	
}
