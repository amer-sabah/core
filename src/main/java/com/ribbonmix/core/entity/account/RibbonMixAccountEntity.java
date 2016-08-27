package com.ribbonmix.core.entity.account;

import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "ribbonmix_account", schema = "account")
@EqualsAndHashCode(callSuper = true)
public class RibbonMixAccountEntity extends AccountEntity {
}
