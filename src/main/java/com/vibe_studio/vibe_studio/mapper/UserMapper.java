package com.vibe_studio.vibe_studio.mapper;

import com.vibe_studio.vibe_studio.dto.auth.SignupRequest;
import com.vibe_studio.vibe_studio.dto.auth.UserProfileResponse;
import com.vibe_studio.vibe_studio.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toEntity(SignupRequest signupRequest);

    UserProfileResponse toUserProfileResponse(User user);

}