package com.example.click.me.repository;

import com.example.click.me.domain.JokesButton;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JokesButtonRepository extends JpaRepository<JokesButton,Integer> { }
