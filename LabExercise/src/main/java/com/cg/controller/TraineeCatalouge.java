package com.cg.controller;
import com.cg.entity.Trainees;
import com.cg.service.TraineeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trainee")
public class TraineeCatalouge {
	@Autowired
	private TraineeService TraineeCatalougeService = null;
	
	@RequestMapping
	public Trainees TraineeList(){
		Trainees t = new Trainees();
		t.setTrainees(TraineeCatalougeService.getAllTraineeService());
		return t;
	}
}
