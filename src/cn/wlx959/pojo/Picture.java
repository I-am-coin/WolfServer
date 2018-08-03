package cn.wlx959.pojo;

import java.io.Serializable;

public class Picture implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pictureId;
	private String pictureAddress;
	
	public int getPictureId() {
		return pictureId;
	}
	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}
	public String getPictureAddress() {
		return pictureAddress;
	}
	public void setPictureAddress(String pictureAddress) {
		this.pictureAddress = pictureAddress;
	}
}
