package org.myapp.main.test;

public class Address {

    private String city;

    public Address(String city){
        this.city = city;
    }
    public Address(Address address){
        this.city = address.city;
    }

    public String getCity() {
        return city;
    }
}
