package com.victorhugo.cleanarch.core.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String city;
    private String state;

    public Address(String street, String city, String state) {
        this.street = street;
        this.city = city;
        this.state = state;
    }

    public Address() {
    }
}
