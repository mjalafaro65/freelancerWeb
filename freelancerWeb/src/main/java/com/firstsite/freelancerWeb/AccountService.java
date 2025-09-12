package com.firstsite.freelancerWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRep accountRep;

    private BCryptPasswordEncoder passwrdEncoder=new BCryptPasswordEncoder();

    public Account register(Account account){
        if(accountRep.existsByEmail(account.getEmail())){
            throw new RuntimeException("email exists");
        }
        account.setPassword(passwrdEncoder.encode(account.getPassword()));

        return accountRep.save(account);
    }


}
