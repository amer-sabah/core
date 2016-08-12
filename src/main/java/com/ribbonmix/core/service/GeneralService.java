package com.ribbonmix.core.service;

import com.ribbonmix.core.entity.CityEntity;
import com.ribbonmix.core.entity.CountryEntity;
import com.ribbonmix.core.repository.CityRepository;
import com.ribbonmix.core.repository.CountryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Amer on 7/29/2016.
 */

@Service
@Data
public class GeneralService {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private CityRepository cityRepository;

    public CountryEntity getCountryByIso2(String iso2) {
        return countryRepository.findOneByIso2(iso2);
    }

    public CountryEntity getCountryByIso3(String iso3) {
        return countryRepository.findOneByIso3(iso3);
    }

    public CityEntity getCityByShortName(String shortName) {
        return cityRepository.findOneByShortName(shortName);
    }
}
