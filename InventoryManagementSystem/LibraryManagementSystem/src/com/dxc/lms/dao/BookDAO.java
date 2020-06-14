package com.dxc.lms.dao;

import java.util.List;

import com.dxc.lms.exception.LibraryException;
import com.dxc.lms.model.Book;

public interface BookDAO {

	void addBook(Book book) throws LibraryException;
	void deleteBook(int bcode) throws LibraryException;
	List<Book> getAllBooks();
	Book getBookByCode(int bcode);
}
