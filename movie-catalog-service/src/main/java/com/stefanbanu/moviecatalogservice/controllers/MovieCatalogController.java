package com.stefanbanu.moviecatalogservice.controllers;

import com.stefanbanu.moviecatalogservice.models.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @GetMapping(value = "/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable String userId) {
        return Collections.singletonList(new CatalogItem("Transformes", "Test", 7));
    }
}
