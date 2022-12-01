package com.musala.drone.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document
@AllArgsConstructor
@Data
@NoArgsConstructor
@Builder
public class DroneHistory {
    @Id
    private String id;
    private String serialNumber;
    private Integer batteryLevel;

    @CreatedDate
    private Instant createdDate;
}
