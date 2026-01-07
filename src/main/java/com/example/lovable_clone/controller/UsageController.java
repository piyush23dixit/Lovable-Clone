package com.example.lovable_clone.controller;

import com.example.lovable_clone.service.UsageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestControllers
@RequiredArgsConstructor
@RequestMapping("/auth/usage")
public class UsageController {

    private final UsageService  usageService;
}

