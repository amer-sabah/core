package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.EmailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Amer on 8/22/2016.
 */
public interface EmailRepository extends JpaRepository<EmailEntity, Long> {

    @Query("select e from EmailEntity e, PersonEntity p where e.contact = p.contact and p.id =:personId")
    List<EmailEntity> getEmailsByPersonId(@Param("personId") long personId);
}
