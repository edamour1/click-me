package com.example.click.me.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ratings")
public class Rating {

    @Id
    @Column(name="rating_id")
    private int ratingId;

    @Column(name="rating_value")
    private int ratingValue;

    @Column(name="rating_comment")
    private String ratingComment;

    @Column(name="rating_date")
    private Date ratingDate;

    @JsonIgnore
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "button_id", referencedColumnName = "button_id")
    private Button button;

    public Rating() {}

    public Rating(int ratingId, int ratingValue, String ratingComment, Date ratingDate, Button button) {
        this.ratingId = ratingId;
        this.ratingValue = ratingValue;
        this.ratingComment = ratingComment;
        this.ratingDate = ratingDate;
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

    //    public Button getButtonId() {
//        return button;
//    }
//
//    public void setButtonId(Button button) {
//        this.button = button;
//    }
}
