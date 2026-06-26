package com.vibe_studio.vibe_studio.service;


import com.vibe_studio.vibe_studio.dto.member.InviteMemberRequest;
import com.vibe_studio.vibe_studio.dto.member.MemberResponse;
import com.vibe_studio.vibe_studio.entity.ProjectMember;


import java.util.List;

public interface ProjectMemberService {

    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, InviteMemberRequest request, Long userId);

    MemberResponse deleteProjectMember(Long projectId, Long memberId, Long userId);
}
