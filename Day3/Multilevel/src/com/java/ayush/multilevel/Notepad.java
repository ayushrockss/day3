package com.java.ayush.multilevel;

//parent class
public class Notepad {
	protected String content;

	public Notepad() {
		
		this.content = " ";
	}
	
	public void write(String text)
	{
		content+=text;
	}
	public void displayData()

	{
		System.out.println("Notepad content "+content);
	}
}
