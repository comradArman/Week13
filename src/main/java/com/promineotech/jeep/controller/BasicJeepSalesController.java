package com.promineotech.jeep.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RestController;

import com.promineotech.jeep.entity.Jeep;
import com.promineotech.jeep.entity.JeepModel;


import lombok.extern.slf4j.Slf4j;




@RestController
@Slf4j 
public class BasicJeepSalesController implements JeepSalesController {

	@Override
	public List<Jeep> fetchJeeps(JeepModel model, String trim) {
		
		//Log.info("model={}, trim={}", model, trim);
		log.info();
		
		
	
		
		return null;
	}

}
