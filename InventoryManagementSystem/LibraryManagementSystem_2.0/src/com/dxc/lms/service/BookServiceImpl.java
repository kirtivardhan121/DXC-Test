package com.dxc.lms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.lms.dao.BookDAO;
import com.dxc.lms.dao.BookDAOImpl;
import com.dxc.lms.exception.BookException;
import com.dxc.lms.model.Book;

public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;

	public BookServiceImpl() throws BookException{
		this.bookDAO = new BookDAOImpl();
	}

	private boolean isValidBcode(int bcode) throws BookException{

		return bcode > 0 && (bookDAO.getBookByBcode(bcode)==null);
	}

	private boolean isValidBname(String bname) throws BookException{

		return bname!=null && bname.length()>5 && bname.length()<20;
	}

	private boolean isValidPrice(double price) {

		return price>0;
	}

	private boolean isValidPackageDate(LocalDate packageDate) {
		LocalDate today = LocalDate.now();
		return !packageDate.isAfter(today);
	}

	private boolean isValidBook(Book book) throws BookException {

		boolean isValid=true;

		if(book==null) {
			isValid=false;
			throw new BookException("book can not null");
		}

		List<String> errMsgs = new ArrayList<String>();

		if(!isValidBcode(book.getBcode())){
			errMsgs.add("Err: Bcode can be zero or negative, Bcode can not be repetative.");
		}
		if(!isValidBname(book.getBname())){
			errMsgs.add("Err: Name can not be blank, and must be of 5 to 20 chars in length.");
		}
		if(!isValidPrice(book.getPrice())){
			errMsgs.add("Err: Price can be zero or negative.");
		}
		if(!isValidPackageDate(book.getPackageDate())) {
			errMsgs.add("Err: Package Date can not be a future date.");
		}

		if(errMsgs.size()>0) {
			isValid=false;
			throw new BookException(errMsgs.toString());
		}

		return isValid;
	}

	@Override
	public void addBook(Book book) throws BookException {

		if(isValidBook(book)) {
			bookDAO.addBook(book);
		}
	}

	@Override
	public void deleteBook(int bcode) throws BookException {

		bookDAO.deleteBook(bcode);
	}

	@Override
	public List<Book> getAllBooks() throws BookException {

		return bookDAO.getAllBooks();
	}

	@Override
	public Book getBookByBcode(int bcode) throws BookException {

		return bookDAO.getBookByBcode(bcode);
	}

}
