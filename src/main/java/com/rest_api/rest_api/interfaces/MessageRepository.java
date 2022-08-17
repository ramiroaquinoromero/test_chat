package com.rest_api.rest_api.interfaces;

import com.rest_api.rest_api.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
