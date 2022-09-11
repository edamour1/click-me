package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "buttons")
public class Button {

    @Id
    @Column(name="button_id")
    private int buttonId;

    @Column(name="button_image_src")
    private String buttonImageSrc;

    @Column(name="button_sound_src")
    private String buttonSoundSrc;

    @OneToMany(mappedBy = "button")
    private List<Rating> ratings;

    public Button(){}

    public Button(int buttonId, String buttonImageSrc, String buttonSoundSrc, List<Rating> ratings) {
        this.buttonId = buttonId;
        this.buttonImageSrc = buttonImageSrc;
        this.buttonSoundSrc = buttonSoundSrc;
        this.ratings = ratings;
    }

    public int getButtonId() {
        return buttonId;
    }

    public void setButtonId(int button_id) {
        this.buttonId = button_id;
    }

    public String getButtonImageSrc() {
        return buttonImageSrc;
    }

    public void setButtonImageSrc(String buttonImageSrc) {
        this.buttonImageSrc = buttonImageSrc;
    }

    public String getButtonSoundSrc() {
        return buttonSoundSrc;
    }

    public void setButtonSoundSrc(String buttonSoundSrc) {
        this.buttonSoundSrc = buttonSoundSrc;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }
}