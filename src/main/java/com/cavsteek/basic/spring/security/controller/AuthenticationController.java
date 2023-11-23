package com.cavsteek.basic.spring.security.controller;

import com.cavsteek.basic.spring.security.dto.JwtAuthenticationResponse;
import com.cavsteek.basic.spring.security.dto.RefreshTokenRequest;
import com.cavsteek.basic.spring.security.dto.SignUpRequest;
import com.cavsteek.basic.spring.security.dto.SigninRequest;
import com.cavsteek.basic.spring.security.entities.User;
import com.cavsteek.basic.spring.security.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok (authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok (authenticationService.refreshToken(refreshTokenRequest));
    }
}
