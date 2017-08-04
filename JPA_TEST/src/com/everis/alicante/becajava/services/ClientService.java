package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Client;
//WEBSERVICE
public interface ClientService {

	void createClient(Client client);
		
	List<Client> listClients();
	
	void updateClient(Client client);
	
	Client findClient(Client client);
}
