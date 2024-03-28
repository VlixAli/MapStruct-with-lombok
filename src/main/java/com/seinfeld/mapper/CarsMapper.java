package com.seinfeld.mapper;

import com.seinfeld.dto.CarDTO;
import com.seinfeld.dto.FuelType;
import com.seinfeld.entity.BioDieselCar;
import com.seinfeld.entity.Car;
import com.seinfeld.entity.ElectricCar;
import org.mapstruct.AfterMapping;
import org.mapstruct.BeforeMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper
public abstract class CarsMapper {
    @BeforeMapping
    protected void enrichDTOWithFuelType(Car car, @MappingTarget CarDTO carDTO){
        if (car instanceof ElectricCar){
            carDTO.setFuelType(FuelType.ELECTRIC);
        }
        if (car instanceof BioDieselCar){
            carDTO.setFuelType(FuelType.BIO_DIESEL);
        }
    }

    @AfterMapping
    protected void convertNameToUpperCase(@MappingTarget CarDTO carDTO){
        carDTO.setName(carDTO.getName().toUpperCase());
    }

    public abstract CarDTO toCarDto(Car car);
}
