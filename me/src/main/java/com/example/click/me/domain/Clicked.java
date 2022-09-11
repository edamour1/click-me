package com.example.click.me.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CLICKED")
public class Clicked {

    @Id
    @Column(name="clicked_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int clickedId;

    @Column(name="clicked_total")
    private int clickedTotal;

    @Column(name="click_date")
    private Date clickDate;

    @Column(name="BUTTON_ID")
    private int buttonId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "USER__ID", referencedColumnName = "USER__ID")
    private User user;

    public Clicked(){}

    public Clicked(int clickedId, int clickedTotal, Date clickDate, int buttonId)
    {
        this.clickedId = clickedId;
        this.clickedTotal = clickedTotal;
        this.clickDate = clickDate;
        this.buttonId = buttonId;
    }

    public int getClickedId() {
        return clickedId;
    }

    public void setClickedId(int clickedId) {
        this.clickedId = clickedId;
    }

    public int getClickedTotal() {
        return clickedTotal;
    }

    public void setClickedTotal(int clickedTotal) {
        this.clickedTotal = clickedTotal;
    }

    public Date getClickDate() {
        return clickDate;
    }

    public void setClickDate(Date clickDate) {
        this.clickDate = clickDate;
    }

    public int getButtonId() {
        return buttonId;
    }

    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
    }

    @Override
    public String toString() {
        return "Clicked{" +
                "clickedId=" + clickedId +
                ", clickedTotal=" + clickedTotal +
                ", clickDate=" + clickDate +
                ", buttonId=" + buttonId +
                '}';
    }
}
