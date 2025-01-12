package com.jeevankumar.spring_boot_actuator.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor
public class User {

    private String id = "id_123";
    private String name = "Jeevan Kumar";
    private String password = "jeevan123";
    private Integer age = 29;
    private Double salary = 96000.00;
}
