package com.dxc.lms.service;

import java.util.List;

import com.dxc.lms.exception.BookException;
import com.dxc.lms.model.Book;

public interface BookService {

	void addBook(Book book) throws BookException;
	void deleteBook(int bcode) throws BookException;
	List<Book> getAllBooks() throws BookException;
	Book getBookByBcode(int bcode) throws BookException;
}
