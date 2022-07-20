package com.train.booking;

public class studentpra {
	int id;
	String name;
	
	studentpra(int i, String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println(id+"System.out.println"+name);
	}
	
	public static void main(String[] args)
	{
		studentpra sr = new studentpra(13,"parasawaasthi");
		studentpra sr2 = new studentpra(18,"krapaluji");
		
		sr.display();
	}
	
	

}
