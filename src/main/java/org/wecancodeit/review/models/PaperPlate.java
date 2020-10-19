package org.wecancodeit.review.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;


@Entity
public class PaperPlate {
    @Id
    @GeneratedValue
    private Long id;
    private String plateBrand;
    private String reviewDescription;
    private String reviewRating;
    private String reviewDate;
    private String reviewPics;

    @ManyToOne
    private Category category;

    @OneToMany
    private Collection<PaperPlate> paperPlates;


    public Collection<PaperPlate> getPaperPlates() {
        return paperPlates;
    }


    public PaperPlate(String plateBrand, String reviewDescription, String category, String reviewRating, String reviewDate, String reviewPics) {
    }

    private String getPlateBrand() {
        return plateBrand;
    }

    private String getReviewDescription() {
        return reviewDescription;
    }

    private Category getCategory() {
        return category;
    }

    private String getReviewRating() { return reviewRating; }

    private String getReviewDate() { return reviewDate; }

    private String getReviewPics() { return reviewPics; }
    public Long getId() {
        return id;
    }

    protected PaperPlate() {
    }

    public PaperPlate(String plateBrand, String reviewDescription, Category category, String reviewRating, String reviewDate, String reviewPics ) {
        this.plateBrand = plateBrand;
        this.reviewDescription = reviewDescription;
        this.category = category;
        this.reviewRating = reviewRating;
        this.reviewDate =   reviewDate;
        this.reviewPics = reviewPics;
        this.reviewRating = new ArrayList<>(Arrays.asList(paperPlates));


        }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PaperPlate paperPlate = (PaperPlate) o;
        return Objects.equals(id, paperPlate.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}