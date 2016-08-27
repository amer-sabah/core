package com.ribbonmix.core.service;

import com.ribbonmix.core.entity.general.CityEntity;
import com.ribbonmix.core.entity.general.CountryEntity;
import com.ribbonmix.core.entity.general.CurrencyEntity;
import com.ribbonmix.core.entity.general.NeighborhoodEntity;
import com.ribbonmix.core.repository.general.CityRepository;
import com.ribbonmix.core.repository.general.CountryRepository;
import com.ribbonmix.core.repository.general.CurrencyRepository;
import com.ribbonmix.core.repository.general.NeighborhoodRepository;
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

    @Autowired
    private NeighborhoodRepository neighborhoodRepository;

    @Autowired
    private CurrencyRepository currencyRepository;

    public CountryEntity getCountryByIso2(String iso2) {
        return countryRepository.findOneByIso2(iso2);
    }

    public CountryEntity getCountryByIso3(String iso3) {
        return countryRepository.findOneByIso3(iso3);
    }

    public CityEntity getCityByShortName(String shortName) {
        return cityRepository.findOneByShortName(shortName);
    }

    public NeighborhoodEntity getNeighborhoodByShortName(String shortName) {
        return neighborhoodRepository.findOneByShortName(shortName);
    }

    public CurrencyEntity getCurrencyByShortName(String shortName) {
        return currencyRepository.findOneByShortName(shortName);
    }
}
