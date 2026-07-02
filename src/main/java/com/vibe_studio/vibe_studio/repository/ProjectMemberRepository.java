package com.vibe_studio.vibe_studio.repository;

import com.vibe_studio.vibe_studio.entity.ProjectMember;
import com.vibe_studio.vibe_studio.entity.ProjectMemberId;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectMemberRepository extends JpaRepository<ProjectMember, ProjectMemberId> {
    List<ProjectMember> findByProjectId(Long projectId);

}
