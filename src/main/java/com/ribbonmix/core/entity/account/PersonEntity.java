package com.ribbonmix.core.entity.account;

import com.ribbonmix.core.entity.BaseEntity;
import com.ribbonmix.core.entity.lookup.Gender;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by Amer on 8/13/2016.
 */

@Entity
@Table(name = "person", schema = "account")
@Data
@EqualsAndHashCode(of = {"id"}, callSuper = true)
public class PersonEntity extends BaseEntity {

    @Id
    @Column(name = "person_id")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_id")
    private ContactEntity contact;
}
