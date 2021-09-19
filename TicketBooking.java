package com.xworkz.methods;

public class TicketBooking {
	
	public static String ticketInformation(String ticketId) {
		
		String ticket = "ticket  Id number is " + ticketId
				+ "\nshow class is Balcany" + " , timimgs is morning show";
		return ticket;
	}

	public static void main(String[] args) {
		String Information=TicketBooking.ticketInformation("G123");
		System.out.println(Information);
	}

}
