package com.api.parkingcontrol.controllers;


import com.api.parkingcontrol.models.Dto.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.services.ParkingSportService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSportService parkingSportService;

    @Autowired
    public ParkingSpotController(ParkingSportService parkingSportService) {
        this.parkingSportService = parkingSportService;
    }

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot (@RequestBody @Valid ParkingSpotDto parkingSpotDto){
        var parkingSportModel = new ParkingSpotModel();
        BeanUtils.copyProperties(parkingSpotDto, parkingSportModel);
        parkingSportModel.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSportService.save(parkingSportModel));

    }

}
