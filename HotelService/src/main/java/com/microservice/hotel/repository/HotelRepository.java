package com.microservice.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.hotel.model.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{

}
