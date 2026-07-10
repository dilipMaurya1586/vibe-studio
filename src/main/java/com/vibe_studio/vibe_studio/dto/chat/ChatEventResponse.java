package com.vibe_studio.vibe_studio.dto.chat;

import com.vibe_studio.vibe_studio.enums.ChatEventType;

public record ChatEventResponse(
        Long id,
        ChatEventType type,
        Integer sequenceOrder,
        String content,
        String filePath,
        String metadata
) {
}
