package com.cg.entity;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement
public class Movies {
	private List<Movie> movies;

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	

}
