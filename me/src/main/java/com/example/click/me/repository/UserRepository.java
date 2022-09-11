package com.example.click.me.repository;

import com.example.click.me.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {
    public List<User> findByUsernameAndPassword(String username, String password);
}