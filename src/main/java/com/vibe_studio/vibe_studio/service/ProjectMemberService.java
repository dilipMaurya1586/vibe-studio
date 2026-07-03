package com.vibe_studio.vibe_studio.service;


import com.vibe_studio.vibe_studio.dto.member.InviteMemberRequest;
import com.vibe_studio.vibe_studio.dto.member.MemberResponse;
import com.vibe_studio.vibe_studio.dto.member.UpdateMemberRoleRequest;
import com.vibe_studio.vibe_studio.entity.ProjectMember;


import java.util.List;

public interface ProjectMemberService {
    List<MemberResponse> getProjectMembers(Long projectId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request);

    void removeProjectMember(Long projectId, Long memberId);
}
