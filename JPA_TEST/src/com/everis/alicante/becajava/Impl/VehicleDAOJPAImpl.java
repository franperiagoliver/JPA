package com.everis.alicante.becajava.Impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.everis.alicante.becajava.Vehicle;
import com.everis.alicante.becajava.DAO.VehicleDAO;

public class VehicleDAOJPAImpl implements VehicleDAO{

	EntityManager em;
	
	public VehicleDAOJPAImpl(EntityManager em) {
		super();
		this.em = em;
	}

	@Override
	public void create(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehicle readById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Vehicle vehicle) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Vehicle> listAllVehicles() {
		
		Query query = em.createNamedQuery("Vehicles.findAll");
		return query.getResultList();
	}

}
