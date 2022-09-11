package com.example.click.me.repository;

import com.example.click.me.domain.Clicked;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ClickedRepository extends JpaRepository<Clicked,Long>
{
    List<Clicked> findByButtonId(int buttonId, Sort sort);
}
