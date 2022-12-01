package com.musala.drone.service;

import com.musala.drone.dto.DroneDTO;
import com.musala.drone.dto.MedicationListDTO;
import com.musala.drone.enums.Status;
import com.musala.drone.model.Drone;
import com.musala.drone.model.Medication;

import java.util.List;

public interface DroneService {

    List<Drone> fetchAllDrones();
    Drone registerDrone(DroneDTO droneDTO);
    Drone fetchDroneById(String droneId);
    List<Medication> fetchDroneMedicationsWithId(String droneId);
    List<Drone> availableDroneForLoading();
    Drone updateBatteryLevel(String drone, int batteryLevel);
    Drone loadDrone(String drone, MedicationListDTO medicationList);
    Drone updateStatus(String droneId, Status status);

}
