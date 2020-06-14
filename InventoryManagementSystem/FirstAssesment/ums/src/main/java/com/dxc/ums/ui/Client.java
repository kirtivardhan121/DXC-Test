package com.dxc.ums.ui;

import java.util.Scanner;

import com.dxc.ums.exception.ApplyException;
import com.dxc.ums.model.ApplyBean;
import com.dxc.ums.service.ApplyService;
import com.dxc.ums.service.ApplyServiceImpl;

public class Client {

	private static Scanner kbScanner; //keyboard scanner
	private static ApplyService applyService; //service object offers operations related to Application

	/*doAddStudent() checks all the inputs and if all of these are correct,
	  it'll add data in the table otherwise it'll throw an ApplyException*/

	private static void doAddStudent() {
		ApplyBean applyBean = new ApplyBean();

		System.out.println("Application Id>> ");
		while(!kbScanner.hasNextInt()) {
			System.out.println("Please add valid application id");
		}
		applyBean.setApplyId(kbScanner.nextLong());
		System.out.println("First Name>> ");
		applyBean.setfName(kbScanner.next());

		System.out.println("Last Name>> ");
		applyBean.setlName(kbScanner.next());

		System.out.println("Contact Number>> ");
		applyBean.setContactNo(kbScanner.next());

		System.out.println("Stream>> ");
		applyBean.setStream(kbScanner.next());

		System.out.println("Aggregate>> ");
		applyBean.setAggregate(kbScanner.nextDouble());

		try {
			applyService.addApply(applyBean);
			System.out.println("Thank You "+ applyBean.getfName() +" Your unique id is " + applyBean.getApplyId() +" we will contact you shortly!!!");
		} catch (ApplyException e) {
			System.out.println(e.getMessage());
		}
	}

	/*dogetApplyDetails search the student data with the help of Application Id,
	 * if Application id is valid it'll return the data present in table 
	 * other wise it'll throw an ApplyException.
	 */

	private static void dogetApplyDetails(long applyId){


		ApplyBean bean;
		try {
			bean = applyService.getApplyDetails(applyId);
			if(bean == null) {
				System.out.println("Please Enter valid Application ID");
			} else {
				System.out.println("ApplicationId\tFirstName\tLastName\tContactNumber\tStream\tAggregate");
				System.out.println("=======================================================================");
				System.out.println(bean.getApplyId()+ "\t\t" +bean.getfName()+ "\t\t" +bean.getlName()+ "\t\t" +bean.getContactNo()+ "\t" +bean.getStream()+ "\t" +bean.getAggregate());
			}
		} catch (ApplyException e) {
			System.out.println(e.getMessage());
		}



	}

	public static void main(String[] args) {

		kbScanner = new Scanner(System.in);

		try {
			applyService = new ApplyServiceImpl();
		} catch (ApplyException e) {
			System.out.println(e.getMessage());
		}

		Menu menu = null;

		while(menu != Menu.QUIT) {
			System.out.println("Choice\tMenu");
			for(Menu m : Menu.values()) {
				System.out.println((m.ordinal()+1) + "\t" + m);
			}
			System.out.println("Enter Your Choice>>");
			int choice = kbScanner.nextInt();
			int ordinal = choice-1;

			if(ordinal >=0 && ordinal < menu.values().length) {
				menu = Menu.values()[ordinal];
			} else {
				System.out.println("Invalid Choice");
				continue;
			}

			switch(menu) {
			case ADD:
				doAddStudent();
				break;
			case DISPLAY:
				System.out.println("ApplyId>> ");
				long applyId = kbScanner.nextLong();
				dogetApplyDetails(applyId);
				break;
			case QUIT:
				System.out.println("Thank You for visiting us!!!");
				break;
			default:
				System.out.println("Invalid Choice!!!");
				break;
			}
		}
		kbScanner.close();
	}//end of main()
}//end of Client
