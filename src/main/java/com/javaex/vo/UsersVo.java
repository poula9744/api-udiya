package com.javaex.vo;

public class UsersVo {

	//필드
	private int users_no; //유저넘버
	private String name;
	private String user_id;
	private String password;
	private String nick;
	private String hp;
	
	
	//생성자
	public UsersVo() {
		super();
	}

	public UsersVo(int users_no, String name, String user_id, String password, String nick, String hp) {
		super();
		this.users_no = users_no;
		this.name = name;
		this.user_id = user_id;
		this.password = password;
		this.nick = nick;
		this.hp = hp;
	}

	//메소드 - g/s
	public int getUsers_no() {
		return users_no;
	}

	public void setUsers_no(int users_no) {
		this.users_no = users_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	//메소드 - 일반
	@Override
	public String toString() {
		return "UsersVo [users_no=" + users_no + ", name=" + name + ", user_id=" + user_id + ", password=" + password
				+ ", nick=" + nick + ", hp=" + hp + "]";
	}
	
	
}
