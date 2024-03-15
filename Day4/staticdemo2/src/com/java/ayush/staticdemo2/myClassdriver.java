package com.java.ayush.staticdemo2;

public class myClassdriver {

	public static void main(String[] args) {
		myClass obj1=new myClass();
		obj1.show();
		myClass.addStudents();//static method
		
		myClass obj2=new myClass();
		obj2.show();
		myClass.addStudents();

	}

}
