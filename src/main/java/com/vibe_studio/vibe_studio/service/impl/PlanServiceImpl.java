package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.subscription.PlanResponse;
import com.vibe_studio.vibe_studio.service.PlanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanServiceImpl implements PlanService {

    @Override
    public List<PlanResponse> getAllActivePlans() {
        return List.of();
    }
}
