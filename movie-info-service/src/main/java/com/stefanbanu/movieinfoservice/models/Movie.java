package com.stefanbanu.movieinfoservice.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

    private String name;
    private String desc;
    private int rating;
}
