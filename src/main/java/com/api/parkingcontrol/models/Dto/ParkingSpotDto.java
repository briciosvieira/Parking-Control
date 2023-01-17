package com.api.parkingcontrol.models.Dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank @Size(max = 7)
    private String licencePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsableName;
    @NotBlank
    private String apartament;
    @NotBlank
    private String block;
}
