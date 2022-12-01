package com.musala.drone.service.implementation;

import com.musala.drone.model.DroneHistory;
import com.musala.drone.repository.DroneHistoryRepository;
import com.musala.drone.repository.DroneRepository;
import com.musala.drone.service.DroneHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

@Service
public class DroneHistoryServiceImpl implements DroneHistoryService {

    @Autowired
    private DroneRepository droneRepository;

    @Autowired
    private DroneHistoryRepository droneHistoryRepository;

    @Override
    public void recordHistory() {
        droneRepository.findAll()
                .forEach( drone -> {
                    DroneHistory history = DroneHistory.builder()
                            .serialNumber(drone.getSerialNumber())
                            .batteryLevel(drone.getBatteryPercentage())
                            .build();

                    droneHistoryRepository.save(history);
                });
    }

    @Override
    public Page<DroneHistory> fetchAllHistory(int page, int size, String filterBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(Direction.DESC, "id"));
        if(filterBy != null) return droneHistoryRepository.findAllBySerialNumber(filterBy, pageable);
        return droneHistoryRepository.findAll(pageable);
    }
}
