package com.vibe_studio.vibe_studio.dto.project;

import com.vibe_studio.vibe_studio.enums.ProjectRole;

import java.time.Instant;

public record ProjectSummaryResponse(
        Long id,
        String name,
        Instant createdAt,
        Instant updatedAt,
        ProjectRole role
) {

}
