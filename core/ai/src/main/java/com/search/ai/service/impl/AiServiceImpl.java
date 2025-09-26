package com.search.ai.service.impl;

import com.search.ai.domain.ChatResponse;
import com.search.ai.service.AiService;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.extern.slf4j.Slf4j;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Slf4j
@Service
@AllArgsConstructor
public class AiServiceImpl implements AiService {

    private final ChatClient chatClient;

    @Override
    public @NonNull ChatResponse respondToChat (@NonNull String prompt) {
        return ChatResponse.of(chatClient.prompt(prompt).call().content());
    }

    @Override
    public @NonNull Flux<String> streamChatResponse (@NonNull String prompt) {
        return chatClient.prompt().user(prompt).stream().content();
    }
}
