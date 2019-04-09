package com.stefanbanu.ratingsdataservice.controller;

import com.stefanbanu.ratingsdataservice.models.Rating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratings")
public class RatingDataController {

    @GetMapping(value = "/{movieId}")
    public Rating getRating(@PathVariable String movieId) {
        return new Rating("Titanic" , 10);
    }
}
