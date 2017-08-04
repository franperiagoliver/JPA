package com.everis.alicante.becajava.DAO;

import com.everis.alicante.becajava.ParkingPlace;

public interface ParkingPlaceDAO {

	void create(ParkingPlace parkingPlace);
	
	ParkingPlace readById(int id);
	
	void update(ParkingPlace client);
	
	void delete(ParkingPlace client);
}
