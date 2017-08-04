package com.everis.alicante.becajava.services;

import java.util.List;

import com.everis.alicante.becajava.Vehicle;

public interface VehicleService {

void createVehicle(Vehicle vehicle);
	
	List<Vehicle> listVehicle();
	
	void updateVehicle(Vehicle vehicle);
	
	Vehicle findVehicle(Vehicle vehicle);
}
