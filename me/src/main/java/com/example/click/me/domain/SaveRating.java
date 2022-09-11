package com.example.click.me.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ratings")
public class SaveRating {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="rating_id")
    private int ratingId;

    @Column(name="rating_value")
    private int ratingValue;

    @Column(name="rating_comment")
    private String ratingComment;

    @Column(name="rating_date")
    private Date ratingDate;

    @Column(name="BUTTON_ID")
    private int buttonId;

    SaveRating(){}

    public SaveRating(int ratingId, int ratingValue, String ratingComment, Date ratingDate, int buttonId) {
        this.ratingId = ratingId;
        this.ratingValue = ratingValue;
        this.ratingComment = ratingComment;
        this.ratingDate = ratingDate;
        this.buttonId = buttonId;
    }

    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRatingValue() {
        return ratingValue;
    }

    public void setRatingValue(int ratingValue) {
        this.ratingValue = ratingValue;
    }

    public String getRatingComment() {
        return ratingComment;
    }

    public void setRatingComment(String ratingComment) {
        this.ratingComment = ratingComment;
    }

    public Date getRatingDate() {
        return ratingDate;
    }

    public void setRatingDate(Date ratingDate) {
        this.ratingDate = ratingDate;
    }

    public int getButtonId() {
        return buttonId;
    }

    public void setButtonId(int buttonId) {
        this.buttonId = buttonId;
    }

    @Override
    public String toString() {
        return "SaveRating{" +
                "ratingId=" + ratingId +
                ", ratingValue=" + ratingValue +
                ", ratingComment='" + ratingComment + '\'' +
                ", ratingDate=" + ratingDate +
                ", buttonId=" + buttonId +
                '}';
    }
}
