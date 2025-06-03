package com.microservice.rating.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.rating.model.Rating;
import com.microservice.rating.service.impl.RatingServiceImpl;

@RestController
@RequestMapping("/")
public class RatingController {

    @Autowired
    private RatingServiceImpl ratingService;

    @PostMapping("/createRating")
    public ResponseEntity<?> createRating(@RequestBody Rating rating){
        ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(rating);
    }

    @GetMapping("/getAllRatings")
    public ResponseEntity<?> getAllRating(){
        List<Rating> allRatings = ratingService.getAllRating();
        return ResponseEntity.ok(allRatings);
    }

    @GetMapping("/getAllRatingByHotelId/{hotelId}")
    public ResponseEntity<?> getAllRatingByHotelId(@PathVariable("hotelId") Long hotelId){
        List<Rating> allRatingsByHotelId = ratingService.getAllRatingByHotelId(hotelId);
        return ResponseEntity.ok(allRatingsByHotelId);
    }

    @GetMapping("/getAllRatingByUserId/{userId}")
    public ResponseEntity<?> getAllRatingByUserId(@PathVariable("userId") Long userId){
        List<Rating> allRatingsByUserId = ratingService.getAllRatingByUserId(userId);
        return ResponseEntity.ok(allRatingsByUserId);
    }

    @GetMapping("/getRatingById/{id}")
    public ResponseEntity<?> getRatingById(@PathVariable("id") Long id){
        Rating rating = ratingService.getRatingById(id);
        return ResponseEntity.ok(rating);
    }

    @PostMapping("/updateRating/{id}")
    public ResponseEntity<?> updateRating(@RequestBody Rating rating, @PathVariable("id") Long id) {
        Rating newRating = ratingService.updateRating(rating, id);
        return ResponseEntity.ok(newRating);
    }

    @GetMapping("/deleteRating/{id}")
    public ResponseEntity<?> deleteRating(@PathVariable("id") Long id){
        ratingService.deleteRating(id);
        return ResponseEntity.ok("Rating deleted successfully!!");
    }
}
