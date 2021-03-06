package com.example.demo.Service;

import com.example.demo.Model.Country;
import com.example.demo.Repository.Repository;

import java.util.Collection;

public class CountryService {

    private Repository repository = new Repository();

    public Country createCountry(String name, String capitalCity) {

        Country country = new Country(name, capitalCity);
        repository.addCountry(country);
        return country;

    }

    public Collection<Country> getAllCountries() {
        return repository.getCountries();
    }

    public Country getCountry(String name) {
        return repository.getCountry(name);

    }

    public boolean deleteCountry(String name) {

        if (repository.getCountry(name) == null)
            return false;

        repository.removeCountry(name);
        return true;

    }


    public boolean updateCountry(String name, String capitalCity) {

        Country country = repository.getCountry(name);
        if (country == null) {
            return false;
        }

        country.setName(name);
        country.setCapitalCity(capitalCity);


        return true;

    }


}

