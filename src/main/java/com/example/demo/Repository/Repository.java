package com.example.demo.Repository;

import com.example.demo.Model.CapitalCityEntity;
import com.example.demo.Model.CountryEntity;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Repository {

    private Map<String, CountryEntity> countries = new HashMap<>();
    private Map<String, CapitalCityEntity> capitalCities = new HashMap<>();


    public void addCountry(CountryEntity country) {
        countries.put(country.getName().toLowerCase(), country);
    }
    public Collection<CountryEntity> getCountries() {
        return countries.values();
    }
    public CountryEntity getCountry(String name) {
        return countries.get(name.toLowerCase());
    }
    public void removeCountry(String name) {
        countries.remove(name.toLowerCase());
    }
}
