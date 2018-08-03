package cn.wlx959.pojo;

import java.io.Serializable;

public class Group implements Serializable{
	private static final long serialVersionUID = 1L;
	private int groupId;//Ⱥ��
	private String groupNickname;//Ⱥ�ǳ�
	private int groupImg;//Ⱥͷ��
	private int groupNumber;//Ⱥ��Ա��
	@SuppressWarnings("unused")
	private static final int groupMaxNumber = 50;//Ⱥ����Ա��
	
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupNickname() {
		return groupNickname;
	}
	public void setGroupNickname(String groupNickname) {
		this.groupNickname = groupNickname;
	}
	public int getGroupImg() {
		return groupImg;
	}
	public void setGroupImg(int groupImg) {
		this.groupImg = groupImg;
	}
	public int getGroupNumber() {
		return groupNumber;
	}
	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}
}
