package dao;

import model.Book;

public class BookDaoImpl implements IBookDao{

	@Override
	public Book getBook() {
		Book book = new Book();
		book.setBookId(10);
		book.setBookName("小李");
		return book;
	}

}
