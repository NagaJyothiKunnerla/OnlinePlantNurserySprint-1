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
import com.capg.onlineplant.repository.ISeedRepository;
import com.capg.onlineplant.entity.Plant;
import com.capg.onlineplant.entity.Seed;
import com.capg.onlineplant.service.IPlantServiceImpl;
import com.capg.onlineplant.service.ISeedServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest

public class ISeedServiceTest {
	@InjectMocks
	private ISeedServiceImpl seedService;
	
	@Mock
	private ISeedRepository seedRepo;
	
	@Test
	public void addSeedTest() {
		Seed seed = new Seed();
		seed.setSeedId(1);
		when(seedRepo.addSeed(seed)).thenReturn(seed);
		assertEquals(seed,seedService.addSeed(seed));
	
	}
		
}
