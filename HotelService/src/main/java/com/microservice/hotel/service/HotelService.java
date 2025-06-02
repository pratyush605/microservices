package com.microservice.hotel.service;

import java.util.List;

import com.microservice.hotel.model.Hotel;

public interface HotelService {
    public Hotel createHotel(Hotel hotel);

    public List<Hotel> getAllHotels();

    public Hotel getHotelById(Long id);

    public Hotel updateHotelById(Hotel hotel, Long id);

    public void deleteHotelById(Long id);
}
