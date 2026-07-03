package com.vibe_studio.vibe_studio.security;


import java.util.List;

import org.springframework.security.core.GrantedAuthority;

public record JwtUserPrincipal(
        Long userId,
        String username,
        List<GrantedAuthority> authorities
) {
}
