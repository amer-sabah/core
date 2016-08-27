package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.PhoneEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Amer on 8/22/2016.
 */
public interface PhoneRepository extends JpaRepository<PhoneEntity, Long> {

    @Query("select ph from PhoneEntity ph, PersonEntity p where ph.contact = p.contact and p.id =:personId")
    List<PhoneEntity> getPhonesByPersonId(@Param("personId") long personId);
}
