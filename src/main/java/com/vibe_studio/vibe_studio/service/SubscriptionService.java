package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.subscription.CheckoutRequest;
import com.vibe_studio.vibe_studio.dto.subscription.CheckoutResponse;
import com.vibe_studio.vibe_studio.dto.subscription.PortalResponse;
import com.vibe_studio.vibe_studio.dto.subscription.SubscriptionResponse;

public interface SubscriptionService {

    SubscriptionResponse getCurrentSubscription(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);

    PortalResponse openCustomerPortal(Long userId);
}
