package com.dxc.sl.ui;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import com.dxc.sl.model.Item;

public class ReadDataFromFile {

	public static void main(String[] args) {
		
		final String DATA_FILE_NAME = "itemsData.dat";

		try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(DATA_FILE_NAME))){

			List<Item> itemsList = (List<Item>) oin.readObject();

			itemsList.stream().forEach(System.out::println);

		}catch(IOException | ClassNotFoundException exp) {
			System.out.println(exp.getMessage());
		}
	}
}
