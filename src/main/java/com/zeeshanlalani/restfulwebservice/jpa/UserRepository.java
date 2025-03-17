package com.zeeshanlalani.restfulwebservice.jpa;

import com.zeeshanlalani.restfulwebservice.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
