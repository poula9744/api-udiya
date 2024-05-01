package com.javaex.vo;

public class ReceiptVo {

	//필드
	private int receipt_no; //영수증
	private int users_no; //유저넘버
	private int franchisee_no;  //프랜차이즈
	private int total;
	private int usemile;
	private String selltime;
	
	private int franchisee_name;

	
	//생성자
	public ReceiptVo() {
		super();
	}


	public ReceiptVo(int receipt_no, int users_no, int franchisee_no, int total, int usemile, String selltime,
			int franchisee_name) {
		super();
		this.receipt_no = receipt_no;
		this.users_no = users_no;
		this.franchisee_no = franchisee_no;
		this.total = total;
		this.usemile = usemile;
		this.selltime = selltime;
		this.franchisee_name = franchisee_name;
	}


	//메소드 - g/s
	public int getReceipt_no() {
		return receipt_no;
	}


	public void setReceipt_no(int receipt_no) {
		this.receipt_no = receipt_no;
	}


	public int getUsers_no() {
		return users_no;
	}


	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}


	public int getFranchisee_no() {
		return franchisee_no;
	}


	public void setFranchisee_no(int franchisee_no) {
		this.franchisee_no = franchisee_no;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}


	public int getUsemile() {
		return usemile;
	}


	public void setUsemile(int usemile) {
		this.usemile = usemile;
	}


	public String getSelltime() {
		return selltime;
	}


	public void setSelltime(String selltime) {
		this.selltime = selltime;
	}


	public int getFranchisee_name() {
		return franchisee_name;
	}


	public void setFranchisee_name(int franchisee_name) {
		this.franchisee_name = franchisee_name;
	}


	//메소드 - 일반
	@Override
	public String toString() {
		return "ReceiptVo [receipt_no=" + receipt_no + ", users_no=" + users_no + ", franchisee_no=" + franchisee_no
				+ ", total=" + total + ", usemile=" + usemile + ", selltime=" + selltime + ", franchisee_name="
				+ franchisee_name + "]";
	}
	
	
}
