package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Amer on 8/22/2016.
 */
public interface AddressRepository extends JpaRepository<AddressEntity, Long> {

    @Query("select a from AddressEntity a, PersonEntity p where a.contact = p.contact and p.id =:personId")
    List<AddressEntity> getAddressesByPersonId(@Param("personId") long personId);
}
