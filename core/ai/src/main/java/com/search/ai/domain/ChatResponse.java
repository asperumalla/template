package com.search.ai.domain;

import lombok.Value;

@Value(staticConstructor = "of")
public class ChatResponse {
    String response;
}
