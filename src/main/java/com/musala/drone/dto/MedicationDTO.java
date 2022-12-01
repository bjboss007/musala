package com.musala.drone.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class MedicationDTO {
    @NotEmpty(message = "Please provide a name")
    private String name;
    @NotNull(message = "Please provide a weight")
    private double weight;
    private String code;
    private String image;
}
