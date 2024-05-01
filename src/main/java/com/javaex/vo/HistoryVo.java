package com.javaex.vo;

public class HistoryVo {

	//필드
	private int history_no; //history
	private int product_no; //상품
	private int receipt_no; //영수증
	private int hi_no;
	private int count;
	
	private String hoi;
	
	

	//생성자
	public HistoryVo() {
		super();
	}

	public HistoryVo(int history_no, int product_no, int receipt_no, int hi_no, int count, String hoi) {
		super();
		this.history_no = history_no;
		this.product_no = product_no;
		this.receipt_no = receipt_no;
		this.hi_no = hi_no;
		this.count = count;
		this.hoi = hoi;
	}

	
	//메소드 - g/s
	public int getHistory_no() {
		return history_no;
	}

	public void setHistory_no(int history_no) {
		this.history_no = history_no;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public int getReceipt_no() {
		return receipt_no;
	}

	public void setReceipt_no(int receipt_no) {
		this.receipt_no = receipt_no;
	}

	public int getHi_no() {
		return hi_no;
	}

	public void setHi_no(int hi_no) {
		this.hi_no = hi_no;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getHoi() {
		return hoi;
	}

	public void setHoi(String hoi) {
		this.hoi = hoi;
	}

	//메소드 - 일반 
	@Override
	public String toString() {
		return "HistoryVo [history_no=" + history_no + ", product_no=" + product_no + ", receipt_no=" + receipt_no
				+ ", hi_no=" + hi_no + ", count=" + count + ", hoi=" + hoi + "]";
	}
	
	
	
}
