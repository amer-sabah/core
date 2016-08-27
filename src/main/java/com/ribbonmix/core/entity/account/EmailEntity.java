package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "email", schema = "account")
@Data
@EqualsAndHashCode(of = {"emailAddress"}, callSuper = true)
public class EmailEntity extends BaseEntity {

    @Id
    @Column(name = "email_id")
    private Long id;

    @Column(name = "confirmed")
    private boolean confirmed;

    @Column(name = "email_address")
    private String emailAddress;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;

    @Column(name = "default_email")
    private boolean defaultEmail;
}
