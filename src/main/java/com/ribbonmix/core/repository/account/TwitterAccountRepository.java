package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.TwitterAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 8/22/2016.
 */
public interface TwitterAccountRepository extends JpaRepository<TwitterAccountEntity, Long> {
}
