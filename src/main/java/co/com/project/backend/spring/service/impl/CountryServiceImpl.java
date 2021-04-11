/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.project.backend.spring.service.impl;

import org.springframework.stereotype.Service;
import co.com.project.backend.spring.model.Country;
import co.com.project.backend.spring.repository.CountryRepository;
import co.com.project.backend.spring.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class CountryServiceImpl implements CountryService{
    
    @Autowired
    CountryRepository countryRepository;

    @Override
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
    
}
