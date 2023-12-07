package com.example.messageame.controllers;

import com.example.messageame.model.Message;
import com.example.messageame.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.sendMessage(message);
    }
}
