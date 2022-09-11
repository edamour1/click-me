package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="short_jokes")
public class ShortJoke {

    @Id
    @Column(name="SHORT_JOKE_ID")
    int shortJokeId;

    @Column(name="SHORT_JOKE_QUESTION")
    String shortJokeQuestion;

    @Column(name="SHORT_JOKE_ANSWER")
    String shortJokeAnswer;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "button_id", referencedColumnName = "button_id")
    @JsonIgnore
    JokesButton jokesButton;

    public ShortJoke(){}

    public ShortJoke(int shortJokeId, String shortJokeQuestion, String shortJokeAnswer, JokesButton jokesButton) {
        this.shortJokeId = shortJokeId;
        this.shortJokeQuestion = shortJokeQuestion;
        this.shortJokeAnswer = shortJokeAnswer;
        this.jokesButton = jokesButton;
    }

    public int getShortJokeId() {
        return shortJokeId;
    }

    public void setShortJokeId(int shortJokeId) {
        this.shortJokeId = shortJokeId;
    }

    public String getShortJokeQuestion() {
        return shortJokeQuestion;
    }

    public void setShortJokeQuestion(String shortJokeQuestion) {
        this.shortJokeQuestion = shortJokeQuestion;
    }

    public String getShortJokeAnswer() {
        return shortJokeAnswer;
    }

    public void setShortJokeAnswer(String shortJokeAnswer) {
        this.shortJokeAnswer = shortJokeAnswer;
    }

    public JokesButton getJokesButton() {
        return jokesButton;
    }

    public void setJokesButton(JokesButton jokesButton) {
        this.jokesButton = jokesButton;
    }
}
