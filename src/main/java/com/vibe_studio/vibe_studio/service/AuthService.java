package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.auth.AuthResponse;
import com.vibe_studio.vibe_studio.dto.auth.LoginRequest;
import com.vibe_studio.vibe_studio.dto.auth.SignupRequest;

public interface AuthService {

    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
