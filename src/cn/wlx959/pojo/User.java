package cn.wlx959.pojo;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private int userId;
	private String userPassword;//�û��˺�
	private String userNickname;//�û��ǳ�
	private int userImg;//�û�ͷ����
	private String useMood;//�û�����
	private int userStatus;//�û�״̬
	private int userPrivate = 0;//�Ƿ������û���Ϣ
	private int userSex;//�û��Ա�
	private String userAddress;//�û����ڵ�
	
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
