package com.cg.mts.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.mts.entities.Activity;
import com.cg.mts.entities.TicketBooking;
import com.cg.mts.repository.IActivityRepository;
import com.cg.mts.repository.ITicketBookingRepository;
import com.cg.mts.service.ITicketBookingService;

@Service
public class ITicketBookingServiceImpl implements ITicketBookingService {

	@Autowired
	private ITicketBookingRepository iTicketBookingRepository;

	@Autowired
	private IActivityRepository iActivityRepository;

	@Override
	public TicketBooking insertTicketBooking(TicketBooking ticketBooking) {
		TicketBooking ticket = iTicketBookingRepository.save(ticketBooking);
		return ticket;
	}

	@Override
	public TicketBooking updateTicketBooking(TicketBooking ticketBooking) {
		TicketBooking ticket = iTicketBookingRepository.save(ticketBooking);
		return ticket;
	}

	@Override
	public TicketBooking deleteTicketBooking(Long ticketId) {
		Optional<TicketBooking> ticket = iTicketBookingRepository.findById(ticketId);
		if (ticket.isPresent()) {
			iTicketBookingRepository.deleteById(ticketId);
			return ticket.get();
		}
		return null;
	}

	@Override
	public List<TicketBooking> viewAllTicketsCustomer(Long customerId) {
		List<TicketBooking> ticket = iTicketBookingRepository.findAll();
		return ticket;
	}

	@Override
	public Long calculateBill(Long customerId) {
		
		List<Activity> res = iActivityRepository.findAll();
		long total = 0;
		for (Activity a : res) {
			total += a.getCharges();
		}
		return total;
	}

}
