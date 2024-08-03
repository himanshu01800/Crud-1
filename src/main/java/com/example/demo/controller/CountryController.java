package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {



    @GetMapping("/getCountry")
    public ResponseEntity<Country>  getCountry(){
        Country country=new Country();
        country.setId(22);
        country.setName("India");
        country.setCapital("New Delhi");
        return ResponseEntity.ok(country);

    }


}
