package com.rest_api.rest_api.interfaces;

import com.rest_api.rest_api.entity.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConversationRepository extends JpaRepository<Conversation, Integer> {
    List<Conversation> findByUserSender(Integer userSender);
}
