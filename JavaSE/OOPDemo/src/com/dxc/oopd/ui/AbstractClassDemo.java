package com.dxc.oopd.ui;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

import com.dxc.oopd.model.Person;
import com.dxc.oopd.model.Student;
import com.dxc.oopd.model.Teacher;

public class AbstractClassDemo {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher(101, "Vamsy", "Kiran", "java");
		
		Student s1 = new Student(11, "vardhan", "singh", 2);
		
		System.out.println(t1.getFirstName()+"\t"+t1.getLastName()+"\t"+t1.getSubject());
		System.out.println(s1.getFirstName()+"\t"+s1.getLastName()+"\t"+s1.getClazz());
		
		System.out.println(t1 instanceof Person);
		System.out.println(s1 instanceof Person);
	}//end of main

}//end of AbstractClassDemo class
