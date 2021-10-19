package com.example.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryEntity {

    public String name;
    public String capitalCity;



    public CountryEntity(String name, String capitalCity) {
        this.name = name;
        this.capitalCity = capitalCity;
    }




}
