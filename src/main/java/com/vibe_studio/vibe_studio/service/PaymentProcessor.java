package com.vibe_studio.vibe_studio.service;

import com.stripe.model.StripeObject;
import com.vibe_studio.vibe_studio.dto.subscription.CheckoutRequest;
import com.vibe_studio.vibe_studio.dto.subscription.CheckoutResponse;
import com.vibe_studio.vibe_studio.dto.subscription.PortalResponse;

import java.util.Map;

public interface PaymentProcessor {

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request);

    PortalResponse openCustomerPortal();

    void handleWebhookEvent(String type, StripeObject stripeObject, Map<String, String> metadata);
}
