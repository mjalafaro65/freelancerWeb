package com.firstsite.freelancerWeb;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="account")

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(

            nullable = false
    )
    private String firstname;
    private String lastname;


    @Email(message = "Invalid email format")
    @Column(unique = true)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
    private LocalDateTime createdAt = LocalDateTime.now();



}

