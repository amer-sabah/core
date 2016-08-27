package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.RibbonMixAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by Amer on 8/22/2016.
 */
public interface RibbonMixAccountRepository extends JpaRepository<RibbonMixAccountEntity, Long> {

    @Query("select rma from RibbonMixAccountEntity rma where rma.userProfile.id =:userProfileId")
    RibbonMixAccountEntity findOneByUserProfileId(@Param("userProfileId") long userProfileId);
}
