package com.vibe_studio.vibe_studio.dto.member;

import com.vibe_studio.vibe_studio.enums.ProjectRole;
import jakarta.validation.constraints.NotNull;

public record UpdateMemberRoleRequest(
        @NotNull ProjectRole role) {
}
