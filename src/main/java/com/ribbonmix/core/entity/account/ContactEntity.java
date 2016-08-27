package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "contact", schema = "account")
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class ContactEntity extends BaseEntity {

    @Id
    @Column(name = "contact_id")
    private Long id;
}
