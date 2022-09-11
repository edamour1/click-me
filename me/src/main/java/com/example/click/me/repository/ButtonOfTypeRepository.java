package com.example.click.me.repository;

import com.example.click.me.domain.ButtonOfType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonOfTypeRepository extends JpaRepository<ButtonOfType,Integer> {
}
