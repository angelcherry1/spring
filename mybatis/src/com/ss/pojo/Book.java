package com.ss.pojo;

import java.io.Serializable;

public class Book implements Serializable{
	private static final long serialVersionUID = 597733879789573558L;
	private Long id;
	private Long bookId;
	private String bookName;
	private String bookAuthor;
	private Integer bookPrice;
	private String bookKind;
	private Integer totalStore;
	private Integer totalSold;
	private String bookPic;
	private String bookProfile;
	private Boolean bookStatus;
	private BookInfo bookInfo=new BookInfo();
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookId() {
		return bookId;
	}
	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookKind() {
		return bookKind;
	}
	public void setBookKind(String bookKind) {
		this.bookKind = bookKind;
	}
	public Integer getTotalStore() {
		return totalStore;
	}
	public void setTotalStore(Integer totalStore) {
		this.totalStore = totalStore;
	}
	public Integer getTotalSold() {
		return totalSold;
	}
	public void setTotalSold(Integer totalSold) {
		this.totalSold = totalSold;
	}
	public String getBookPic() {
		return bookPic;
	}
	public void setBookPic(String bookPic) {
		this.bookPic = bookPic;
	}
	public String getBookProfile() {
		return bookProfile;
	}
	public void setBookProfile(String bookProfile) {
		this.bookProfile = bookProfile;
	}
	public Boolean getBookStatus() {
		return bookStatus;
	}
	public void setBookStatus(Boolean bookStatus) {
		this.bookStatus = bookStatus;
	}
	public BookInfo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}
	public Book(Long id, Long bookId, String bookName, String bookAuthor, Integer bookPrice, String bookKind,
			Integer totalStore, Integer totalSold, String bookPic, String bookProfile, Boolean bookStatus,
			BookInfo bookInfo) {
		super();
		this.id = id;
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookKind = bookKind;
		this.totalStore = totalStore;
		this.totalSold = totalSold;
		this.bookPic = bookPic;
		this.bookProfile = bookProfile;
		this.bookStatus = bookStatus;
		this.bookInfo = bookInfo;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookId=" + bookId + ", bookName=" + bookName + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", bookKind=" + bookKind + ", totalStore=" + totalStore + ", totalSold="
				+ totalSold + ", bookPic=" + bookPic + ", bookProfile=" + bookProfile + ", bookStatus=" + bookStatus
				+ ", bookInfo=" + bookInfo + "]";
	}

}
