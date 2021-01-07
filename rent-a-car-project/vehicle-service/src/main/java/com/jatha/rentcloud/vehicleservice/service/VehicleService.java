package com.jatha.rentcloud.vehicleservice.service;

import java.util.List;
import java.util.Optional;

import com.jatha.rentcloud.commons.model.Vehicle;

public interface VehicleService {
	
	Vehicle save(Vehicle vehicle);
	List<Vehicle> findAll();
	Optional<Vehicle> findById(int id);

}
