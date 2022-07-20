package com.train.booking;

import java.time.LocalDate;

public class train {
	public static train tempTrain;
	public static train tempTrain2;
	private int trainNumber;
	private String trainName;
	private String formStation;
	private String toStation;
	private int seatAvailable;
	private int fare;
	private LocalDate doj;
	public train() {
		super();
		// TODO Auto-generated constructor stub
	}
	public train(int trainNumber, String trainName, String formStation, String toStation, int seatAvailable, int fare,
			LocalDate doj) {
		super();
		this.trainNumber = trainNumber;
		this.trainName = trainName;
		this.formStation = formStation;
		this.toStation = toStation;
		this.seatAvailable = seatAvailable;
		this.fare = fare;
		this.doj = doj;
	}
	public int getTrainNumber() {
		return trainNumber;
	}
	public String getTrainName() {
		return trainName;
	}
	public String getFormStation() {
		return formStation;
	}
	public  String getToStation() {
		return toStation;
	}
	public int getSeatAvailable() {
		return seatAvailable;
	}
	public int getFare() {
		return fare;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setSeatsAvailable(int i) {
		// TODO Auto-generated method stub
		
	}

	
	
	
	 
	

}
