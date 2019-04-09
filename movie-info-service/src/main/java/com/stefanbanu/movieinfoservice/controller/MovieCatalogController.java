package com.stefanbanu.movieinfoservice.controller;

import com.stefanbanu.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieCatalogController {

    @GetMapping(value = "/{movieId}")
    public Movie getCatalog(@PathVariable String movieId) {
        return new Movie("Titanic", "Test", 10);
    }
}
