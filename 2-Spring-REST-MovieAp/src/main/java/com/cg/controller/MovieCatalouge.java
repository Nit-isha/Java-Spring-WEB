package com.cg.controller;
import com.cg.entity.Movie;
import com.cg.service.IMovieCatalougeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/movies")
public class MovieCatalouge {
	@Autowired
	private IMovieCatalougeService movieCatalougeService;
	
	@RequestMapping(value = "/test", produces = "application/json")
	public @ResponseBody Movie test() {
		return new Movie("A234","Sample name","English", "Action");
	}
	
	@RequestMapping
	public @ResponseBody List<Movie> movieList(){
		System.out.println("all movies ......");
		//invoke service
		return movieCatalougeService.getAllMovieService();
		
	}
}
