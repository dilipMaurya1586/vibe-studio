package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.subscription.CheckoutRequest;
import com.vibe_studio.vibe_studio.dto.subscription.CheckoutResponse;
import com.vibe_studio.vibe_studio.dto.subscription.PortalResponse;
import com.vibe_studio.vibe_studio.dto.subscription.SubscriptionResponse;
import com.vibe_studio.vibe_studio.service.SubscriptionService;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Override
    public SubscriptionResponse getCurrentSubscription(Long userId) {
        return null;
    }

    @Override
    public CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId) {
        return null;
    }

    @Override
    public PortalResponse openCustomerPortal(Long userId) {
        return null;
    }
}
