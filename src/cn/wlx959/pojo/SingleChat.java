package cn.wlx959.pojo;

import java.io.Serializable;
import java.util.Date;

public class SingleChat implements Serializable {
	private static final long serialVersionUID = 1L;
	private int singleId;
	private int singleSendId;
	private int singleReceiveId;
	private String singleContent;
	private Date sendTime;
	
	public int getSingleId() {
		return singleId;
	}
	public void setSingleId(int singleId) {
		this.singleId = singleId;
	}
	public int getSingleSendId() {
		return singleSendId;
	}
	public void setSingleSendId(int singleSendId) {
		this.singleSendId = singleSendId;
	}
	public int getSingleReceiveId() {
		return singleReceiveId;
	}
	public void setSingleReceiveId(int singleReceiveId) {
		this.singleReceiveId = singleReceiveId;
	}
	public String getSingleContent() {
		return singleContent;
	}
	public void setSingleContent(String singleContent) {
		this.singleContent = singleContent;
	}
	public Date getSendTime() {
		return sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
