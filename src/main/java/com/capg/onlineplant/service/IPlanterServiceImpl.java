package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlineplant.repository.IPlanterRepository;
import com.capg.onlineplant.entity.Planter;
/*
* Author : NagaJyothi and Sumanjali
* Version : 1.0
* Date : 
* Description : This is planter Service
*/
@Transactional
@Service
public class IPlanterServiceImpl implements IPlanterService{
	
	@Autowired
	private IPlanterRepository planterRepo;
	 /************************************************************************************
	 * Method: viewAllPlanters
	 * Description: It is used to view into planter table
	 * @param : planter reference variable.
	 * @returns  It returns planter with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi and Sumanjali
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public List<Planter> viewAllPlanters() {
		return planterRepo.viewAllPlanters();
	}
	 /************************************************************************************
	 * Method: view planter
	 * Description: It is used to view into planter table
	 * @param : planter reference variable.
	 * @returns  It returns planter with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi and Sumanjali
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Planter viewPlanter(int planterId) {
		return planterRepo.viewPlanter(planterId);
	}

	 /************************************************************************************
		 * Method: addPlanter
		 * Description: It is used to add into planter table
		 * @param : planter reference variable.
		 * @returns  It returns cart with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-NagaJyothi and Sumanjali
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Planter addPlanter(Planter planter) {
		Planter addplanter = new Planter();
		addplanter.setPlanterheight(planter.getPlanterheight());
		addplanter.setPlanterCapacity(planter.getPlanterCapacity());
		addplanter.setPlanterCost(planter.getPlanterCost());
		addplanter.setPlanterColor(planter.getPlanterColor());
		addplanter.setDrinageHoles(planter.getDrinageHoles());
		addplanter.setPlanterShape(planter.getPlanterShape());
		addplanter.setPlanterStock(planter.getPlanterStock());
		return planterRepo.addPlanter(planter);
	}
	 /************************************************************************************
	 * Method: updatePlanter
	 * Description: It is used to update into Planter table
	 * @param : planter reference variable.
	 * @returns  It returns planter with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi and Sumanjali
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Planter updatePlanter(Planter planter) {
			return planterRepo.updatePlanter(planter);

		}
	 /************************************************************************************
	 * Method: removePlanter
	 * Description: It is used to remove from Planter table
	 * @param : Planter reference variable.
	 * @returns  It returns Planter with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi and Sumanjali
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Planter removePlanter(Planter planter) {
		return planterRepo.removePlanter(planter);
	}
	 /************************************************************************************
	 * Method: view Planter by planterShape
	 * Description: It is used to view into Planter table
	 * @param : Planter reference variable.
	 * @returns  It returns Planter with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Planter viewPlanter(String planterShape) {
		return planterRepo.viewPlanter(planterShape);
	}
}
