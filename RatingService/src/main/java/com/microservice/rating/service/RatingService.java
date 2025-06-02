package com.microservice.rating.service;

import java.util.List;

import com.microservice.rating.model.Rating;

public interface RatingService {
    public Rating createRating(Rating rating);

    public List<Rating> getAllRating();

    public List<Rating> getAllRatingByUserId(Long userId);

    public List<Rating> getAllRatingByHotelId(Long hotelId);

    public Rating getRatingById(Long id);

    public Rating updateRating(Rating rating, Long id);

    public void deleteRating(Long id);
}
