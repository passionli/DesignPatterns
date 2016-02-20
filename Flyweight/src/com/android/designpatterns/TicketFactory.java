package com.android.designpatterns;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TicketFactory {
	// Cache
	static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<String, Ticket>();

	public static Ticket getTicket(String from, String to) {
		// key is based on inner status
		String key = from + "-" + to;
		if (sTicketMap.containsKey(key)) {
			System.out.println("get ticket form cache :" + key);
			return sTicketMap.get(key);
		} else {
			System.out.println("new ticket :" + key);
			Ticket ticket = new TrainTicket(from, to);
			sTicketMap.put(key, ticket);
			return ticket;
		}
	}
}
