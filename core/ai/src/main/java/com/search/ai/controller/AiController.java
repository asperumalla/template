package com.search.ai.controller;

import com.search.ai.domain.ChatResponse;
import com.search.ai.service.AiService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@AllArgsConstructor
public class AiController {

    private final AiService aiService;

    @GetMapping("/ai/chat")
    public ResponseEntity<ChatResponse> chat (@RequestParam(name = "prompt", required = false, defaultValue = "") String prompt) {
        if (prompt.isEmpty()) return ResponseEntity.ok(ChatResponse.of("You may not send an empty prompt"));
        return ResponseEntity.ok(aiService.respondToChat(prompt));
    }

    @GetMapping(value = "/ai/stream", produces = "text/event-stream")
    public Flux<String> streamChat (@RequestParam(name = "prompt", required = false, defaultValue = "") String prompt) {
        log.info("returning data for prompt: {}", prompt);
        return aiService.streamChatResponse(prompt)
                .doOnNext( chunk -> log.info( "chunk : {}", chunk))
                .doOnComplete(() -> log.info("Completed Streaming"));
    }
}
