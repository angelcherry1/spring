package model;

public class Book {
private Integer bookId;
private String bookName;
public Integer getBookId() {
	return bookId;
}
public void setBookId(Integer bookId) {
	System.out.println("==================================================");
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Book(Integer bookId, String bookName) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
}
public Book() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
}

}
