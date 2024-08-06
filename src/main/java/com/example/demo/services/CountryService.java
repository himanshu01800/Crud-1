package com.example.demo.services;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
   public boolean updateCountry(Country country){
       Optional<Country> country1=countryRepository.findById(country.getId());
       if(country1.isPresent()){
           countryRepository.save(country);
           return true;
       }
       return false;
   }

    public Boolean deleteCountry(int id) {
        Optional<Country> country=countryRepository.findById(id);
        if(country.isPresent()){
            countryRepository.delete(country.get());
            return true;
        }

            return false;

    }
}
