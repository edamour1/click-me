package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name="buttons")
public class ButtonOfType {

    @Id
    @Column(name="button_id")
    private int buttonId;

    @Column(name="button_image_src")
    private String buttonImageSrc;

    @Column(name="button_sound_src")
    private String buttonSoundSrc;

    @Column(name="button_name")
    private String buttonName;

    @Column(name = "button_type_id", insertable = false, updatable = false)
    private int typeId;

    @ManyToOne
    @JoinColumn(name = "button_type_id")
    @JsonIgnore
    private ButtonType type;

    public ButtonOfType(){}

    public ButtonOfType(int buttonId, String buttonImageSrc, String buttonSoundSrc, String buttonName, ButtonType type) {
        this.buttonId = buttonId;
        this.buttonImageSrc = buttonImageSrc;
        this.buttonSoundSrc = buttonSoundSrc;
        this.typeId = this.type.getButtonTypeId();
        this.type = type;
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

    public String getButtonName() {
        return buttonName;
    }

    public void setButtonName(String buttonName) {
        this.buttonName = buttonName;
    }

    public ButtonType getType() {
        return type;
    }

    public void setType(ButtonType type) {
        this.type = type;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
