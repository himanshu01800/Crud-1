package com.example.demo.controller;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.services.CountryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

  private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/getcountry")
    public ResponseEntity<List<Country>>  getCountry(){
     return ResponseEntity.ok(countryService.getAllCountry());
    }

   @PostMapping
    public ResponseEntity<Country> addCountry(@RequestBody Country country){
     return ResponseEntity.ok(countryService.addCountry(country));
   }
}
