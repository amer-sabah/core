package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Amer on 8/22/2016.
 */
public interface PersonRepository extends JpaRepository<PersonEntity, Long> {

    @Query("select p from PersonEntity p, EmailEntity e where p.contact = e.contact and e.emailAddress =:email ")
    PersonEntity findOneByEmail(@Param("email") String email);
}
