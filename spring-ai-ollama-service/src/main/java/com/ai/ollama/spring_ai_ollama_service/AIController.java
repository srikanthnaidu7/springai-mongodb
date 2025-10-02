package com.ai.ollama.spring_ai_ollama_service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AIController {

    private ChatClient chatClient;

    public AIController(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    @GetMapping("/chat")
    public ResponseEntity<String> getMessage(@RequestParam(value = "message") String message){

        String content = chatClient.prompt(message).call().content();
        return ResponseEntity.ok(content);
    }
}
