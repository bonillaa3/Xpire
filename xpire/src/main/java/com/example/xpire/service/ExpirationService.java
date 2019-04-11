package com.example.xpire.service;

import com.example.xpire.model.Expiration;
import com.example.xpire.repo.ExpirationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpirationService {

    @Autowired
    private ExpirationRepository expirationRepository;

    public Expiration saveExp(Expiration expiration){
        return expirationRepository.save(expiration);
    }
}
