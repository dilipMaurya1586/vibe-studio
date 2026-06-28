package com.vibe_studio.vibe_studio.repository;

import com.vibe_studio.vibe_studio.entity.ProjectMember;
import com.vibe_studio.vibe_studio.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {
}
