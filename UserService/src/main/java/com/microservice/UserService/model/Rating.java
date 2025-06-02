package com.microservice.UserService.model;

public class Rating {
    private Long id;
    private Long userId;
    private Long hotelId;
    private int rating;
    private String remark;

    public Long getId() {
      return this.id;
    }
    public void setId(Long value) {
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
}
