package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.subscription.PlanLimitsResponse;
import com.vibe_studio.vibe_studio.dto.subscription.UsageTodayResponse;

public interface UsageService {

    UsageTodayResponse getTodayUsageOfUser(Long userId);

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
