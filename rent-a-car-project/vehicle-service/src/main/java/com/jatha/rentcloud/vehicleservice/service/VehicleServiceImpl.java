package com.jatha.rentcloud.vehicleservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jatha.rentcloud.commons.model.Vehicle;
import com.jatha.rentcloud.vehicleservice.repository.VehicleRepository;

@Service
public class VehicleServiceImpl implements VehicleService
{
	@Autowired
	VehicleRepository vehicleRepository;

	@Override
	public Vehicle save(Vehicle vehicle) {
		// TODO Auto-generated method stub
		return vehicleRepository.save(vehicle);
	}

	@Override
	public List<Vehicle> findAll() {
		// TODO Auto-generated method stub
		return vehicleRepository.findAll();
	}

	@Override
	public Optional<Vehicle> findById(int id) {
		// TODO Auto-generated method stub
		return vehicleRepository.findById(id);
	}

}
