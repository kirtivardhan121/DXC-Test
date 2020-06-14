package com.dxc.oopd.ui;

public class InheritenceDemo {

	public static void main(String[] args) {
		
        Demo2 d2a = new Demo2();                        
        Demo2 d2b = new Demo2(10);   
	}
}

class Demo {

	 

    public Demo(){
            System.out.println("a");
    }
    public Demo(int f1,int f2) {
            System.out.println("b");
    }
}

 

class Demo2 extends Demo{
    public Demo2(){
    		super(0,0);
            System.out.println("c");
    }
    public Demo2(int x){
    		super(0,0);
            System.out.println("d");
    }
}
