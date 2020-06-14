package com.dxc.oopd.ui;

import com.dxc.oopd.model.ContractEmployee;
import com.dxc.oopd.model.Employee;
import com.dxc.oopd.model.Manager;
import com.dxc.oopd.model.ManagingDirector;

public class InheritenceDemo2 {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "vardhan", 2550);

		ContractEmployee emp2 = new ContractEmployee(102, "Kirti", 5000, 10.5);
		
		Manager mgr = new Manager(103, "harsh", 8000, 528);
		
		ManagingDirector mgrd = new ManagingDirector(104, "raj", 10000, 5000, 6000);
		
		System.out.println(emp.getEmpid() +"\t"+ emp.getName() +"\t"+ emp.getBasic());
		System.out.println(emp2.getEmpid() +"\t"+ emp2.getName() +"\t"+ emp2.getBasic() + "\t" + emp2.getContractDuration());
		System.out.println(mgr.getEmpid() +"\t"+ mgr.getName() +"\t"+ mgr.getBasic() +"\t"+ mgr.getAllowence());
		System.out.println(mgrd.getEmpid() +"\t"+ mgrd.getName() +"\t"+ mgrd.getBasic() +"\t"+ mgrd.getAllowence() +"\t"+ mgrd.getShare());
	}

}
