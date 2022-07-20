package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainMain {
	private static String balanceAferBookingTickets;

	public static void main(String[] args)
	{
		System.out.println("Search the train");
		
		BankAccount b1 = new BankAccount();
		b1.setActNumber(999);
		b1.setActBalance(10000);
		
		Passenger p1 = new Passenger(10, "Ravi" , 30 ,b1);
		Passenger p2 = new Passenger(20, "krapaluji" , 32 ,b1);
		Passenger p3 = new Passenger(10, "paras" , 33 ,b1);
		
		List<Passenger> passengerList = new LinkedList<>();
		
		passengerList.add(p1);
		passengerList.add(p2);
		passengerList.add(p3);
		System.out.println("now bookink for 3 passenger in train number 101...");
		TrainService.booksTickets(101, passengerList);
		System.out.println("now pprint the deatils");
		TicketService.showTicketDetails(1);
		System.out.println("\n\n");
		TrainService. searchTrainsBetweenStations("Hyderabad","Bangalore", LocalDate.now().plusDays(1),10);
		
		int balanceAfterBookingTickets = b1.getActBalance();
		 
		System.out.println("Initial balance = " + intialBalance());
		System.out.println("Balance after boking " +balanceAferBookingTickets);
		
	}

	private static String intialBalance() {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
  

