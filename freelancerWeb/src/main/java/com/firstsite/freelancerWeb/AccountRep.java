package com.firstsite.freelancerWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface AccountRep extends JpaRepository<Account,Integer> {
    Optional<Account> findByEmail(String email);
    boolean existsByEmail(String email);



}
