package com.example.click.me.service;

import com.example.click.me.domain.*;
import com.example.click.me.domain.ButtonPhrases;
import com.example.click.me.repository.*;
import com.example.click.me.repository.ClickedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClickMeServiceImpl implements ClickMeService {

    @Autowired
    ClickedRepository clickedRepository;

    @Autowired
    ButtonRepository buttonRepository;

    @Autowired
    RatingRepository ratingRepository;

    @Autowired
    ButtonTypeRepository buttonTypeRepository;

    @Autowired
    ButtonOfTypeRepository buttonOfTypeRepository;

    @Autowired
    ButtonPhrasesRepository buttonPhrasesRepository;

    @Autowired
    JokesButtonRepository jokesButtonRepository;

    @Autowired
    SaveRatingRepository saveRatingRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public ArrayList<Clicked> getAllClicksByButtonId(int buttonId) {
        return (ArrayList<Clicked>) this.clickedRepository.findByButtonId(buttonId,Sort.by(Sort.Direction.ASC, "clickedId"));
    }

    @Override
    public ArrayList<Clicked> findAllClicked() {
        return (ArrayList<Clicked>) this.clickedRepository.findAll(Sort.by(Sort.Direction.ASC, "clickedId"));
    }

    @Override
    public void addClick(Clicked clicked) {
        this.clickedRepository.save(clicked);
    }

    @Override
    public ArrayList<Button> getButtons() {
        return (ArrayList<Button>) buttonRepository.findAll();
    }

    @Override
    public ArrayList<Rating> findAllRatings() {
        return (ArrayList<Rating>) this.ratingRepository.findAll();
    }

    @Override
    public ArrayList<ButtonType> findAllButtonTypes() {
        return (ArrayList<ButtonType>) this.buttonTypeRepository.findAll(Sort.by(Sort.Direction.ASC, "buttonTypeId"));
    }

    @Override
    public ArrayList<ButtonOfType> findAllButtonOfType() {
        return (ArrayList<ButtonOfType>) this.buttonOfTypeRepository.findAll();
    }

    @Override
    public ArrayList<ButtonPhrases> getButtonPhrases() {

        return (ArrayList<ButtonPhrases>) this.buttonPhrasesRepository.findAll();
    }

    @Override
    public Optional<ButtonPhrases> getButtonById(int buttonId) {
        Integer buttonIdInteger = Integer.valueOf(buttonId);

        return this.buttonPhrasesRepository.findById(buttonIdInteger);
    }

    @Override
    public Optional<JokesButton> getAllJokesByButtonID(int buttonId) {
        Integer buttonIdInteger = Integer.valueOf(buttonId);

        return this.jokesButtonRepository.findById(buttonIdInteger);
    }

    @Override
    public Optional<String> saveRating(SaveRating rating) {
        this.saveRatingRepository.save(rating);
        return Optional.of("Rating saved id: " + rating.getRatingId());
    }

    @Override
    public Optional<Double> getRatingAverageByButtonId(int buttonId) {
        Button button = this.buttonRepository.findByButtonId(buttonId);
        List<Rating> ratings = button.getRatings();
        double ratingAverage = 0;

        for (Rating rating: ratings) { ratingAverage += rating.getRatingValue(); }

        return Optional.ofNullable(Double.valueOf(ratingAverage / ratings.size()));
    }

    @Override
    public Optional<List<User>> getAllUsers() {
        List<User> users = this.userRepository.findAll();
        return Optional.ofNullable(users);
    }

    @Override
    public void registerUser(User user) {
        this.userRepository.save(user);
    }
}