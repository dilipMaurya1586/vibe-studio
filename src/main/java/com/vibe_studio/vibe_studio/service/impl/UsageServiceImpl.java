package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.subscription.PlanLimitsResponse;
import com.vibe_studio.vibe_studio.dto.subscription.UsageTodayResponse;
import com.vibe_studio.vibe_studio.service.UsageService;
import org.springframework.stereotype.Service;

@Service
public class UsageServiceImpl implements UsageService {

    @Override
    public UsageTodayResponse getTodayUsageOfUser(Long userId) {
        return null;
    }

    @Override
    public PlanLimitsResponse getCurrentSubscriptionLimitsOfUser(Long userId) {
        return null;
    }
}
