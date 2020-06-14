package com.dxc.lms.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.dxc.lms.exception.BookException;
import com.dxc.lms.model.Book;

public class BookDAOImpl implements BookDAO {

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	private static final Logger logger = Logger.getLogger("BookDAO");
	private static final String dbUrl = "jdbc:mysql://localhost:3306/dxcbatch";
	private static final String dbUnm = "root";
	private static final String dbPwd = "root";
	
	private static final String INS_BOOK_QRY=
			"INSERT INTO books(bcode,bname,price,pdate) VALUES(?,?,?,?)";
	private static final String DEL_BOOK_QRY=
			"DELETE FROM books WHERE bcode=?";
	private static final String SEL_ALL_BOOKS_QRY=
			"SELECT bcode,bname,price,pdate FROM books";
	private static final String SEL_BOOK_BY_BCODE_QRY=
			"SELECT bcode,bname,price,pdate FROM books WHERE bcode=?";
	
	@Override
	public void addBook(Book book) throws BookException {
		
		if(book!=null) {
			try(Connection con = DriverManager.getConnection(dbUrl,dbUnm,dbPwd)){
				PreparedStatement binsert = con.prepareStatement(INS_BOOK_QRY);

				binsert.setInt(1,book.getBcode());
				binsert.setString(2, book.getBname());
				binsert.setDouble(3, book.getPrice());
				binsert.setDate(4, Date.valueOf(book.getPackageDate())); //java.time.LoclaDate into java.sql.Date

				binsert.executeUpdate();
				logger.info("Book added successfully");
			}catch(SQLException exp) {
				logger.error("Book donot added successfully");
				throw new BookException("Sorry! Add Book Operation Failed!"); 
			}
		}

	}

	@Override
	public void deleteBook(int bcode) throws BookException {
		
		try(Connection con = DriverManager.getConnection(dbUrl,dbUnm,dbPwd)){
			PreparedStatement bdelete = con.prepareStatement(DEL_BOOK_QRY);

			bdelete.setInt(1,bcode);

			bdelete.executeUpdate();
			logger.info("Book deleted successfully");
		}catch(SQLException exp) {
			logger.error("Book do not deleted");
			throw new BookException("Sorry! Delete Book Operation Failed!"); 
		}

	}

	@Override
	public List<Book> getAllBooks() throws BookException {
		
		List<Book> books =new ArrayList<Book>();

		try(Connection con = DriverManager.getConnection(dbUrl,dbUnm,dbPwd)){
			PreparedStatement bselect = con.prepareStatement(SEL_ALL_BOOKS_QRY);

			ResultSet rs = bselect.executeQuery();

			while(rs.next()) {
				Book book = new Book();

				book.setBcode(rs.getInt(1));
				book.setBname(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				book.setPackageDate(rs.getDate(4).toLocalDate());

				books.add(book);
			}
			logger.info("Book displayed successfully");
		}catch(SQLException exp) {
			logger.error("You got error displaying book");
			throw new BookException("Sorry! Could Not Retrive Data!"); 
		}

		return books;
	}

	@Override
	public Book getBookByBcode(int bcode) throws BookException {
		
		Book book =null;

		try(Connection con = DriverManager.getConnection(dbUrl,dbUnm,dbPwd)){
			PreparedStatement bselect = con.prepareStatement(SEL_BOOK_BY_BCODE_QRY);

			bselect.setInt(1,bcode);

			ResultSet rs = bselect.executeQuery();

			if(rs.next()) {
				book = new Book();
				book.setBcode(rs.getInt(1));
				book.setBname(rs.getString(2));
				book.setPrice(rs.getDouble(3));
				book.setPackageDate(rs.getDate(4).toLocalDate());
			}
			logger.info("Book displayed successfully");
		}catch(SQLException exp) {
			logger.error("You got error displaying book");
			throw new BookException("Sorry! Could Not Retrive Data!"); 
		}

		return book;
	}

}
