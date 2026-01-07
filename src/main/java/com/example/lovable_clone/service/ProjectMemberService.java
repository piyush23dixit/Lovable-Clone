package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.member.InviteMemberRequest;
import com.example.lovable_clone.dto.member.MemberResponse;
import com.example.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.example.lovable_clone.entity.ProjectMember;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(long projectId, Long userId);

    MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);

    MemberResponse updateMemberRole(Long projectId, Long memberId, UpdateMemberRoleRequest request, Long userId);

    MemberResponse deleteMemberRole(Long projectId, Long memberId, Long userId);
}
