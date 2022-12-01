package com.musala.drone.dto;


import lombok.Data;

import javax.validation.Valid;
import java.util.List;


@Data
public class MedicationListDTO {
    List<@Valid MedicationDTO> medicationList;
}
