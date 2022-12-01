package com.musala.drone.dto;


import com.musala.drone.enums.Model;
import com.musala.drone.enums.State;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
public class DroneDTO {
    @Min(value = 0, message = "Please provide weight greater zero")
    @Max(value = 500, message = "Drone's max weight is 500gr")
    private double weight;
    private Model model;
    private String serialNumber;
    private Integer batteryCapacity;
    private State state;
}
