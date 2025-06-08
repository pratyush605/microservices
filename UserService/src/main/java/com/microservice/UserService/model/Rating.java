package com.microservice.UserService.model;

public class Rating {
    private String id;
    private Long userId;
    private Long hotelId;
    private int rating;
    private String remark;
    private Hotel hotel;

    public String getId() {
      return this.id;
    }
    public void setId(String value) {
      this.id = value;
    }

    public Long getUserId() {
      return this.userId;
    }
    public void setUserId(Long value) {
      this.userId = value;
    }

    public Long getHotelId() {
      return this.hotelId;
    }
    public void setHotelId(Long value) {
      this.hotelId = value;
    }

    public int getRating() {
      return this.rating;
    }
    public void setRating(int value) {
      this.rating = value;
    }

    public String getRemark() {
      return this.remark;
    }
    public void setRemark(String value) {
      this.remark = value;
    }

    public Hotel getHotel() {
        return hotel;
    }
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Rating() {
    }

    public Rating(String id, Long userId, Long hotelId, int rating, String remark, Hotel hotel) {
        this.id = id;
        this.userId = userId;
        this.hotelId = hotelId;
        this.rating = rating;
        this.remark = remark;
        this.hotel = hotel;
    }
}
