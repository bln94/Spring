
package com.example.demo;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private List<Phone> phoneList;
    private Address address;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhones() {
        return this.phoneList;
    }

    public void setPhones(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.id + " " + this.name + " " + this.address + " " + this.phoneList;
    }

}