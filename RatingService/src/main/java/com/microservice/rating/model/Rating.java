package com.microservice.rating.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("user_ratings")
public class Rating {
    @Id
    private Long id;

    private Long userId;

    private Long hotelId;

    private int rating;

    private String remark;

    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    public Long getUserId() {
      return this.userId;
    }
    public void setUserId(Long userId) {
      this.userId = userId;
    }

    public Long getHotelId() {
      return this.hotelId;
    }
    public void setHotelId(Long hotelId) {
      this.hotelId = hotelId;
    }

    public int getRating() {
      return this.rating;
    }
    public void setRating(int rating) {
      this.rating = rating;
    }

    public String getRemark() {
      return this.remark;
    }
    public void setRemark(String remark) {
      this.remark = remark;
    }
}
