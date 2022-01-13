package com.capg.onlineplant.service;

import static org.junit.jupiter.api.Assertions.assertEquals;


import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlineplant.repository.IPlantRepository;
import com.capg.onlineplant.entity.Plant;
import com.capg.onlineplant.service.IPlantServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest

public class IPlantServiceTest {
	@InjectMocks
	private IPlantServiceImpl plantService;
	
	@Mock
	private IPlantRepository plantRepo;
	
	@Test
	public void addPlantTest() {
		Plant plant = new Plant();
		plant.setPlantId(1);
		when(plantRepo.addPlant(plant)).thenReturn(plant);
		assertEquals(plant,plantService.addPlant(plant));
		
	}
		
}
