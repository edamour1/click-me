package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="bad_jokes")
public class BadJoke {

    @Id
    @Column(name="BAD_JOKE_ID")
    int badJokeId;

    @Column(name="BAD_JOKE_QUESTION")
    String badJokeQuestion;

    @Column(name="BAD_JOKE_ANSWER")
    String badJokeAnswer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "button_id", referencedColumnName = "button_id")
    @JsonIgnore
    JokesButton jokesButton;

    public BadJoke(){}

    public BadJoke(int badJokeId, String badJokeQuestion, String badJokeAnswer, JokesButton jokesButton) {
        this.badJokeId = badJokeId;
        this.badJokeQuestion = badJokeQuestion;
        this.badJokeAnswer = badJokeAnswer;
        this.jokesButton = jokesButton;
    }

    public int getBadJokeId() {
        return badJokeId;
    }

    public void setBadJokeId(int badJokeId) {
        this.badJokeId = badJokeId;
    }

    public String getBadJokeQuestion() {
        return badJokeQuestion;
    }

    public void setBadJokeQuestion(String badJokeQuestion) {
        this.badJokeQuestion = badJokeQuestion;
    }

    public String getBadJokeAnswer() {
        return badJokeAnswer;
    }

    public void setBadJokeAnswer(String badJokeAnswer) {
        this.badJokeAnswer = badJokeAnswer;
    }

    public JokesButton getJokesButton() {
        return jokesButton;
    }

    public void setJokesButton(JokesButton jokesButton) {
        this.jokesButton = jokesButton;
    }
}
