package com.musala.drone.model.dto;


import com.musala.drone.model.enums.Model;
import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class DroneDTO {
    @Min(value = 0, message = "Please provide weight greater zero")
    private double weight;
    private Model model;
    private String serialNumber;
}
