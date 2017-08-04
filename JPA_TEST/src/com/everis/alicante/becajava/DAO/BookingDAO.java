package com.everis.alicante.becajava.DAO;

import java.util.List;

import com.everis.alicante.becajava.Booking;

public interface BookingDAO {

	void create(Booking booking);
	
	Booking readById(String id);
	
	void update(Booking booking);
	
	void delete(Booking booking);
	
	List<Booking> listAllBooking();
}
