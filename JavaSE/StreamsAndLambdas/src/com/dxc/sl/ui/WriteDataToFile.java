package com.dxc.sl.ui;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.dxc.sl.model.Item;
import com.dxc.sl.model.ItemCategory;

public class WriteDataToFile {

	public static void main(String[] args) {
		
		final String DATA_FILE_NAME = "itemsData.dat";
        
        List<Item> itemsList = new ArrayList<Item>() {{
            add(new Item(101,"10 Apples Pack",250,LocalDate.now(),ItemCategory.RTE));
            add(new Item(102,"10 Mangos Pack",2050,LocalDate.now(),ItemCategory.RTE));
            add(new Item(103,"25Kg Rice Bag",1250,LocalDate.now(),ItemCategory.FOOD));
            add(new Item(104,"50Kg Chanan Dal",2850,LocalDate.now(),ItemCategory.FOOD));
            add(new Item(105,"1Kg Horlicks Woman",150,LocalDate.now(),ItemCategory.BEVERAGE));
            add(new Item(106,"2L Coke",250,LocalDate.now(),ItemCategory.BEVERAGE));
        }};

 

        try(ObjectOutputStream oout = new ObjectOutputStream(new FileOutputStream(DATA_FILE_NAME))){
            oout.writeObject(itemsList);
            System.out.println("Data Saved!");
        }catch(IOException exp) {
            System.out.println(exp.getMessage());
        }
	}
}
