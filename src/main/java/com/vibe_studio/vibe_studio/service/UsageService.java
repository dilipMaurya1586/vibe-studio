package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.subscription.PlanLimitsResponse;
import com.vibe_studio.vibe_studio.dto.subscription.UsageTodayResponse;

import org.jspecify.annotations.Nullable;

public interface UsageService {
    void recordTokenUsage(Long userId, int actualTokens);
    void checkDailyTokensUsage();
<<<<<<< HEAD

    PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId);

    UsageTodayResponse getTodayUsageOfUser(Long userId);
=======
>>>>>>> 59723193f0c72b406bce43a6b9fdd3ce1bb40ef3
}
