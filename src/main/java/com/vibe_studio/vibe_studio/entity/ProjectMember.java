package com.vibe_studio.vibe_studio.entity;

import com.vibe_studio.vibe_studio.enums.ProjectRole;

import java.time.Instant;

public class ProjectMember {

    ProjectMemberId id;
    Project project;
    User user;
    ProjectRole projectRole;
    Instant invitedAt;
    Instant acceptedAt;
}
