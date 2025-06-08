package com.microservice.rating.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.microservice.rating.model.Rating;

@Repository
public interface RatingRepository extends MongoRepository<Rating, String>{

    List<Rating> findByUserId(Long userId);

    List<Rating> findByHotelId(Long hotelId);

}
