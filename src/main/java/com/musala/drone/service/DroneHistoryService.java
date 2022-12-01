package com.musala.drone.service;

import com.musala.drone.model.DroneHistory;
import org.springframework.data.domain.Page;

public interface DroneHistoryService {
    void recordHistory();
    Page<DroneHistory> fetchAllHistory(int page, int size, String filterBy);

}
