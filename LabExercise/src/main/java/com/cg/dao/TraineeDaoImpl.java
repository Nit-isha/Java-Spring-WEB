package com.cg.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cg.entity.Trainee;


@Component
public class TraineeDaoImpl implements TraineeDao{
	List<Trainee> trainee = new ArrayList<>();
	{ 
		Trainee t1 = new Trainee(101, "Aman", "JEE FullStack", "Pune");
		Trainee t2 = new Trainee(102, "Ben", "React", "Mumbai");
		Trainee t3 = new Trainee(103, "Carl", "SQL", "Delhi");
		Trainee t4 = new Trainee(104, "Ajay", "Oracle", "Bangalore");
		Trainee t5 = new Trainee(105, "Ankushn", "JEE FullStack", "Chennai");
		
		trainee.add(t1); trainee.add(t2); trainee.add(t3);
		trainee.add(t4); trainee.add(t5);
	}
	
	public List<Trainee> getAllTrainee() {
		return trainee;
	}
}