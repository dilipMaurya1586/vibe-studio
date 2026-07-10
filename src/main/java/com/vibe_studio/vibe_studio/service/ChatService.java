package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.chat.ChatResponse;

import java.util.List;

public interface ChatService {

    List<ChatResponse> getProjectChatHistory(Long projectId);
}
