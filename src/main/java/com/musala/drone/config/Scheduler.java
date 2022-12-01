package com.musala.drone.config;

import com.musala.drone.service.DroneHistoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class Scheduler {

    private final DroneHistoryService droneHistoryService;

    @Scheduled(cron = "0 0 */2 * * ?")
    private void recordHistory(){
        droneHistoryService.recordHistory();
    }
}
