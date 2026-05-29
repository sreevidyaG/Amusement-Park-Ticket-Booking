package com.cg.mts.service;

import java.util.List;

import com.cg.mts.entities.TicketBooking;

public interface ITicketBookingService {
	public TicketBooking insertTicketBooking(TicketBooking ticketBooking);

	public TicketBooking updateTicketBooking(TicketBooking ticketBooking);

	public TicketBooking deleteTicketBooking(Long ticketId);

	public List<TicketBooking> viewAllTicketsCustomer(Long customerId);

	public Long calculateBill(Long customerId);
	
}
