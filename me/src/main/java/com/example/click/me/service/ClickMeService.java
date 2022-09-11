package com.example.click.me.service;

import com.example.click.me.domain.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public interface ClickMeService {
    public ArrayList<Clicked> getAllClicksByButtonId(int buttonId);
    public ArrayList<Clicked> findAllClicked();
    public void addClick(Clicked clicked);
    public ArrayList<Button> getButtons();
    public ArrayList<Rating> findAllRatings();
    public ArrayList<ButtonType> findAllButtonTypes();
    public ArrayList<ButtonOfType> findAllButtonOfType();
    public ArrayList<ButtonPhrases> getButtonPhrases();
    public Optional<ButtonPhrases> getButtonById(int buttonId);
    public Optional<JokesButton> getAllJokesByButtonID(int buttonId);
    public Optional<String> saveRating(SaveRating rating);
    public Optional<Double> getRatingAverageByButtonId(int buttonId);
    public Optional<List<User>> getAllUsers();
    public void registerUser(User user);
    //public Optional<User> getUser(){}
}
