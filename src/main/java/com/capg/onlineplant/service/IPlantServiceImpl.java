package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlineplant.repository.IPlantRepository;
import com.capg.onlineplant.entity.Plant;
/*
 * Author : Sumanjali
 * Version : 1.0
 * Date : 
 * Description : This is Plant Service
*/
@Transactional
@Service
public class IPlantServiceImpl implements IPlantService{
	
	@Autowired
	private IPlantRepository plantRepo;
	 /************************************************************************************
		 * Method: view plant by type of plant
		 * Description: It is used to view into plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public List<Plant> findBytypeOfPlant(String typeOfPlant) {
		return plantRepo.findBytypeOfPlant(typeOfPlant);
	
	} /************************************************************************************
	 * Method: viewAllPlants
	 * Description: It is used to view into plant table
	 * @param : plant reference variable.
	 * @returns  It returns plant with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Sumanjali
     * Created Date -
	 * 
	 ************************************************************************************/

	@Override
	public List<Plant> viewAllPlants() {
		return plantRepo.viewAllPlants();
	}

//	@Override
//	public Optional<Plant> viewPlant(String commonName) {
//		return plantRepo.findByName();}
	 /************************************************************************************
		 * Method: view by commonname
		 * Description: It is used to view into plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/	
	@Override
	public Plant findBycommonName(String commonName) {
		return plantRepo.findBycommonName(commonName);
	}

	 /************************************************************************************
		 * Method: addPlant
		 * Description: It is used to add into plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Plant addPlant(Plant plant) {
		Plant addplant = new Plant();
		addplant.setBloomTime(plant.getBloomTime());
		addplant.setCommonName(plant.getCommonName());
		addplant.setPlantCost(plant.getPlantCost());
		addplant.setPlantDescription(plant.getPlantDescription());
		addplant.setDifficultyLevel(plant.getDifficultyLevel());
		addplant.setPlantHeight(plant.getPlantHeight());
		addplant.setMedicinalOrCulinaryUse(plant.getMedicinalOrCulinaryUse());
		addplant.setPlantSpread(plant.getPlantSpread());
		addplant.setPlantStock(plant.getPlantStock());
		addplant.setTemperature(plant.getTemperature());
		addplant.setTypeOfPlant(plant.getTypeOfPlant());
		return plantRepo.addPlant(plant);
	}
	 /************************************************************************************
		 * Method: updateplant
		 * Description: It is used to update into plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Plant updatePlant(Plant plant) {
			return plantRepo.updatePlant(plant);

		}
	 /************************************************************************************
		 * Method: removePlant
		 * Description: It is used to remove from plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Plant removePlant(Plant plant) {
		return plantRepo.removePlant(plant);
	}
	 /************************************************************************************
		 * Method: view plant by commonname
		 * Description: It is used to view into plant table
		 * @param : plant reference variable.
		 * @returns  It returns plant  with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Plant viewPlant(String commonName) {
		return plantRepo.viewPlant(commonName);
	}

	}



