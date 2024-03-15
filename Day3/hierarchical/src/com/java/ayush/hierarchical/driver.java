package com.java.ayush.hierarchical;

public class driver {

	public static void main(String[] args) {
		person p;
		person p1= new person();	// Tight Coupling
		p1.setName("Ayush");
		p1.setAge(23);
		p1.setGender("Male");
		System.out.println(p1);
		
		p = new student(28,"Watumull"); // Dynamic Binding OR loose Coupling
		System.out.println(p);
		
		p = new employee(1669,"Software Engineer",169);
		System.out.println(p);
		
		p = new engineer("Computer Engineering","BE",696969);
		System.out.println(p);

}
}
