package com.vibe_studio.vibe_studio.service;

import com.vibe_studio.vibe_studio.dto.chat.StreamResponse;
import reactor.core.publisher.Flux;

public interface AiGenerationService {
    Flux<StreamResponse> streamResponse(String message, Long projectId);
}
