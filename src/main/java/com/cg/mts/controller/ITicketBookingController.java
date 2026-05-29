package com.cg.mts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.TicketBooking;
import com.cg.mts.service.ITicketBookingService;

@RestController
@RequestMapping("/amusement/park/booking")
public class ITicketBookingController {

	@Autowired
	private ITicketBookingService iTicketBookingService;

	@PostMapping("/add")
	public ResponseEntity<TicketBooking> insertTicketBooking(@RequestBody TicketBooking ticketBooking) {
		return new ResponseEntity<>(iTicketBookingService.insertTicketBooking(ticketBooking), HttpStatus.OK);
	}

	@PutMapping("/update")
	public ResponseEntity<TicketBooking> updateTicketBooking(@RequestBody TicketBooking ticketBooking) {
		return new ResponseEntity<>(iTicketBookingService.updateTicketBooking(ticketBooking), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{ticketId}")
	public ResponseEntity<TicketBooking> deleteTicketBooking(@PathVariable Long ticketId) {
		return new ResponseEntity<>(iTicketBookingService.deleteTicketBooking(ticketId), HttpStatus.OK);
	}

	@GetMapping("/view/{customerId}")
	public ResponseEntity<List<TicketBooking>> viewAllTicketsCustomer(@PathVariable Long customerId) {
		return new ResponseEntity<>(iTicketBookingService.viewAllTicketsCustomer(customerId), HttpStatus.OK);
	}

	@GetMapping("/bill/{customerId}")
	public ResponseEntity<Long> calculateBill(@PathVariable Long customerId) {
		return new ResponseEntity<>(iTicketBookingService.calculateBill(customerId), HttpStatus.OK);
	}
}
