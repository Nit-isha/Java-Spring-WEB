package com.cg.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cg.entity.Movie;


@Component
public class MovieCatalougeImpl implements IMovieCatalougeDao{
	List<Movie> movies = new ArrayList<>();
	{ 
		Movie m1=new Movie("101", "Speed", "Eng", "Action");
		Movie m2=new Movie("102", "God Father", "Eng", "Action");
		Movie m3=new Movie("103", "Maverik", "Eng", "Fantacy");
		Movie m4=new Movie("104", "Matrix", "Eng", "SCI_FI");
		Movie m5=new Movie("105", "Inception", "Eng", "SCI_FI,Fantacy");
		movies.add(m1);
		movies.add(m2);movies.add(m3);movies.add(m4);movies.add(m5);
	}
	
	public List<Movie> getAllMovies() {
		return movies;
	}
}