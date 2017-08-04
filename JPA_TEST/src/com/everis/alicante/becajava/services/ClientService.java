package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Client;
import com.everis.alicante.becajava.Vehicle;
//WEBSERVICE
public interface ClientService {

	void createClient(Client client, Vehicle vehicle);
		
	List<Client> listClients();
	
	void updateClient(Client client);
	
	Client findClient(Client client);
}
