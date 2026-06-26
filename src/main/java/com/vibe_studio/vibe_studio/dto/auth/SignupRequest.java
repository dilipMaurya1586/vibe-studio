package com.vibe_studio.vibe_studio.dto.auth;

public record SignupRequest(
        String email,
        String name,
        String password
) {
}
