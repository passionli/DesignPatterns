package com.android.designpatterns;

public class Client {

	public static void main(String[] args) {
		Ticket ticket1 = TicketFactory.getTicket("Beijing", "Shanghai");
		ticket1.showTicketInfo("Up");
		Ticket ticket2 = TicketFactory.getTicket("Beijing", "Shanghai");
		ticket2.showTicketInfo("Middle");
		Ticket ticket3 = TicketFactory.getTicket("Beijing", "Shanghai");
		ticket3.showTicketInfo("Down");
	}
}
