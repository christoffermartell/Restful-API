package com.example.demo.Repository;

import com.example.demo.Model.CapitalCity;
import com.example.demo.Model.Country;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Map<String, Country> countries = new HashMap<>();
    private Map<String, CapitalCity> capitalCities = new HashMap<>();


    public void addCountry(Country country) {
        countries.put(country.getName().toLowerCase(), country);
    }
    public Collection<Country> getCountries() {
        return countries.values();
    }
    public Country getCountry(String name) {
        return countries.get(name.toLowerCase());
    }
    public void removeCountry(String name) {
        countries.remove(name.toLowerCase());
    }
}
