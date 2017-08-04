package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Booking;
import com.everis.alicante.becajava.DAO.BookingDAO;

public interface BookingService {

	void createBooking(Booking booking);
	
	List<Booking> listBooking();
	
	void updateBooking(Booking booking);
	
	Booking findBooking(String nif);
	
	BookingDAO getBookingDAO();
	
	void setBookingDAO(BookingDAO bookingDAO);
}
