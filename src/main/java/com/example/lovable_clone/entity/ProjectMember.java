package com.example.lovable_clone.entity;

import com.example.lovable_clone.enums.ProjectRole;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.Instant;


@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {

    ProjectMemberId id;

    User user;

    Project project;

    ProjectRole projectRole;

    Long invitedBy;

    Instant invitedAt;

    Instant acceptedAt;
}
