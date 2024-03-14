package com.java.ayush.daythree;

//child class
public class student extends citizen {
	private int rollno;
	private String course;
	private String collegename;
	
	//getter setter
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	
	
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, int age, long phn_no, String gender, int rollno, String course, String collegename) {
		super(name, age, phn_no, gender);
		this.rollno = rollno;
		this.course = course;
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", course=" + course + ", collegename=" + collegename + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getPhn_no()=" + getPhn_no() + ", getGender()=" + getGender()
				+ "]";
	}
	
}
	

	
	


