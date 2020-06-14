package com.dxc.lms.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.dxc.lms.exception.LibraryException;
import com.dxc.lms.model.Book;

public class BookDAOImpl implements BookDAO {

	private static final String DATA_FILE_NAME = "booksData.dat";//filename to store data

	private Map<Integer, Book> booksMap;//map will store all items

	public BookDAOImpl() throws LibraryException {
		File file = new File(DATA_FILE_NAME);

		if(file.exists()) {

			try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {

				booksMap = (Map<Integer, Book>) oin.readObject();

			} catch (IOException | ClassNotFoundException e) {
				booksMap = new TreeMap<>();
				throw new LibraryException("Unable to read data: ");

			}
		} else {
			booksMap = new TreeMap<>();
		}
	}



	private void saveDate() throws LibraryException {

		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(DATA_FILE_NAME))) {

			oout.writeObject(booksMap);

		} catch (IOException e) {
			throw new LibraryException("Unable to save data");		}
	}

	@Override
	public void addBook(Book book) throws LibraryException {

		if(book!= null) {

			booksMap.put(book.getBcode(), book);
		} else {
			throw new LibraryException("Null Item Can Not be stored");
		}

	}

	@Override
	public void deleteBook(int bcode) throws LibraryException {

		if(booksMap.containsKey(bcode)) {

			booksMap.remove(bcode);
			saveDate();
		} else {
			throw new LibraryException("Item"+ bcode +"Not found");
		}

	}

	@Override
	public List<Book> getAllBooks() {

		return new ArrayList<>(booksMap.values());
	}

	@Override
	public Book getBookByCode(int bcode) {
		return booksMap.get(bcode);
	}

}
