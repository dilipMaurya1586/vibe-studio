package com.vibe_studio.vibe_studio.repository;

import com.vibe_studio.vibe_studio.entity.ChatSession;
import com.vibe_studio.vibe_studio.entity.ChatSessionId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatSessionRepository extends JpaRepository<ChatSession, ChatSessionId> {
}

