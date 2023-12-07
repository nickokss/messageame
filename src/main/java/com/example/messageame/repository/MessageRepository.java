package com.example.messageame.repository;

import com.example.messageame.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    // Puedes añadir consultas personalizadas aquí si es necesario
}