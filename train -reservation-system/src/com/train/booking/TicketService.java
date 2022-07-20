package com.train.booking;
import java.util.LinkedList;
import java.util.List;

public class TicketService {
	private static List<Ticket> allTickets = new LinkedList<>();
	private static train tempTrain;
	
	
	
	public static void addNewTicket(int pnr, List<Passenger> passengerList)
	{
		int pnr1 = allTickets.size()+1;
		train bookedTrain = TrainService.FindTrain(pnr);
		
		allTickets.add(new Ticket(pnr1, extracted(bookedTrain), passengerList));
			System.out.println("Ticked booked successful");	
		
	}
public static void showTicketDetails(int pnr){
	Ticket tempTicket= null;
	for(Ticket T : allTickets)
	{
		if(T.getPnr()==pnr){
			tempTicket = T;
			break;
		}
	}
	train.tempTrain2 = tempTicket.getBookedTrain();
	List<Passenger> passengerList = tempTicket.getPassengerList();
	
	int totalFare = tempTrain.getFare() * passengerList.size();
	System.out.println("***** YOUR BOOKING DEATAILS *****");
	System.out.println("PNR-> " + tempTicket.getPnr() + "Tr.NO " + tempTicket.getBookedTrain().getTrainNumber());
	   
	System.out.println("Train Name :" +tempTrain.getTrainName());
	train temptrain = null;
	System.out.println("from station" +tempTrain.getFormStation()+ "to station " + extracted(temptrain).getToStation());
	System.out.println("DOJ"+extracted(temptrain).getDoj() + "fare" + extracted(temptrain).getFare() + "total fare" + totalFare);
	System.out.println("paddenger info below\n");
	System.out.println("passname     age");
	for(Passenger p : passengerList){
		System.out.println(p.getPassengerName()+"\t"+p.getAge());
	}
	System.out.println(" ********************* ");
	
}
private static train extracted(train temptrain) {
	return temptrain;
}
}
