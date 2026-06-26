package com.vibe_studio.vibe_studio.dto.member;

import com.vibe_studio.vibe_studio.enums.ProjectRole;

public record InviteMemberRequest(
        String email,
        ProjectRole role
) {
}
