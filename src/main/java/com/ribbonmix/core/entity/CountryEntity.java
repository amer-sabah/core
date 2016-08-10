package com.ribbonmix.core.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Amer on 7/29/2016.
 */

@Entity
@Table(name = "country", schema = "general")
@Data
@EqualsAndHashCode(of = {"iso3"}, callSuper = true)
public class CountryEntity extends BaseEntity {

    @Id
    @Column(name = "country_id")
    private Integer id;

    @Column(name = "calling_code")
    private Integer callingCode;

    @Column(name = "name")
    private String name;

    @Column(name = "iso2")
    private String iso2;

    @Column(name = "iso3")
    private String iso3;

    @Column(name = "weekend_start")
    private Integer weekendStart;


}

