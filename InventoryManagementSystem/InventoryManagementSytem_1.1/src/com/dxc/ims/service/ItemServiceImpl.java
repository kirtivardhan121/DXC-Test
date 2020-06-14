package com.dxc.ims.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.ims.dao.ItemDAO;
import com.dxc.ims.dao.ItemDAOImpl;
import com.dxc.ims.exception.InventoryException;
import com.dxc.ims.model.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDAO itemDao;

	public ItemServiceImpl() throws InventoryException {
		this.itemDao = new ItemDAOImpl();
	}

	/*
	 * item code can not be zero or negative 
	 * it should not be repetitive
	 */
	private boolean isValidICode(int icode) {

		return icode >0 && (itemDao.getItemByCode(icode)==null);
	}
	/*
	 * item name can not be null minimum character of 5 and max of 20
	 */
	private boolean isValidIname(String iname) {

		return iname!=null && iname.length()>5 && iname.length()<20;
	}
	/*
	 * price can not be zero and negative
	 */
	private boolean isValidPrice(double price) {

		return price>0;	
	}

	private boolean isValidPackageDate(LocalDate packageDate) {
		LocalDate today = LocalDate.now();
		return   !packageDate.isAfter(today);
	}

	private boolean isValidItem(Item item) throws InventoryException {

		boolean isValid=true;

		if(item==null) {
			isValid=false;
			throw new InventoryException("Item can not null");
		}

		List<String> errMsgs = new ArrayList<String>();

		if(!isValidICode(item.getIcode())){
			errMsgs.add("Err: Icode can be zero or negative, Icode can not be repetative.");
		}
		if(!isValidIname(item.getIname())){
			errMsgs.add("Err: Title can not be blank, and must be of 5 to 20 chars in length.");
		}
		if(!isValidPrice(item.getPrice())){
			errMsgs.add("Err: Price can be zero or negative.");
		}
		if(!isValidPackageDate(item.getPackageDate())) {
			errMsgs.add("Err: Package Date can not be a future date.");
		}

		if(errMsgs.size()>0) {
			isValid=false;
			throw new InventoryException(errMsgs.toString());
		}

		return isValid;
	}
	@Override
	public void addItem(Item item) throws InventoryException {

		if(isValidItem(item)) {
			itemDao.addItem(item);
		}

	}

	@Override
	public void deleteItem(int icode) throws InventoryException {
		itemDao.deleteItem(icode);
	}

	@Override
	public List<Item> getAllItems() {

		return itemDao.getAllItems();
	}

	@Override
	public Item getItemByCode(int icode) {

		return itemDao.getItemByCode(icode);
	}

}
