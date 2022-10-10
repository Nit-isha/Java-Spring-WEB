package com.cg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.TraineeDao;
import com.cg.entity.Trainee;

@Component
public class TraineeServiceImpl implements TraineeService{
	@Autowired
	private TraineeDao traineeList;
	
	public void setTraineeList(TraineeDao traineeList) {
		this.traineeList = traineeList;
	}
	
	public List<Trainee> getAllTraineeService() {
		return traineeList.getAllTrainee();
	}

}