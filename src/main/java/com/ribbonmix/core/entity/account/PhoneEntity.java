package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import com.ribbonmix.core.entity.general.CountryEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "phone", schema = "account")
@Data
@EqualsAndHashCode(of = {"country", "phoneNumber", "phoneExtension"}, callSuper = true)
public class PhoneEntity extends BaseEntity {

    @Id
    @Column(name = "phone_id")
    private Long id;

    @Column(name = "confirmed")
    private boolean confirmed;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private CountryEntity country;

    @Column(name = "default_phone")
    private boolean defaultPhone;

    @Column(name = "phone_extension")
    private Integer phoneExtension;

    @Column(name = "phone_number")
    private Long phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;

}
