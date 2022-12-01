package com.musala.drone.utils;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class AppResponse {
    private String message;
    private Object data;
    @Builder.Default
    private boolean status = true;
    @Builder.Default
    private LocalDateTime timestamp = LocalDateTime.now();
}
