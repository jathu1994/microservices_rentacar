package com.jatha.rentcloud.vehicleservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jatha.rentcloud.commons.model.Vehicle;
import com.jatha.rentcloud.vehicleservice.service.VehicleServiceImpl;

@RestController
@RequestMapping(value = "/services")
public class VehicleController {

	@Autowired
	VehicleServiceImpl vehicleServiceImpl;

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public Vehicle save(@RequestBody Vehicle vehicle) {

		return vehicleServiceImpl.save(vehicle);

	}

	@RequestMapping(value = "/vehicle", method = RequestMethod.GET)
	public List<Vehicle> findAll() {

		return vehicleServiceImpl.findAll();

	}

	@RequestMapping(value = "/vehicle/{id}", method = RequestMethod.GET)
	public Optional<Vehicle> findById(@PathVariable(value = "id") int id) {

		return vehicleServiceImpl.findById(id);

	}

}
