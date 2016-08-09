package com.ribbonmix.core.service;

import com.ribbonmix.core.entity.CountryEntity;
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

    public CountryEntity getCountryByIso2(String iso2) {
        return countryRepository.findOneByIso2(iso2);
    }
}
