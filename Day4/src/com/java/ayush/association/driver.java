package com.java.ayush.association;

public class driver {

	public static void main(String[] args) {
		address Address = new address("Lala Nigam Road", "Mumbai", "Maharashtra", 400005); 

		person p= new person("Ayush", 23, Address);
		
		p.displayData();
	}

}
