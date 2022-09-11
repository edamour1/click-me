package com.example.click.me.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="buttons")
public class JokesButton {
    @Id
    @Column(name="button_id")
    private int buttonId;

    @Column(name="button_image_src")
    private String buttonImageSrc;

    @Column(name="button_sound_src")
    private String buttonSoundSrc;

    @OneToMany(mappedBy = "button")
    List<Phrases>  phrases;

    @OneToMany(mappedBy="jokesButton")
    List<ShortJoke> shortJokeList;

    @OneToMany(mappedBy="jokesButton")
    List<YoMommaJoke> yoMommaJokeList;

    @OneToMany(mappedBy="jokesButton")
    List<BadJoke> badJokeList;

    public JokesButton(){}

    public JokesButton(int buttonId, String buttonImageSrc, String buttonSoundSrc,List<Phrases>  phrases, List<ShortJoke> shortJokeList, List<YoMommaJoke> yoMommaJokeList, List<BadJoke> badJokeList) {
        this.buttonId = buttonId;
        this.buttonImageSrc = buttonImageSrc;
        this.buttonSoundSrc = buttonSoundSrc;
        this.phrases = phrases;
        this.shortJokeList = shortJokeList;
        this.yoMommaJokeList = yoMommaJokeList;
        this.badJokeList = badJokeList;
    }

    public int getButtonId() {
        return buttonId;
    }

    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
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

    public List<Phrases> getPhrases() {
        return phrases;
    }

    public void setPhrases(List<Phrases> phrases) {
        this.phrases = phrases;
    }

    public List<ShortJoke> getShortJokeList() {
        return shortJokeList;
    }

    public void setShortJokeList(List<ShortJoke> shortJokeList) {
        this.shortJokeList = shortJokeList;
    }

    public List<YoMommaJoke> getYoMommaJokeList() {
        return yoMommaJokeList;
    }

    public void setYoMommaJokeList(List<YoMommaJoke> yoMommaJokeList) {
        this.yoMommaJokeList = yoMommaJokeList;
    }

    public List<BadJoke> getBadJokeList() {
        return badJokeList;
    }

    public void setBadJokeList(List<BadJoke> badJokeList) {
        this.badJokeList = badJokeList;
    }
}
