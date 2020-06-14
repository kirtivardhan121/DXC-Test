package com.dxc.lms.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.lms.dao.BookDAO;
import com.dxc.lms.dao.BookDAOImpl;
import com.dxc.lms.exception.LibraryException;
import com.dxc.lms.model.Book;

public class BookServiceImpl implements BookService {

	private BookDAO bookDao;
	
	public BookServiceImpl() throws LibraryException {
		this.bookDao = new BookDAOImpl();
	}
	
	private boolean isValidBcode(int bcode) {
		
		return bcode > 0 && (bookDao.getBookByCode(bcode)==null);
	}
	
	private boolean isValidBname(String bname) {
		
		return bname != null && bname.length()>5 && bname.length()<20;
	}
	
	private boolean isValidPrice(double price) {
		
		return price>0;
	}
	
	private boolean isValidPackageDate(LocalDate packageDate)  {
		
		LocalDate today = LocalDate.now();
		return !packageDate.isAfter(today);
	}
	
	private boolean isValidBook(Book book) throws LibraryException {

		boolean isValid=true;

		if(book==null) {
			isValid=false;
			throw new LibraryException("Item can not null");
		}

		List<String> errMsgs = new ArrayList<String>();

		if(!isValidBcode(book.getBcode())){
			errMsgs.add("Err: Icode can be zero or negative, Icode can not be repetative.");
		}
		if(!isValidBname(book.getBname())){
			errMsgs.add("Err: Title can not be blank, and must be of 5 to 20 chars in length.");
		}
		if(!isValidPrice(book.getPrice())){
			errMsgs.add("Err: Price can be zero or negative.");
		}
		if(!isValidPackageDate(book.getPackageDate())) {
			errMsgs.add("Err: Package Date can not be a future date.");
		}

		if(errMsgs.size()>0) {
			isValid=false;
			throw new LibraryException(errMsgs.toString());
		}

		return isValid;
	}
	
	@Override
	public void addBook(Book book) throws LibraryException {
		
		if(isValidBook(book)) {
			bookDao.addBook(book);
		}

	}

	@Override
	public void deleteBook(int bcode) throws LibraryException {
		
		bookDao.deleteBook(bcode);
	}

	@Override
	public List<Book> getAllBooks() {
		
		return bookDao.getAllBooks();
	}

	@Override
	public Book getBookByCode(int bcode) {
		
		return bookDao.getBookByCode(bcode);
	}

}
