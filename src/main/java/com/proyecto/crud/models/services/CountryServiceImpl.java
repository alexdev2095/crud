package com.proyecto.crud.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.crud.models.entities.Country;
import com.proyecto.crud.models.repository.CountryRepository;

@Service
public class CountryServiceImpl implements ICountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public List<Country> index() {
        return (List<Country>) countryRepository.findAll();
    }

}
