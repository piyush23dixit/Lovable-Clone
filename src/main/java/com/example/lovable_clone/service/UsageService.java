package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.subscription.PlanLimitResponse;
import com.example.lovable_clone.dto.subscription.UsageTodayResponse;

public interface UsageService {
    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
