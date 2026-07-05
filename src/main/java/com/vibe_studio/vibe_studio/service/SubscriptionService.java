package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.subscription.CheckoutRequest;
import com.vibe_studio.vibe_studio.dto.subscription.CheckoutResponse;
import com.vibe_studio.vibe_studio.dto.subscription.PortalResponse;
import com.vibe_studio.vibe_studio.dto.subscription.SubscriptionResponse;
import com.vibe_studio.vibe_studio.enums.SubscriptionStatus;

import java.time.Instant;

public interface SubscriptionService {
    SubscriptionResponse getCurrentSubscription();

    void activateSubscription(Long userId, Long planId, String subscriptionId, String customerId);

    void updateSubscription(String gatewaySubscriptionId, SubscriptionStatus status, Instant periodStart, Instant periodEnd, Boolean cancelAtPeriodEnd, Long planId);

    void cancelSubscription(String gatewaySubscriptionId);

    void renewSubscriptionPeriod(String subId, Instant periodStart, Instant periodEnd);

    void markSubscriptionPastDue(String subId);

    boolean canCreateNewProject();
}
