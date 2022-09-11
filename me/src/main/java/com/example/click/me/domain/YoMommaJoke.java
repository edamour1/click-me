package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="yo_momma_jokes")
public class YoMommaJoke {

    @Id
    @Column(name="YO_MOMMA_JOKE_ID")
    int yoMommaJokeId;

    @Column(name="YO_MOMMA_JOKE_QUESTION")
    String yoMommaJokeQuestion;

    @Column(name="YO_MOMMA_JOKE_ANSWER")
    String yoMommaJokeAnswer;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "button_id", referencedColumnName = "button_id")
    @JsonIgnore
    JokesButton jokesButton;

    public YoMommaJoke(){}

    public YoMommaJoke(int yoMommaJokeId, String yoMommaJokeQuestion, String yoMommaJokeAnswer, JokesButton jokesButton) {
        this.yoMommaJokeId = yoMommaJokeId;
        this.yoMommaJokeQuestion = yoMommaJokeQuestion;
        this.yoMommaJokeAnswer = yoMommaJokeAnswer;
        this.jokesButton = jokesButton;
    }

    public int getYoMommaJokeId() {
        return yoMommaJokeId;
    }

    public void setYoMommaJokeId(int yoMommaJokeId) {
        this.yoMommaJokeId = yoMommaJokeId;
    }

    public String getYoMommaJokeQuestion() {
        return yoMommaJokeQuestion;
    }

    public void setYoMommaJokeQuestion(String yoMommaJokeQuestion) {
        this.yoMommaJokeQuestion = yoMommaJokeQuestion;
    }

    public String getYoMommaJokeAnswer() {
        return yoMommaJokeAnswer;
    }

    public void setYoMommaJokeAnswer(String yoMommaJokeAnswer) {
        this.yoMommaJokeAnswer = yoMommaJokeAnswer;
    }

    public JokesButton getJokesButton() {
        return jokesButton;
    }

    public void setJokesButton(JokesButton jokesButton) {
        this.jokesButton = jokesButton;
    }
}
