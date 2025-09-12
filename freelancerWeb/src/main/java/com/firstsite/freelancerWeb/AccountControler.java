package com.firstsite.freelancerWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountControler {


    @Autowired
    private AccountService accountServ;


    @PostMapping("/sign_up")
    public ResponseEntity<Account> postAccounts(@RequestBody Account account ){
        Account saved=accountServ.register(account);
        return ResponseEntity.status(201).body(saved);
    }

    @GetMapping("/sing_in")
    public ResponseEntity<Account> signInAccount(@RequestBody SignInReq request){
        Account saved=accountServ.signIn(request);
        return ResponseEntity.status(201).body(saved);

    }






}
