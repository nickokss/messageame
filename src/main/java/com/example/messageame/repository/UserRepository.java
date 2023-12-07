package com.example.messageame.repository;

import com.example.messageame.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // Puedes añadir consultas personalizadas aquí si es necesario
}