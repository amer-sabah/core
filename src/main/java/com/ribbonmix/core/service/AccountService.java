package com.ribbonmix.core.service;

import com.ribbonmix.core.entity.account.*;
import com.ribbonmix.core.repository.account.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Amer on 8/13/2016.
 */

@Service
@Data
public class AccountService {

    @Autowired
    private EmailRepository emailRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private PhoneRepository phoneRepository;

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserProfileRepository userProfileRepository;

    @Autowired
    private RibbonMixAccountRepository ribbonMixAccountRepository;

    public PersonEntity getPersonById(long personId) {
        return personRepository.findOne(personId);
    }

    public PersonEntity getPersonByEmail(String email) {
        return personRepository.findOneByEmail(email);
    }

    public List<PhoneEntity> getPersonPhones(long personId) {
        return phoneRepository.getPhonesByPersonId(personId);
    }

    public List<AddressEntity> getPersonAddresses(long personId) {
        return addressRepository.getAddressesByPersonId(personId);
    }

    public List<EmailEntity> getPersonEmails(long personId) {
        return emailRepository.getEmailsByPersonId(personId);
    }

    public List<AccountEntity> getUserAccounts(long userProfileId) {
        UserProfileEntity userProfile = new UserProfileEntity();
        userProfile.setId(userProfileId);
        return accountRepository.findByUserProfile(userProfile);
    }

    public UserProfileEntity getUserProfileById(long userProfileId) {
        return userProfileRepository.findOne(userProfileId);
    }

    public RibbonMixAccountEntity getRibbonMixAccountByUserProfileId(long userProfileId) {
        return ribbonMixAccountRepository.findOneByUserProfileId(userProfileId);
    }
}

