package com.dipo.moviecatalogservice.Resourse;

import com.dipo.moviecatalogservice.models.CatalogItem;
import com.dipo.moviecatalogservice.models.Movie;
import com.dipo.moviecatalogservice.models.Rating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogResource {

    // get all rated movie IDs

    // for each movie ID, call movie info service and get details

    // Put them together


    @RequestMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId")String userId){

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:7070/movies/dipo", Movie.class);

        List<Rating> ratings = Arrays.asList(
                new Rating("Togo", 6),
                new Rating("Transformers", 6)
        );

        return ratings.stream()
                .map(rating -> new CatalogItem("The legend", "Test", 6))
                .collect(Collectors.toList());
    }
}
