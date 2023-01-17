package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// criar interface e depois essa classe implementar a interface
@Service
public class ParkingSportService {



    final ParkingSpotRepository parkingSpotRepository;

    @Autowired
    public ParkingSportService( ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    public Object save(ParkingSpotModel parkingSportModel) {
        return parkingSpotRepository.save(parkingSportModel);
    }
}
