package com.android.designpatterns;

public class TrainTicket extends Ticket {

	// Inner status
	public String from;
	public String to;

	// Outer status
	public String bunk;

	public TrainTicket(String from, String to) {
		this.from = to;
		this.to = to;
	}

	@Override
	public void showTicketInfo(String bunk) {
		System.out.println("购买 从 " + from + " 到 " + to + " 的 " + bunk + " 火车票");
	}

}
