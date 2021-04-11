/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.project.backend.spring.service;

import co.com.project.backend.spring.model.Country;
import java.util.List;

public interface CountryService {
    
    List<Country> getAllCountries();
    
}
