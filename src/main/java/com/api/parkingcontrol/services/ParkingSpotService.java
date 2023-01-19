package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import com.api.parkingcontrol.repository.ParkingSpotRepository;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ParkingSpotService {
    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }


    @Transactional
    public Object save(ParkingSpotModel parkingSportModel) {
        return parkingSpotRepository.save(parkingSportModel);
    }


    public boolean existsByLicensePlateCar(String licencePlateCar) {
        return parkingSpotRepository.existsByLicensePlateCar(licencePlateCar);
    }

    public boolean existsByParkingSpotNumber(String parkingSpotNumber) {
        return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }

    public boolean existsByApartamentAndBlock(String apartament, String block) {
        return parkingSpotRepository.existsByApartamentAndBlock(apartament,block);
    }

    public List<ParkingSpotModel> findAll(){
        return parkingSpotRepository.findAll();
    }
}
