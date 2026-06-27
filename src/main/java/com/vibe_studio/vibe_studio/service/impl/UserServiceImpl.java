package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.auth.UserProfileResponse;
import com.vibe_studio.vibe_studio.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserProfileResponse getProfile(Long userId) {
        return null;
    }
}
