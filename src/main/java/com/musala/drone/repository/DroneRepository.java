package com.musala.drone.repository;

import com.musala.drone.enums.Status;
import com.musala.drone.model.Drone;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DroneRepository extends MongoRepository<Drone, String> {
    boolean existsBySerialNumber(String serialNumber);
    @Query("{ $or: [ { 'serialNumber': ?0  }, { 'id':  ?0 } ] }")
    Optional<Drone> findByDroneId(String serialNumber);
    List<Drone> findDronesByStatus(Status status);
}
