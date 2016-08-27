package com.ribbonmix.core.repository.account;

import com.ribbonmix.core.entity.account.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Amer on 8/22/2016.
 */
public interface ContactRepository extends JpaRepository<ContactEntity, Long> {
}
