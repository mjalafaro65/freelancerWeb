package com.firstsite.freelancerWeb;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInReq {
   private String email;
   private String password;
}
