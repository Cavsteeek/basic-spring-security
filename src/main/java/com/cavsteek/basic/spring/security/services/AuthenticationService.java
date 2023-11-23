package com.cavsteek.basic.spring.security.services;

import com.cavsteek.basic.spring.security.dto.SignUpRequest;
import com.cavsteek.basic.spring.security.entities.User;

public interface AuthenticationService {
    User signup (SignUpRequest signUpRequest);
}
