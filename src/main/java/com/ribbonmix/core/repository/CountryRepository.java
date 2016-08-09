package com.ribbonmix.core.repository;

import com.ribbonmix.core.entity.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 7/29/2016.
 */
public interface CountryRepository extends JpaRepository<CountryEntity, Long> {

    CountryEntity findOneByIso2(String iso2);
}
