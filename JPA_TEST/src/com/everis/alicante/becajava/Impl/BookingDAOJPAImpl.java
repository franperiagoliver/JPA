package com.everis.alicante.becajava.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.Booking;
import com.everis.alicante.becajava.DAO.BookingDAO;

public class BookingDAOJPAImpl implements BookingDAO{

	EntityManager em;
	
	public BookingDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Booking readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Booking booking) {
		// TODO Auto-generated method stub
		
	}

	public List<Booking> listAllBooking() {
		
		Query query = em.createNamedQuery("Booking.findAll");	
		return query.getResultList();
	}

}
