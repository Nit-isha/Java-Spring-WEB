package com.cg.dao;

import java.util.List;

import com.cg.entity.Movie;

public interface IMovieCatalougeDao {
	List<Movie> getAllMovies();
}