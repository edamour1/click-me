package com.example.click.me.repository;

import com.example.click.me.domain.Phrases;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhrasesRepository extends JpaRepository<Phrases,Integer> { }
