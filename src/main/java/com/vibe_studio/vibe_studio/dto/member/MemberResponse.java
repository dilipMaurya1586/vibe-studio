package com.vibe_studio.vibe_studio.dto.member;

import com.vibe_studio.vibe_studio.enums.ProjectRole;
import java.time.Instant;

public record MemberResponse(
        Long userId,
        String email,
        String name,
        String avatarUrl,
        ProjectRole role,
        Instant invitedAt
) {
}
