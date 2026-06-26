package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.subscription.PlanResponse;

import java.util.List;

public interface PlanService {

    List<PlanResponse> getAllActivePlans();
}
