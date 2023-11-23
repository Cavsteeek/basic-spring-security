package com.cavsteek.basic.spring.security.services;

import com.cavsteek.basic.spring.security.dto.JwtAuthenticationResponse;
import com.cavsteek.basic.spring.security.dto.RefreshTokenRequest;
import com.cavsteek.basic.spring.security.dto.SignUpRequest;
import com.cavsteek.basic.spring.security.dto.SigninRequest;
import com.cavsteek.basic.spring.security.entities.User;

public interface AuthenticationService {
    User signup (SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
