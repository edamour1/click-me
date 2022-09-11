package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="button_types")
public class ButtonType {


    @Id
    @Column(name="button_type_id")
    private int buttonTypeId;

    @Column(name="button_type")
    private String buttonType;

    @OneToMany(mappedBy="type", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ButtonOfType> buttonOfTypes;

    public ButtonType(){}

    public ButtonType(int buttonTypeId, String buttonType, List<ButtonOfType> buttonOfTypes) {
        this.buttonTypeId = buttonTypeId;
        this.buttonType = buttonType;
        this.buttonOfTypes = buttonOfTypes;
    }

    public int getButtonTypeId() {
        return buttonTypeId;
    }

    public void setButtonTypeId(int buttonTypeId) {
        this.buttonTypeId = buttonTypeId;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }

    public List<ButtonOfType> getButtonOfTypes() {
        return buttonOfTypes;
    }

    public void setButtonOfTypes(List<ButtonOfType> buttonOfTypes) {
        this.buttonOfTypes = buttonOfTypes;
    }
}
