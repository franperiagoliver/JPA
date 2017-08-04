package com.everis.alicante.becajava.DAO;

import java.util.List;

import com.everis.alicante.becajava.Vehicle;

public interface VehicleDAO {

	void create(Vehicle vehicle);
	
	Vehicle readById(int id);
	
	void update(Vehicle vehicle);
	
	void delete(Vehicle vehicle);
	
	List<Vehicle> listAllVehicles();
}
