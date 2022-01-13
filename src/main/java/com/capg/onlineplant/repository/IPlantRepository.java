package com.capg.onlineplant.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;
import com.capg.onlineplant.entity.Plant;

@Repository
public interface IPlantRepository  {
    List<Plant> viewAllPlants();
    Plant viewPlant(String commonName);
	Plant findBycommonName(String commonName);
	List<Plant> findBytypeOfPlant(String typeOfPlant);
	Plant addPlant(Plant plant);
	Plant updatePlant(Plant plant);
	Plant removePlant(Plant plant);
	
}
