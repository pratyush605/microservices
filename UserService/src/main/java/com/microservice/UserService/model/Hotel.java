package com.microservice.UserService.model;

public class Hotel {
    private Long id;
    private String name;
    private String location;
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

    public Hotel(Long id, String name, String location, String about) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.about = about;
    }

    public Hotel() {
    }
}
