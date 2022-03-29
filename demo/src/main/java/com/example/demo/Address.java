package com.example.demo;

public class Address {
    private String country;
    private String state;
    private String city;
    private String zipCode;

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Address() {
    }

    public Address(String country, String state, String city, String zipCode) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.zipCode = zipCode;
    }

    @Override
    public String toString() {
        return this.city + " " + this.state + " " + this.zipCode + " " + this.country;
    }
}