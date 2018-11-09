package com.ss.pojo;

import java.io.Serializable;

public class Publish implements Serializable{
	private static final long serialVersionUID = 1L;
	private Long publishId;
	private String publishName;
	private String publishDate;
	private Integer publishNum;
	public Long getPublishId() {
		return publishId;
	}
	public void setPublishId(Long publishId) {
		this.publishId = publishId;
	}
	public String getPublishName() {
		return publishName;
	}
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getPublishNum() {
		return publishNum;
	}
	public void setPublishNum(Integer publishNum) {
		this.publishNum = publishNum;
	}
	public Publish(Long publishId, String publishName, String publishDate, Integer publishNum) {
		super();
		this.publishId = publishId;
		this.publishName = publishName;
		this.publishDate = publishDate;
		this.publishNum = publishNum;
	}
	public Publish() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Publish [publishId=" + publishId + ", publishName=" + publishName + ", publishDate=" + publishDate
				+ ", publishNum=" + publishNum + "]";
	}
	
}
