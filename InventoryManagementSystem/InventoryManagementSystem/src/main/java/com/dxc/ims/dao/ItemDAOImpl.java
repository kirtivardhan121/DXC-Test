package com.dxc.ims.dao;

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

import com.dxc.ims.exception.InventoryException;
import com.dxc.ims.model.Item;

public class ItemDAOImpl implements ItemDAO{

	private static final String DATA_FILE_NAME = "itemsData.dat";//filename to store data

	private Map<Integer, Item> itemsMap;//map will store all items

	public ItemDAOImpl() throws InventoryException {
		File file = new File(DATA_FILE_NAME);

		if(file.exists()) {

			try(ObjectInputStream oin = new ObjectInputStream(new FileInputStream(file))) {

				itemsMap = (Map<Integer, Item>) oin.readObject();

			} catch (IOException | ClassNotFoundException e) {
				itemsMap = new TreeMap<>();
				throw new InventoryException("Unable to read data: ");

			}
		} else {
			itemsMap = new TreeMap<>();
		}
	}



	private void saveDate() throws InventoryException {

		try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(DATA_FILE_NAME))) {

			oout.writeObject(itemsMap);

		} catch (IOException e) {
			throw new InventoryException("Unable to save data");		}
	}

	@Override
	public void addItem(Item item) throws InventoryException {

		if(item!= null) {

			itemsMap.put(item.getIcode(), item);
		} else {
			throw new InventoryException("Null Item Can Not be stored");
		}

	}
	
	/*
	 * deleteItem will accept the icode and removes the respective item from map,and saves.
	 * if icode is not found, it will throw an InventoryException.
	 */

	@Override
	public void deleteItem(int icode) throws InventoryException {

		if(itemsMap.containsKey(icode)) {

			itemsMap.remove(icode);
			saveDate();
		} else {
			throw new InventoryException("Item"+ icode +"Not found");
		}

	}

	/*
	 * getAllItems will return all the items from the map as list.
	 */
	@Override
	public List<Item> getAllItems() {

		return new ArrayList<>(itemsMap.values());
	}

	/*
	 * getItemByCode will return the items respective to the given icode.
	 * if not found return null.
	 */
	@Override
	public Item getItemByIcode(int icode) {

		return itemsMap.get(icode);
	}
}
