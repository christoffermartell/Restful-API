package com.example.demo.Controller;

import com.example.demo.Model.CountryEntity;

import com.example.demo.Service.CountryService;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Collection;

@CrossOrigin
@RestController
public class CountryController {

    private CountryService service = new CountryService();


    @PutMapping("/countries/create")
    public CountryEntity createCountry(@RequestBody CreateCountry createCountry) {


        return service.createCountry(createCountry.name, createCountry.capitalCity);

    }

    @GetMapping("/countries/all")
    public Collection<CountryEntity> getAllCountries() {
        return service.getAllCountries();

    }

    @GetMapping("/countries/single/{countryName}")
    public CountryEntity getCountry(@PathVariable("countryName") String countryName, HttpServletResponse response) {
        CountryEntity country = service.getCountry(countryName);
        if (country == null) {
            response.setStatus(404);
            return null;
        }
        return country;
    }

    @DeleteMapping("/countries/delete/{countryName}")
    public void deleteCountry(@PathVariable("countryName") String countryName, HttpServletResponse response) {

        if (!service.deleteCountry(countryName)) {
            response.setStatus(404);
        }
    }

    @PatchMapping("/countries/update/{countryName}")
    public CountryEntity updateCountry(
            @PathVariable("countryName") String countryName,
            @RequestBody UpdateCountry updateCountry,
            HttpServletResponse response) {


        if (!service.updateCountry(countryName, updateCountry.capitalCity)) {
            response.setStatus(404);
            return null;
        }


        return service.getCountry(countryName);
    }

    public static final class CreateCountry {
        public String name;
        public String capitalCity;
    }

    public static final class UpdateCountry {
        public String name;
        public String capitalCity;

    }

}
