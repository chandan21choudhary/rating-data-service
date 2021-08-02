package com.java.ratingdata.resource;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.ratingdata.model.Rating;
import com.java.ratingdata.model.UserRating;

@RestController
@RequestMapping("/rating")
public class RatingResource {
	
	@Autowired
	private UserRating userRating;
	
	@GetMapping("/{movieId}")
	public Rating getRating(@PathVariable("movieId") String movieId) {
		return new Rating("1", 4);
	}
	
	@GetMapping("/users/{userId}")
	
	public UserRating getUserRating() {
		List<Rating> ratings = Arrays.asList(new Rating("1234", 4), new Rating("5678", 5));
		
		userRating.setUserRating(ratings);
		 return userRating;
		
	}

}
