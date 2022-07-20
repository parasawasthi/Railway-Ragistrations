package com.train.booking;
import java.util.List;

public class Ticket {
	private int pnr;
	private train bookedTrain;
	private List<Passenger> passengerList;
	public Ticket() {
		super();
	}
	public Ticket(int pnr, train bookedTrain, List<Passenger> passengerList) {
		super();
		this.pnr = pnr;
		this.bookedTrain = bookedTrain;
		this.passengerList = passengerList;
	}
	public int getPnr() {
		return pnr;
	}
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	public train getBookedTrain() {
		return bookedTrain;
	}
	public void setBookedTrain(train bookedTrain) {
		this.bookedTrain = bookedTrain;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	} 
	
	
	

}
