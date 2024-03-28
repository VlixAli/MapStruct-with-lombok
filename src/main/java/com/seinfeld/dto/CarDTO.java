package com.seinfeld.dto;

import lombok.Data;

@Data
public class CarDTO {
    private int id;
    private String name;
    private FuelType fuelType;
}
