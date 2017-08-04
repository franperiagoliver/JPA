package com.everis.alicante.becajava.test;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.DAO.BookingDAO;
import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.Impl.BookingDAOJPAImpl;
import com.everis.alicante.becajava.Impl.ClientDAOJPAImpl;
import com.everis.alicante.becajava.Impl.VehicleDAOJPAImpl;
import com.everis.alicante.becajava.services.ClientService;
import com.everis.alicante.becajava.services.impl.ClientServiceImpl;

public class Test {

	public static void main(String[] args) {
	
		EntityManager em = createEntityManager();
		
//		ClientService service = new ClientServiceImpl(clientDAO, vehicleDAO, bookingDAO, parkingPlaceDAO)
		
		ClientDAO clientDAO = new ClientDAOJPAImpl(em);
		VehicleDAO vehicleDAO = new VehicleDAOJPAImpl(em);
		BookingDAO bookingDAO = new BookingDAOJPAImpl(em);
		
		//Crear un cliente
		Client client = new Client();
		
		client.setName("Pepito");
		client.setSurname("Palotes");
		client.setNif("48717958W");
		client.setPhoneNumber("699111201");
		
//		Listar todos
		System.out.println(clientDAO.listAllClients());
		System.out.println(vehicleDAO.listAllVehicles());
		System.out.println(bookingDAO.listAllBooking());
	}
	
	static EntityManager createEntityManager() {
		
		return Persistence.createEntityManagerFactory("JPA_TEST").createEntityManager();
	}
}
