package com.learnspringboot.restfulwebapi.jpa;

import com.learnspringboot.restfulwebapi.webservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
