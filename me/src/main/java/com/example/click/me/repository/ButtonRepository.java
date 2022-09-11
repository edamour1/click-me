package com.example.click.me.repository;

import com.example.click.me.domain.Button;
import com.example.click.me.domain.Clicked;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ButtonRepository extends JpaRepository<Button,Integer> {
    Button findByButtonId(int buttonId);
}
