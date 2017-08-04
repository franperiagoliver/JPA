package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.ParkingPlace;

public interface ParkingPlaceService {

	void createParkingPlace(ParkingPlace parkingPlace);
	
	List<ParkingPlace> listParkingPlace();
	
	void updateParkingPlace(ParkingPlace parkingPlace);
	
	ParkingPlace findParkingPlace(ParkingPlace parkingPlace);
}
