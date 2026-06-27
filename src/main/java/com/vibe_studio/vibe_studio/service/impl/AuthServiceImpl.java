package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.auth.AuthResponse;
import com.vibe_studio.vibe_studio.dto.auth.LoginRequest;
import com.vibe_studio.vibe_studio.dto.auth.SignupRequest;
import com.vibe_studio.vibe_studio.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse signup(SignupRequest request) {
        return null;
    }

    @Override
    public AuthResponse login(LoginRequest request) {
        return null;
    }
}
