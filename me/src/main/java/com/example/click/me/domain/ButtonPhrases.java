package com.example.click.me.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "buttons")
public class ButtonPhrases {
    @Id
    @Column(name="button_id")
    private int button_id;

    @Column(name="button_image_src")
    private String buttonImageSrc;

    @Column(name="button_sound_src")
    private String buttonSoundSrc;

    @Column(name="BUTTON_TYPE_ID")
    int buttonTypeId;

    @Column(name="BUTTON_NAME")
    String buttonName;

//    @OneToMany(mappedBy = "buttonPhrases")
//    private List<Phrases> phrases;

    public ButtonPhrases(){}

    public ButtonPhrases(int button_id, String buttonImageSrc, String buttonSoundSrc, int buttonTypeId, String buttonName ,List<Phrases> phrases) {
        this.button_id = button_id;
        this.buttonImageSrc = buttonImageSrc;
        this.buttonSoundSrc = buttonSoundSrc;
        this.buttonTypeId = buttonTypeId;
        this.buttonName = buttonName;
       // this.phrases = phrases;
    }

    public int getButton_id() {
        return button_id;
    }

    public void setButton_id(int button_id) {
        this.button_id = button_id;
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

    public int getButtonTypeId() {
        return buttonTypeId;
    }

    public void setButtonTypeId(int buttonTypeId) {
        this.buttonTypeId = buttonTypeId;
    }

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

//    public List<Phrases> getPhrases() {
//        return phrases;
//    }
//
//    public void setPhrases(List<Phrases> phrases) {
//        this.phrases = phrases;
//    }
}
