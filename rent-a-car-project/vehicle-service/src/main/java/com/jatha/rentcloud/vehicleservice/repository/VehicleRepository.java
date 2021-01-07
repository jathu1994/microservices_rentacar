package com.jatha.rentcloud.vehicleservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jatha.rentcloud.commons.model.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle,Integer>{

}
