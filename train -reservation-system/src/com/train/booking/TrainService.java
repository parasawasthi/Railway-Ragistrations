package com.train.booking;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TrainService {
private static List<train> allTrains = new LinkedList<>();

 static{
	 allTrains.add(new train(101,"train-one", "Hyderabad","Bangalore",100,800,LocalDate.now()));
	 allTrains.add(new train(102,"train-two", "Bangalore","Hyderabad",100,800,LocalDate.now()));
	 allTrains.add(new train(103,"train-three", "Hyderabad","Bangalore",80,600,LocalDate.now()));
	 allTrains.add(new train(104,"train-four", "Bangalore","Hyderabad",80,600,LocalDate.now()));
	 allTrains.add(new train(105,"train-five", "Hyderabad","Chennai",100,900,LocalDate.now()));
	 allTrains.add(new train(106,"train-six", "Chennai","Hyderabad",100,900,LocalDate.now()));
	 
 }
 public TrainService(){
	 super();
 }
 public static train FindTrain(int trainNumber)
 {
	 train temp = null;
	 for(train t : allTrains){
		 if(t.getTrainNumber()==trainNumber){
			 temp = t;
			 break;
		 }
		 
	 }
	 return temp;
	 
 }
 public static void searchTrainsBetweenStations(String FromStation, String tostation, LocalDate doj, int numofSeats)
 {
	 List<train> searchTrainList=new LinkedList<>();
	 for(train t : allTrains){
		 if(t . getFormStation().equals(FromStation)&&
				 t.getToStation().equals(tostation)&&
				 t.getDoj().equals(doj)&&
				 t.getSeatAvailable()>numofSeats){
			 searchTrainList.add(t);
			 
		 }
				
	 }
	 if(searchTrainList.size()==0)
	 {
		 System.out.println("sorry, no matching trains available for the search criteria..");
	 } else{
		 
	 
	 System.out.println("Tr.no\t train Name\tfrom Station\tTo Station\tDoj\tSeats  Available\tFare");
	 System.out.println();
	 for(train t : searchTrainList){
		 System.out.printf("%4d%20s%15s%15s%12s%4d%5d\n",t.getTrainNumber(),t.getTrainName(),t.getFormStation(),t.getToStation(),t.getDoj(),t.getSeatAvailable(),t.getFare());
	 }
 }
}
 public static void booksTickets(int trainNumber, List<Passenger> passengerList){
	 // step 1 we need to subract the train fare for all passengers together from he bank account object
	 int numofSeats = passengerList.size();
	 /*Passenger tempPassenger = passengerList.get(0);
	 BankAccount account = tempPassenger.getBankAccount(); */
	 BankAccount account = passengerList.get(0).getBankAccount();
	 train tempTrain = FindTrain(trainNumber); 
	 int fare = tempTrain.getFare();
	 int totalFare = fare * numofSeats;
	 
	 account.withdraw(totalFare);
	
	 
	 // step 2 we need to subreact the number of tickests that are being booked from the actual avilable no of tickets
	 tempTrain.setSeatsAvailable(tempTrain.getSeatAvailable()-numofSeats);
	 // step 3 we need to add one entry (one records) into tickets database
	 
	 TicketService.addNewTicket(trainNumber, passengerList);
 }
 }
