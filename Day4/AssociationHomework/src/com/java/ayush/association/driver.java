package com.java.ayush.association;

public class driver {

	public static void main(String[] args) {
		department dept=new department("DevOps",169);
		company comp = new company("Microsoft","Mumbai");
		
		employee e1 = new employee(7,40000,"Ayush",dept,comp);
		System.out.println(e1);
	}

}