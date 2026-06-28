package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.member.InviteMemberRequest;
import com.vibe_studio.vibe_studio.dto.member.MemberResponse;
import com.vibe_studio.vibe_studio.dto.member.UpdateMemberRoleRequest;
import com.vibe_studio.vibe_studio.repository.ProjectMemberRepository;
import com.vibe_studio.vibe_studio.service.ProjectMemberService;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)

public class ProjectMemberServiceImpl implements ProjectMemberService {

    ProjectMemberRepository projectMemberRepository;

    @Override
    public List<MemberResponse> getProjectMembers(Long projectId, Long userId) {

        return List.of();

    }

    @Override
    public MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId) {
        return null;
    }

    @Override
    public MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId) {
        return null;
    }
}
