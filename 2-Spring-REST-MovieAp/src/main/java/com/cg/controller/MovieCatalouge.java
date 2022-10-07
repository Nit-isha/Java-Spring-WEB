package com.cg.controller;
import com.cg.entity.Movie;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/movies")
public class MovieCatalouge {
	
	@RequestMapping(value = "/test", produces = "application/json")
	public @ResponseBody Movie test() {
		return new Movie("A234","Sample name","English", "Action");
	}
}
