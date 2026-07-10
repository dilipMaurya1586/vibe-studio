package com.vibe_studio.vibe_studio.service.impl;

import com.vibe_studio.vibe_studio.dto.chat.ChatResponse;
import com.vibe_studio.vibe_studio.entity.ChatMessage;
import com.vibe_studio.vibe_studio.entity.ChatSession;
import com.vibe_studio.vibe_studio.entity.ChatSessionId;
import com.vibe_studio.vibe_studio.mapper.ChatMapper;
import com.vibe_studio.vibe_studio.repository.ChatMessageRepository;
import com.vibe_studio.vibe_studio.repository.ChatSessionRepository;
import com.vibe_studio.vibe_studio.security.AuthUtil;
import com.vibe_studio.vibe_studio.service.ChatService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChatServiceImpl implements ChatService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatSessionRepository chatSessionRepository;
    private final AuthUtil authUtil;
    private final ChatMapper chatMapper;

    @Override
    public List<ChatResponse> getProjectChatHistory(Long projectId) {
        Long userId = authUtil.getCurrentUserId();

        ChatSession chatSession = chatSessionRepository.getReferenceById(
                new ChatSessionId(projectId, userId)
        );

        List<ChatMessage> chatMessageList = chatMessageRepository.findByChatSession(chatSession);

        return chatMapper.fromListOfChatMessage(chatMessageList);
    }
}
