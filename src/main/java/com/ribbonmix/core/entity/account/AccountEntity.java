package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/13/2016.
 */


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "account", schema = "account")
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public abstract class AccountEntity extends BaseEntity {

    @Id
    @Column(name = "account_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id")
    private UserProfileEntity userProfile;

    @Column(name = "active")
    private boolean active;

}
