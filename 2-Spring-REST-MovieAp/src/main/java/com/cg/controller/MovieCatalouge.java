package com.cg.controller;
import com.cg.entity.Movie;
import com.cg.entity.Movies;
import com.cg.exception.MovieNotFoundException;
import com.cg.service.IMovieCatalougeService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController --> instead of controller and response body
//@Controller
@RestController
@RequestMapping("/movies")
public class MovieCatalouge {
	@Autowired
	private IMovieCatalougeService movieCatalougeService;
	
	@RequestMapping(value = "/test", produces = "application/json")
	public /* @ResponseBody */ Movie test() {
		return new Movie("A234","Sample name","English", "Action");
	}
	
	@RequestMapping(produces = {"application/json", "application/xml"})
	public /* @ResponseBody */ Movies movieList(){
		System.out.println("all movies ......");
		//invoke service
		Movies movies = new Movies();
		movies.setMovies(movieCatalougeService.getAllMovieService());
		return movies;
		
	}
	
	@RequestMapping(value = "/{mCode}", produces = {"application/json","application/xml"})
	public  ResponseEntity<Movie> findMovieById( @PathVariable("mCode")  String movieCode) {
		System.out.println(movieCode);
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Optional<Movie> optionalMovie = movList.stream().filter(m->movieCode.equals(m.getMovieCode())).findFirst();
		
		if(optionalMovie.isPresent()) {
			Movie movie = optionalMovie.get();
			return  new ResponseEntity<Movie>( movie,HttpStatus.OK);
		}
		else
			throw new MovieNotFoundException();
	}
	
	
//	@RequestMapping(method = RequestMethod.POST)
	@PostMapping(consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
		public ResponseEntity<Movies> addNewMovie (@RequestBody Movie movie) {
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		movList.add(movie);
		Movies movies = new Movies();
		movies.setMovies(movList);
		return new ResponseEntity<Movies>(movies, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{mCode}", produces = {"application/json", "application/xml"})
	public ResponseEntity<Movies> deleteMovie (@PathVariable("mCode") String movieCode) {
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = movList.stream().filter(p -> p.getMovieCode().equals(movieCode)).findFirst().get();
		movList.remove(movie);
		
		Movies movies = new Movies();
		movies.setMovies(movList);
		
		return new ResponseEntity<Movies>(movies, HttpStatus.OK);
	}
	
	@PutMapping(value = "/{mCode}", consumes = {"application/json", "application/xml"}, produces = {"application/json", "application/xml"})
	public Movies deleteMovie (@PathVariable("mCode") String movieCode, @RequestBody Movie moive) {
		List<Movie> movList = movieCatalougeService.getAllMovieService();
		
		Movie movie = (Movie) movList.stream().filter(p -> p.getMovieCode().equals(movieCode));
		movie.setMovieName("3 Idiots");
		movie.setLanguage("Hindi");
		movie.setGenre("Comedy");
		movList.add(movie);
		Movies movies = new Movies();
		movies.setMovies(movList);
		return movies;
	}
	
	
	
	
	
}
