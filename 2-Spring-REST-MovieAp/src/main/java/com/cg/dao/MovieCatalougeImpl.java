package com.cg.dao;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.cg.entity.Movie;
import com.cg.entity.Review;


@Component
public class MovieCatalougeImpl implements IMovieCatalougeDao{
	List<Movie> movies = new ArrayList<>();
	List<Review> reviews1 = new ArrayList<>();
	List<Review> reviews2 = new ArrayList<>();
	{ 
		Review r1 = new Review(1001, "Mr.A", "Nice movie", 4.5f);
		Review r2 = new Review(1002, "Mr.B", "Not good", 3.5f);
		Review r3 = new Review(1003, "Mr.C", "Not recommended", 3f);
		Review r4 = new Review(1004, "Mr.D", "Nice Cinematography", 3.9f);
		Review r5 = new Review(1005, "Mr.E", "Average", 2.9f);
		
		reviews1.add(r1); reviews2.add(r2); reviews2.add(r3);
		reviews1.add(r4); reviews2.add(r5);
		
		Movie m1=new Movie("101", "Speed", "Eng", "Action");
		Movie m2=new Movie("102", "God Father", "Eng", "Action");
		Movie m3=new Movie("103", "Maverik", "Eng", "Fantacy");
		Movie m4=new Movie("104", "Matrix", "Eng", "SCI_FI");
		Movie m5=new Movie("105", "Inception", "Eng", "SCI_FI,Fantacy");
		
		movies.add(m1); movies.add(m2); movies.add(m3);
		movies.add(m4); movies.add(m5);
		
		m1.setReviews(reviews2);
		m2.setReviews(reviews1);
		m3.setReviews(reviews1);
		m4.setReviews(reviews2);
		
	}
	
	public List<Movie> getAllMovies() {
		return movies;
	}
}