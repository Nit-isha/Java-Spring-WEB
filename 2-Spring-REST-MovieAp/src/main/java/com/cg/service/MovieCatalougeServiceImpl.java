package com.cg.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.dao.IMovieCatalougeDao;
import com.cg.entity.Movie;

@Component
public class MovieCatalougeServiceImpl implements IMovieCatalougeService{
	@Autowired
	private IMovieCatalougeDao movieList;
	
	public void setMovieList(IMovieCatalougeDao movieList) {
		this.movieList = movieList;
	}
	
	public List<Movie> getAllMovieService() {
		return movieList.getAllMovies();
	}

}