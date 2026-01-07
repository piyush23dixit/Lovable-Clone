package com.example.lovable_clone.controller;

import com.example.lovable_clone.dto.subscription.*;
import com.example.lovable_clone.service.PlanService;
import com.example.lovable_clone.service.SubscriptionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class BillingController {

    private final PlanService planService;
    private final SubscriptionService subscriptionService;

    @GetMapping("/api/plans")
    public ResponseEntity<List<PlanResponse>> getAllActivePlans(){
        return ResponseEntity.ok(planService.getAllActivePlan());
    }

    @GetMapping("/api/me/subscription")
    public ResponseEntity<SubscriptionResponse> getCurrentSubscription(){
        Long usedId=1L;
        return ResponseEntity.ok(subscriptionService.getCurrentSubscription(usedId));
    }
    @PostMapping("/api/stripe/checkout")
    public ResponseEntity<CheckoutResponse> createCheckoutResponse(
            @RequestBody CheckoutRequest request
    ){
        Long usedId=1L;
        return ResponseEntity.ok(subscriptionService.createCheckoutSessionUrl(request,usedId));

    }

    @PostMapping("api/stripe/portal")
    public ResponseEntity<PortalResponse> openCustomerPortal(){
        Long usedId=1L;
        return ResponseEntity.ok(subscriptionService.openCustomerPortal(usedId));


    }
}
