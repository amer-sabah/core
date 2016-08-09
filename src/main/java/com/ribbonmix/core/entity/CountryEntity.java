package com.ribbonmix.core.entity;

import lombok.Data;

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
public class CountryEntity {

    @Id
    @Column(name = "country_id")
    private Long id;

    @Column(name = "iso2")
    private String iso2;

    @Column(name = "iso3")
    private String iso3;

    @Column(name = "name")
    private String name;
}

