package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Country {

    public String name;
    public String capitalCity;



    public Country(String name, String capitalCity) {
        this.name = name;
        this.capitalCity = capitalCity;
    }




}
