package com.cg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Movie;
import com.cg.entity.Review;
import com.cg.service.IMovieCatalougeService;

@RestController
@RequestMapping("/movies")
public class ReviewController {
	
	@Autowired
	private IMovieCatalougeService movieCatalougeService;
	
	@GetMapping("{movieCode}/reviews")
	public List<Review> findReviewsByMovieId(@PathVariable String movieCode){
	   
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().
						filter(m->movieCode.equals(m.getMovieCode())).findFirst().get();
		
		return movie.getReviews(); 
	}
	
	@PostMapping("{movieCode}/reviews")
	public List<Review> addReviewsByMovieId(@PathVariable String movieCode, @RequestBody Review review){
		   
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().
						filter(m->movieCode.equals(m.getMovieCode())).findFirst().get();
		
		List<Review> reviews = movie.getReviews();
		reviews.add(review);
		
		movie.setReviews(reviews);
		return movie.getReviews(); 
	}
	
	@GetMapping("{movieCode}/reviews/{reviewId}")
		public Review getReviewsByMovieId(@PathVariable String movieCode, @PathVariable String reviewId){
		
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().
						filter(m -> movieCode.equals(m.getMovieCode())).findFirst().get();
		
		List<Review> reviews = movie.getReviews();
		
		Review review = reviews.stream().
						filter(m -> Integer.parseInt(reviewId)==(m.getRevId())).findFirst().get();
		
		return review; 
	}
	
	@DeleteMapping("{movieCode}/reviews/{reviewId}")
	public List<Review> addReviewsByMovieId(@PathVariable String movieCode, @PathVariable String reviewId){
		
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().
						filter(m -> movieCode.equals(m.getMovieCode())).findFirst().get();
		
		List<Review> reviews = movie.getReviews();
		
		Review review = (Review) reviews.stream().
						filter(m -> Integer.parseInt(reviewId)==(m.getRevId())).findFirst().get();
		reviews.remove(review);
		
		movie.setReviews(reviews);
		return movie.getReviews(); 
	}
	
	@PatchMapping("{movieCode}/reviews/{reviewId}")
	public Review updateReviewsByMovieId(@PathVariable String movieCode, @PathVariable String reviewId){
		
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().
						filter(m -> movieCode.equals(m.getMovieCode())).findFirst().get();
		
		List<Review> reviews = movie.getReviews();
		
		Review review = reviews.stream().
						filter(m -> Integer.parseInt(reviewId)==(m.getRevId())).findFirst().get();
		
		review.setRatings(4.8f);
		return review; 
	}
}
