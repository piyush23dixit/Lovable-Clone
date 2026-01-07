package com.example.lovable_clone.service;

import com.example.lovable_clone.dto.subscription.CheckoutRequest;
import com.example.lovable_clone.dto.subscription.CheckoutResponse;
import com.example.lovable_clone.dto.subscription.PortalResponse;
import com.example.lovable_clone.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription(Long usedId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long usedId);

    PortalResponse openCustomerPortal(Long usedId);
}

