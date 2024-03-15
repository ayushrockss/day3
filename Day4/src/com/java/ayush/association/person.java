package com.java.ayush.association;

//container class
public class person {
	private String name;
	private int age;
	//dependency
	private address Address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public address getAddress() {
		return Address;
	}
	public void setAddress(address address) {
		Address = address;
	}
	
	
	
	public person() {
		super();
	}
	
	
	
	public person(String name, int age, address address) {
		super();
		this.name = name;
		this.age = age;
		Address = address;
	}
	public void displayData() {
		System.out.println("Name of the person: " +name+ "\n" + "age of the person: " +age+ "\n"+ "Address: "+" " +Address.getStreet()+" " +Address.getCity()+" " +Address.getState()+" " +Address.getZipcode());
	}

}
