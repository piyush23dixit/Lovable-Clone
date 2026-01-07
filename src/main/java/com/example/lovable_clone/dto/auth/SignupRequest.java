package com.example.lovable_clone.dto.auth;

public record SignupRequest(
        String name,
        String email,
        String password
) {
}
