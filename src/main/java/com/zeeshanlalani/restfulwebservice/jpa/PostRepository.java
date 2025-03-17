package com.zeeshanlalani.restfulwebservice.jpa;

import com.zeeshanlalani.restfulwebservice.user.Post;
import com.zeeshanlalani.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
