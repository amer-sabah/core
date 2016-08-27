package com.ribbonmix.core.repository.general;

import com.ribbonmix.core.entity.general.NeighborhoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 8/12/2016.
 */
public interface NeighborhoodRepository extends JpaRepository<NeighborhoodEntity, Integer> {

    NeighborhoodEntity findOneByShortName(String shortName);
}
