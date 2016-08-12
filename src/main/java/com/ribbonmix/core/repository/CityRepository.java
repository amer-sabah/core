package com.ribbonmix.core.repository;

import com.ribbonmix.core.entity.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 8/11/2016.
 */
public interface CityRepository extends JpaRepository<CityEntity, Integer> {

    CityEntity findOneByShortName(String shortName);
}
