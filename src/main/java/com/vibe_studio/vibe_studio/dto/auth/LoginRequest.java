package com.vibe_studio.vibe_studio.dto.auth;

public record LoginRequest(
        String email,
        String password
) {
}
