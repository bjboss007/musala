package com.musala.drone.dto;


import com.musala.drone.enums.Model;
import jakarta.validation.constraints.Min;
import lombok.Data;

@Data
public class DroneDTO {
    @Min(value = 0, message = "Please provide weight greater zero")
    private double weight;
    private Model model;
    private String serialNumber;
}
