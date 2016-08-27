package com.ribbonmix.core.entity.general;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/12/2016.
 */

@Entity
@Table(name = "neighborhood", schema = "general")
@Data
@EqualsAndHashCode(of = {"shortName"}, callSuper = true)
public class NeighborhoodEntity extends BaseEntity {

    @Id
    @Column(name = "neighborhood_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private CityEntity city;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "name")
    private String name;

    @Column(name = "postal_code")
    private String postalCode;

}
