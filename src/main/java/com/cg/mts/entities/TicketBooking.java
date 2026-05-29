package com.cg.mts.entities;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Ticket_Booking")
public class TicketBooking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ticket_booking_id")
	private Long ticketBookingId;

	@ManyToOne
	@JoinColumn(name = "customer_id", nullable = false)
	private Customer customer;

//	 @ManyToMany(fetch = FetchType.LAZY)
//	    @JoinTable(name = "Ticket_Booking",
//	        joinColumns = @JoinColumn(name = "ticket_booking_id"),
//	        inverseJoinColumns = @JoinColumn(name = "activity_id", nullable = false))
	@ManyToOne
	@JoinColumn(name = "activity_id", nullable = false)
	private Activity activities;

	@Column(name = "dateTime")
	private LocalDateTime dateTime;

	@Column(name = "bill")
	private Long bill;

	public Long getTicketBookingId() {
		return ticketBookingId;
	}

	public void setTicketBookingId(Long ticketBookingId) {
		this.ticketBookingId = ticketBookingId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Long getBill() {
		return bill;
	}

	public void setBill(Long bill) {
		this.bill = bill;
	}

	public Activity getActivities() {
		return activities;
	}

	public void setActivities(Activity activities) {
		this.activities = activities;
	}

}