package com.ribbonmix.core.repository.general;

import com.ribbonmix.core.entity.general.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 7/29/2016.
 */
public interface CountryRepository extends JpaRepository<CountryEntity, Integer> {

    CountryEntity findOneByIso2(String iso2);

    CountryEntity findOneByIso3(String iso3);
}
