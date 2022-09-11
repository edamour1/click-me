package com.example.click.me.Controller;

import com.example.click.me.domain.*;
import com.example.click.me.service.ClickMeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/click")
public class ClickMeController {

    @Autowired
    ClickMeServiceImpl clickMeServiceImpl;

    @GetMapping("/getClicks")
    public ArrayList<Clicked> getClicks()
    {
        return  this.clickMeServiceImpl.findAllClicked();
    }

    @PostMapping("/me")
    public void addClick(@RequestBody Clicked clicked)
    {
        System.out.println(clicked.toString());
        this.clickMeServiceImpl.addClick(clicked);
    }

    @GetMapping("/getButtons")
    public ArrayList<Button> getButtons()
    {
        return this.clickMeServiceImpl.getButtons();
    }

    @GetMapping("/getRatings")
    public ArrayList<Rating> getRatings()
    {
        return this.clickMeServiceImpl.findAllRatings();
    }

    @GetMapping("/getButtonTypes")
    public ArrayList<ButtonType> getButtonTypes()
    {
        return this.clickMeServiceImpl.findAllButtonTypes();
    }

    @GetMapping("/getButtonsOfTypes")
    public ArrayList<ButtonOfType> getButtonsOfTypes()
    {
        return this.clickMeServiceImpl.findAllButtonOfType();
    }

    @GetMapping("/getButtonPhrases")
    public ArrayList<ButtonPhrases> getButtonPhrases()
    {
        return this.clickMeServiceImpl.getButtonPhrases();
    }

    @GetMapping("/getButtonById/{buttonId}")
    public Optional<ButtonPhrases> getButtonById(@PathVariable(value="buttonId") int buttonId)
    {
        return this.clickMeServiceImpl.getButtonById(buttonId);
    }

    @GetMapping("/getAllJokesByButtonID/{buttonId}")
    public Optional<JokesButton>  getAllJokesByButtonID(@PathVariable(value="buttonId") int buttonId)
    {
        System.out.println("buttonId: "+buttonId);
        return this.clickMeServiceImpl.getAllJokesByButtonID(buttonId);
    }

    @GetMapping("/getAllClicksByButtonId/{buttonId}")
    public ArrayList<Clicked> getAllClicksByButtonId(@PathVariable(value="buttonId")int buttonId)
    {
        return this.clickMeServiceImpl.getAllClicksByButtonId(buttonId);
    }

    @PostMapping("/saveRating")
    public Optional<String> saveRating(@RequestBody SaveRating rating)
    {
        System.out.println(rating.toString());
        return this.clickMeServiceImpl.saveRating(rating);
    }

    @GetMapping("/getRatingAverageByButtonId")
    public Optional<Double> getRatingAverageByButtonId(@RequestParam int buttonId)
    {
        return this.clickMeServiceImpl.getRatingAverageByButtonId(buttonId);
    }

    @PostMapping("/registerUser")
    public void registerUser(@RequestBody User user) {
        this.clickMeServiceImpl.registerUser(user);
    }
}
