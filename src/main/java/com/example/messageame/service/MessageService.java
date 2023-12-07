package com.example.messageame.service;

import com.example.messageame.model.Message;
import com.example.messageame.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAllMessages() {
        return messageRepository.findAll();
    }

    public Message sendMessage(Message message) {
        message.setTimestamp(LocalDateTime.now());
        return messageRepository.save(message);
    }
}