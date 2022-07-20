package com.train.booking;

public class consoverloding {
	int id;
	String name;
	int age;
	
	consoverloding(int i, String n)
	{
		id=i;
		name=n;
	}
	
	consoverloding(int i, String n, int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+name+age);
	}
	
	public static void main(String[] args)
	{
		consoverloding c1 = new consoverloding(28,"krapaluji");
		consoverloding c2 = new consoverloding(28,"radhakrishna",24);
		c1.display();
		c2.display();
	}

}
