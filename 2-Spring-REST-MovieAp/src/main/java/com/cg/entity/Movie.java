package com.cg.entity;

import java.util.List;

//@XmlRootElement
public class Movie {
	
	private String movieCode;
	private String movieName;
	private String language;
	private String genre;
	
	private List<Review> reviews;
	public Movie() {
		
	}
	
	public Movie(String movieCode, String movieName, String language, String genre) {
		super();
		this.movieCode = movieCode;
		this.movieName = movieName;
		this.language = language;
		this.genre = genre;
	}
	
	public String getMovieCode() {
		return movieCode;
	}
	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
}
