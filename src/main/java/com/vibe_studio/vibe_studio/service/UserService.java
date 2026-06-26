package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.auth.UserProfileResponse;

public interface UserService {

    UserProfileResponse getProfile(Long userId);
}
