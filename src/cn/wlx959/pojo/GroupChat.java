package cn.wlx959.pojo;

import java.io.Serializable;
import java.util.Date;

public class GroupChat implements Serializable {
	private static final long serialVersionUID = 1L;
	private int groupChatId;
	private int groupSendId;
	private int groupId;
	private String groupChatContent;
	private Date sendTime;
	
	public int getGroupChatId() {
		return groupChatId;
	}
	public void setGroupChatId(int groupChatId) {
		this.groupChatId = groupChatId;
	}
	public int getGroupSendId() {
		return groupSendId;
	}
	public void setGroupSendId(int groupSendId) {
		this.groupSendId = groupSendId;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupChatContent() {
		return groupChatContent;
	}
	public void setGroupChatContent(String groupChatContent) {
		this.groupChatContent = groupChatContent;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
