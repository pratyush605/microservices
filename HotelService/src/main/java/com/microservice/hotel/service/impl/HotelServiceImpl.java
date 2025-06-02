package com.microservice.hotel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.hotel.exceptions.ResourceNotFoundException;
import com.microservice.hotel.model.Hotel;
import com.microservice.hotel.repository.HotelRepository;
import com.microservice.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotelById(Long id){
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found."));
    }

    @Override
    public Hotel updateHotelById(Hotel hotel, Long id){
        Hotel oldHotel = hotelRepository.findById(id).orElseThrow();
        oldHotel.setName(hotel.getName());
        oldHotel.setLocation(hotel.getLocation());
        oldHotel.setAbout(hotel.getAbout());
        return hotelRepository.save(oldHotel);
    }

    @Override
    public void deleteHotelById(Long id){
        hotelRepository.deleteById(id);
    }
}
