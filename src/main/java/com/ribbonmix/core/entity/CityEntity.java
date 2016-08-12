package com.ribbonmix.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.ZoneId;

/**
 * Created by Amer on 8/11/2016.
 */

@Entity
@Table(name = "city", schema = "general")
@Data
@EqualsAndHashCode(of = {"shortName"}, callSuper = true)
@ToString()
public class CityEntity extends BaseEntity {

    @Id
    @Column(name = "city_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id")
    private CountryEntity country;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private Boolean active;

    @Column(name = "zone_id")
    private ZoneId zoneId;

    @Column(name = "default_city")
    private Boolean defaultCity;
}
