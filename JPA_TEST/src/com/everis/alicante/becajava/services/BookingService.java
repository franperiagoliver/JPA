package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Booking;

public interface BookingService {

	void createBooking(Booking booking);
	
	List<Booking> listBooking();
	
	void updateBooking(Booking booking);
	
	Booking findBooking(String nif);
}
