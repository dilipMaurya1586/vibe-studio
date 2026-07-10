package com.vibe_studio.vibe_studio.mapper;

import com.vibe_studio.vibe_studio.dto.chat.ChatResponse;
import com.vibe_studio.vibe_studio.entity.ChatMessage;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ChatMapper {

    List<ChatResponse> fromListOfChatMessage(List<ChatMessage> chatMessageList);
}

