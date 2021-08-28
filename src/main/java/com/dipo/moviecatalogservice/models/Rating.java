package com.dipo.moviecatalogservice.models;

public class Rating {

    private String movieId;
    private int ratings;

    public Rating(String movieId, int ratings) {
        this.setMovieId(movieId);
        this.setRatings(ratings);
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }
}
