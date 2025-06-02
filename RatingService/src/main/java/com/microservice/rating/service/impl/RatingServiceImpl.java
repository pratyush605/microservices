package com.microservice.rating.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.rating.exceptions.ResourceNotFoundException;
import com.microservice.rating.model.Rating;
import com.microservice.rating.repository.RatingRepository;
import com.microservice.rating.service.RatingService;

@Service
public class RatingServiceImpl implements RatingService{

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating){
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRating(){
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingByUserId(Long userId){
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getAllRatingByHotelId(Long hotelId){
        return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public Rating getRatingById(Long id){
        return ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating with given id not found."));
    }

    @Override
    public Rating updateRating(Rating rating, Long id){
        Rating oldRating = ratingRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Rating with given id not found."));
        oldRating.setHotelId(rating.getHotelId());
        oldRating.setRating(rating.getRating());
        oldRating.setUserId(rating.getUserId());
        oldRating.setRemark(rating.getRemark());
        return ratingRepository.save(oldRating);
    }

    @Override
    public void deleteRating(Long id){
        ratingRepository.deleteById(id);
    }
}
