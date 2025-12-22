package com.example.lovable_clone.entity;

import com.example.lovable_clone.enums.PreviewStatus;
import jakarta.persistence.Entity;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {

    Long id;

    String namespace;

    Project project;

    PreviewStatus status;

    String podName;

    String previewUrl;

    Instant createdAt;

    Instant startedAt;

    Instant terminatedAt;





}
