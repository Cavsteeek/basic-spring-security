package com.cavsteek.basic.spring.security.services.impl;

import com.cavsteek.basic.spring.security.dto.SignUpRequest;
import com.cavsteek.basic.spring.security.entities.Role;
import com.cavsteek.basic.spring.security.entities.User;
import com.cavsteek.basic.spring.security.repository.UserRepository;
import com.cavsteek.basic.spring.security.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public User signup(SignUpRequest signUpRequest){
        User user = new User();
        user.setEmail(signUpRequest.getEmail());
        user.setFirstname(signUpRequest.getFirstName());
        user.setSecondname(signUpRequest.getLastName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));

        return userRepository.save(user);
    }
}
