package cn.wlx959.pojo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userPassword;//用户账号
	private String userNickname;//用户昵称
	private int userImg;//用户头像编号
	private String useMood;//用户心情
	private int userStatus;//用户状态
	private int userPrivate = 0;//是否隐藏用户信息
	private int userSex;//用户性别
	private String userAddress;//用户所在地
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public int getUserImg() {
		return userImg;
	}
	public void setUserImg(int userImg) {
		this.userImg = userImg;
	}
	public String getUseMood() {
		return useMood;
	}
	public void setUseMood(String useMood) {
		this.useMood = useMood;
	}
	public int getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}
	public int getUserPrivate() {
		return userPrivate;
	}
	public void setUserPrivate(int userPrivate) {
		this.userPrivate = userPrivate;
	}
	public int getUserSex() {
		return userSex;
	}
	public void setUserSex(int userSex) {
		this.userSex = userSex;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
}
