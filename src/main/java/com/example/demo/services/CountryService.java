package com.example.demo.services;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private  final  CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }


    public Country addCountry(Country country) {
        countryRepository.save(country);
        return country;
    }
   public List<Country> getAllCountry(){
        return countryRepository.findAll();
   }
}
