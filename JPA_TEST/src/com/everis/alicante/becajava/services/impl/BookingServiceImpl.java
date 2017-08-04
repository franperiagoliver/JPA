package com.everis.alicante.becajava.services.impl;

import java.util.List;

import com.everis.alicante.becajava.Booking;
import com.everis.alicante.becajava.DAO.BookingDAO;
import com.everis.alicante.becajava.services.BookingService;

public class BookingServiceImpl implements BookingService{

	BookingDAO bookingDAO;
	
	@Override
	public void createBooking(Booking booking) {
		// TODO Auto-generated method stub
		bookingDAO.create(booking);
	}

	@Override
	public List<Booking> listBooking() {
		// TODO Auto-generated method stub
		return bookingDAO.listAllBooking();
	}

	@Override
	public void updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking findBooking(String nif) {
		// TODO Auto-generated method stub
		return bookingDAO.readById(nif);
	}

	public BookingDAO getBookingDAO() {
		return bookingDAO;
	}

	public void setBookingDAO(BookingDAO bookingDAO) {
		this.bookingDAO = bookingDAO;
	}

}
