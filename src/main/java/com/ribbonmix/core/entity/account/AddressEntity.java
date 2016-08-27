package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import com.ribbonmix.core.entity.general.NeighborhoodEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "address", schema = "account")
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class AddressEntity extends BaseEntity {

    @Id
    @Column(name = "address_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "neighborhood_id")
    private NeighborhoodEntity neighborhood;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "unit")
    private String unit;

    @Column(name = "building_number")
    private String buildingNumber;

    @Column(name = "confirmed")
    private boolean confirmed;

    @Column(name = "default_address")
    private boolean defaultAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;
}
