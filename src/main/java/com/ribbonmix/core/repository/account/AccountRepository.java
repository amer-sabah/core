package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.AccountEntity;
import com.ribbonmix.core.entity.account.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Amer on 8/22/2016.
 */
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    List<AccountEntity> findByUserProfile(UserProfileEntity userProfile);
}
