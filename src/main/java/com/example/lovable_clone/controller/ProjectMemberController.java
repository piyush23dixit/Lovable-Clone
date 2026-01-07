package com.example.lovable_clone.controller;

import com.example.lovable_clone.dto.member.InviteMemberRequest;
import com.example.lovable_clone.dto.member.MemberResponse;
import com.example.lovable_clone.dto.member.UpdateMemberRoleRequest;
import com.example.lovable_clone.entity.ProjectMember;
import com.example.lovable_clone.service.ProjectMemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/members")
public class ProjectMemberController {

    private final ProjectMemberService projectMemberService;


    @GetMapping
    public ResponseEntity<List<ProjectMember>> getProjectMembers(@PathVariable long projectId){
        Long userId =1L;
        return ResponseEntity.ok(projectMemberService.getProjectMembers(projectId,userId));
    }

    @PostMapping
    public ResponseEntity<MemberResponse> invitemember(
            @PathVariable Long projectId,
            @RequestBody InviteMemberRequest request){
        Long userId =1L;
        return ResponseEntity.ok(projectMemberService.inviteMember(projectId,request,userId));
    }

    @PatchMapping("/memberId")
    public ResponseEntity<MemberResponse> updatememberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId,
            @RequestBody UpdateMemberRoleRequest request){
        Long userId =1L;
        return  ResponseEntity.ok(projectMemberService.updateMemberRole(projectId,memberId,request,userId));

    }

    @DeleteMapping("/memberId")
    public ResponseEntity<MemberResponse> deletememberRole(
            @PathVariable Long projectId,
            @PathVariable Long memberId){
        Long userId =1L;
        return  ResponseEntity.ok(projectMemberService.deleteMemberRole(projectId,memberId,userId));

    }







}
