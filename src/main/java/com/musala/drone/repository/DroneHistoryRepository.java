package com.musala.drone.repository;

import com.musala.drone.model.DroneHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DroneHistoryRepository extends MongoRepository<DroneHistory, String> {
    Page<DroneHistory> findAllBySerialNumber(String filter, Pageable pageable);
}
