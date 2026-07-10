package com.vibe_studio.vibe_studio.repository;

import com.vibe_studio.vibe_studio.entity.ChatEvent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatEventRepository extends JpaRepository<ChatEvent, Long> {
}
