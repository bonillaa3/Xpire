package com.example.xpire.controller;

import com.example.xpire.model.Expiration;
import com.example.xpire.service.ExpirationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/exp")
public class ExpirationController {

    @Autowired
    private ExpirationService expirationService;

    @PutMapping("/{expId}")
    public ResponseEntity<Expiration> createOrUpdateExpiration(@PathVariable long expId, @RequestBody Expiration expiration){
        try{
            expirationService.saveExp(expiration);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(expiration, HttpStatus.ACCEPTED);
    }
}
