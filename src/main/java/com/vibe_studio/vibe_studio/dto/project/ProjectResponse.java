package com.vibe_studio.vibe_studio.dto.project;

import com.vibe_studio.vibe_studio.dto.auth.UserProfileResponse;

import java.time.Instant;

public record ProjectResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        UserProfileResponse owner
) {
}
