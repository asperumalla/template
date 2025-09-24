package com.search.ai.service;

import com.search.ai.domain.ChatResponse;
import lombok.NonNull;

public interface AiService {

    @NonNull
    public ChatResponse respondToChat(@NonNull String prompt);
}
