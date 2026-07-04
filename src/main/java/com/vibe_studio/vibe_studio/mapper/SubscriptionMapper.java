package com.vibe_studio.vibe_studio.mapper;

import com.vibe_studio.vibe_studio.dto.subscription.PlanResponse;
import com.vibe_studio.vibe_studio.dto.subscription.SubscriptionResponse;
import com.vibe_studio.vibe_studio.entity.Plan;
import com.vibe_studio.vibe_studio.entity.Subscription;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SubscriptionMapper {

    SubscriptionResponse toSubscriptionResponse(Subscription subscription);

    PlanResponse toPlanResponse(Plan plan);
}
