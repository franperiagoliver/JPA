package com.everis.alicante.becajava.Impl;

import javax.persistence.EntityManager;

import com.everis.alicante.becajava.ParkingPlace;
import com.everis.alicante.becajava.DAO.ParkingPlaceDAO;

public class ParkingPlaceDAOJPAImpl implements ParkingPlaceDAO{

	EntityManager em;
	
	public ParkingPlaceDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(ParkingPlace parkingPlace) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ParkingPlace readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(ParkingPlace client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ParkingPlace client) {
		// TODO Auto-generated method stub
		
	}

}
