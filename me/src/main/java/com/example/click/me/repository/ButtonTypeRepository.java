package com.example.click.me.repository;

import com.example.click.me.domain.ButtonType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonTypeRepository extends JpaRepository<ButtonType,Integer> {
}
