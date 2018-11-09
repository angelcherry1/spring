package com.ss.pojo;

public class BookInfo {
private Long bookInfoId;
private Long bookId;
private String detail;
private String picStyle;
private Publish publish;
private PrintInfo printInfo;
public PrintInfo getPrintInfo() {
	return printInfo;
}
public void setPrintInfo(PrintInfo printInfo) {
	this.printInfo = printInfo;
}
public Long getBookInfoId() {
	return bookInfoId;
}
public void setBookInfoId(Long bookInfoId) {
	this.bookInfoId = bookInfoId;
}
public Long getBookId() {
	return bookId;
}
public void setBookId(Long bookId) {
	this.bookId = bookId;
}
public String getDetail() {
	return detail;
}
public void setDetail(String detail) {
	this.detail = detail;
}
public String getPicStyle() {
	return picStyle;
}
public void setPicStyle(String picStyle) {
	this.picStyle = picStyle;
}
public Publish getPublish() {
	return publish;
}
public void setPublish(Publish publish) {
	this.publish = publish;
}
public BookInfo(Long bookInfoId, Long bookId, String detail, String picStyle, Publish publish, PrintInfo printInfo) {
	super();
	this.bookInfoId = bookInfoId;
	this.bookId = bookId;
	this.detail = detail;
	this.picStyle = picStyle;
	this.publish = publish;
	this.printInfo = printInfo;
}
@Override
public String toString() {
	return "BookInfo [bookInfoId=" + bookInfoId + ", bookId=" + bookId + ", detail=" + detail + ", picStyle=" + picStyle
			+ ", publish=" + publish + ", printInfo=" + printInfo + "]";
}
public BookInfo() {
	super();
}

}
