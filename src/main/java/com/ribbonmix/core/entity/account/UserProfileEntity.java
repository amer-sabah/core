package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/16/2016.
 */

@Entity
@Table(name = "user_profile", schema = "account")
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class UserProfileEntity extends BaseEntity {

    @Id
    @Column(name = "profile_id")
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "profile_id", insertable = false, updatable = false)
    private PersonEntity person;

    @Column(name = "active")
    private boolean active;

}
