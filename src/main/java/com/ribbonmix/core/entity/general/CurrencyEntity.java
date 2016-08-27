package com.ribbonmix.core.entity.general;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Amer on 8/12/2016.
 */

@Entity
@Table(name = "currency", schema = "general")
@Data
@EqualsAndHashCode(of = {"shortName"}, callSuper = true)
public class CurrencyEntity extends BaseEntity {

    @Id
    @Column(name = "currency_id")
    private Integer id;

    @Column(name = "short_name")
    private String shortName;

    @Column(name = "name")
    private String name;
}
