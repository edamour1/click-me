package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Entity
@Table(name="phrases")
public class Phrases {

    @Id
    @Column(name="phrase_id")
    private int phraseId;

    @Column(name="phrase")
    private String phrase;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "button_id", referencedColumnName = "button_id")
    @JsonIgnore
    private JokesButton button;

    public Phrases(){}

    public Phrases(int phraseId, String phrase, JokesButton button) {
        this.phraseId = phraseId;
        this.phrase = phrase;
        this.button = button;
    }

    public int getPhraseId() {
        return phraseId;
    }

    public void setPhraseId(int phraseId) {
        this.phraseId = phraseId;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public JokesButton getButton() {
        return button;
    }

    public void setButton(JokesButton button) {
        this.button = button;
    }
}
