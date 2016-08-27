package com.ribbonmix.core.repository.general;

import com.ribbonmix.core.entity.general.CurrencyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 8/12/2016.
 */
public interface CurrencyRepository extends JpaRepository<CurrencyEntity, Integer> {

    CurrencyEntity findOneByShortName(String shortName);
}
