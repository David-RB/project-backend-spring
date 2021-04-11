/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.project.backend.spring.controller;

import co.com.project.backend.spring.model.Country;
import co.com.project.backend.spring.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/world")
public class WorldController {
    
    @Autowired
    private CountryService countryService;
    
    @GetMapping(value = {"/countries"})
    public List<Country> getCountries(){
        return countryService.getAllCountries();
    }
    
}
