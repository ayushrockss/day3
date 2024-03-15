package com.java.ayush.staticdemo2;

public class myClass {
	private int srno;
	private int branchid;
	private static int noOfStudents;
	
	static {
		System.out.println("in static Block");
		noOfStudents = 50;
	}
	public myClass() {
		System.out.println("in default construtor");
		branchid++;
		noOfStudents++;
	}
	@Override
	public String toString() {
		return "myClass [srno=" + srno + ", branchid=" + branchid + "]";
	}
	public void show() {
		System.out.println(branchid);
		System.out.println(noOfStudents);
	}
	
	public static void addStudents() {
		//System.out.println(branchid);
		System.out.println(noOfStudents);
	}
	
}
