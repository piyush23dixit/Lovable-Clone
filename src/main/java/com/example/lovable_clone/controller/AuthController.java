package com.example.lovable_clone.controller;


import com.example.lovable_clone.service.AuthService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/auth/sign")
public class AuthController {

    private final AuthService authService;
}
