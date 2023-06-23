package com.learnspringboot.restfulwebapi.jpa;

import com.learnspringboot.restfulwebapi.webservice.post.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
