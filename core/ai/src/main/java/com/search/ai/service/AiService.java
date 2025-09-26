package com.search.ai.service;

import com.search.ai.domain.ChatResponse;
import lombok.NonNull;
import reactor.core.publisher.Flux;

public interface AiService {

    @NonNull
    public ChatResponse respondToChat(@NonNull String prompt);

    @NonNull
    public Flux<String> streamChatResponse(@NonNull String prompt);
}
