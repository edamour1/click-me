package com.example.click.me.repository;

import com.example.click.me.domain.SaveRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaveRatingRepository extends JpaRepository<SaveRating,Integer> { }
