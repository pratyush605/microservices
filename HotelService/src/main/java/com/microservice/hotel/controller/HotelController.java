package com.microservice.hotel.controller;

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

import com.microservice.hotel.model.Hotel;
import com.microservice.hotel.service.impl.HotelServiceImpl;

@RestController
@RequestMapping("/")
public class HotelController {
    @Autowired
    private HotelServiceImpl hotelService;

    @PostMapping("/createHotel")
    public ResponseEntity<?> createHotel(@RequestBody Hotel hotel) {
        hotelService.createHotel(hotel);
        return ResponseEntity.status(HttpStatus.CREATED).body(hotel);
    }

    @GetMapping("/getAllHotels")
    public ResponseEntity<?> getAllHotels(){
        List<Hotel> allHotels = hotelService.getAllHotels();
        return ResponseEntity.ok(allHotels);
    }

    @GetMapping("/getHotel/{id}")
    public ResponseEntity<?> getHotel(@PathVariable("id") Long id) {
        Hotel hotel = hotelService.getHotelById(id);
        return ResponseEntity.ok(hotel);
    }

    @PostMapping("/updateHotel/{id}")
    public ResponseEntity<?> updateHotel(@RequestBody Hotel hotel, @PathVariable("id") Long id) {
        Hotel updatedHotel = hotelService.updateHotelById(hotel, id);
        return ResponseEntity.ok(updatedHotel);
    }

    @GetMapping("/deleteHotel/{id}")
    public ResponseEntity<?> deleteHotel(@PathVariable("id") Long id){
        hotelService.deleteHotelById(id);
        return ResponseEntity.ok("The hotel details deleted successfully !!!");
    }
}
