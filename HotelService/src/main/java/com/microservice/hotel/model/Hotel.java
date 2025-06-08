package com.microservice.hotel.model;

import jakarta.persistence.*;

@Entity
@Table(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "about")
    private String about;

    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }

    public String getName() {
      return this.name;
    }
    public void setName(String name) {
      this.name = name;
    }

    public String getLocation() {
      return this.location;
    }
    public void setLocation(String location) {
      this.location = location;
    }

    public String getAbout() {
      return this.about;
    }
    public void setAbout(String about) {
      this.about = about;
    }
}
