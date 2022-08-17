package com.rest_api.rest_api.interfaces;

import com.rest_api.rest_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
