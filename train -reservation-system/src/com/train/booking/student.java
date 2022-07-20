package com.train.booking;

public class student {
	int id;
	String name;

	void display()
	{
		System.out.println(id + "" + name);
	}
	public static void main(String[] agrs )
	{
		student s = new student();
		student s1 = new student();
		s.display();
		s1.display();
	}
}
