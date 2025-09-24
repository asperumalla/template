package com.search.ai.service.impl;

import com.search.ai.domain.ChatResponse;
import com.search.ai.service.AiService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AiServiceImpl implements AiService {

    private final ChatClient chatClient;

    @Override
    public @NonNull ChatResponse respondToChat (@NonNull String prompt) {
        return ChatResponse.of(chatClient.prompt(prompt).call().content());
    }
}
