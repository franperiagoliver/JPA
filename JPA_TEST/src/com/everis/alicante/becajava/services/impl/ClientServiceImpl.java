package com.everis.alicante.becajava.services.impl;

import java.util.List;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.Vehicle;
import com.everis.alicante.becajava.DAO.BookingDAO;
import com.everis.alicante.becajava.DAO.ClientDAO;
import com.everis.alicante.becajava.DAO.ParkingPlaceDAO;
import com.everis.alicante.becajava.DAO.VehicleDAO;
import com.everis.alicante.becajava.services.ClientService;

public class ClientServiceImpl implements ClientService{

	private ClientDAO clientDAO;
	private VehicleDAO vehicleDAO;
	private BookingDAO bookingDAO;
	private ParkingPlaceDAO parkingPlaceDAO;
	
	public ClientServiceImpl(ClientDAO clientDAO, VehicleDAO vehicleDAO, BookingDAO bookingDAO,
			ParkingPlaceDAO parkingPlaceDAO) {
		super();
		this.clientDAO = clientDAO;
		this.vehicleDAO = vehicleDAO;
		this.bookingDAO = bookingDAO;
		this.parkingPlaceDAO = parkingPlaceDAO;
	}
	@Override
	public void createClient(Client client, Vehicle vehicle) {
		clientDAO.create(client);
		vehicleDAO.create(vehicle);
	}

	@Override
	public List<Client> listClients() {
		return clientDAO.listAllClients();
	}

	@Override
	public void updateClient(Client client) {
		clientDAO.update(client);
	}

	@Override
	public Client findClient(Client client) {
		// TODO Auto-generated method stub
		return clientDAO.readById(client.getIdClient());
	}

}
