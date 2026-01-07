package com.example.lovable_clone.dto.project;

import java.time.Instant;

public record FIleNode(
        String path,
        Instant modified,
        String type,
        Long size
) {
}
