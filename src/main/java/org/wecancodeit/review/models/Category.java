package org.wecancodeit.review.models;

import java.util.Collection;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Category {

    @Id
    @GeneratedValue
    private Long id;
    private String category;
    private String plateBrand;
    private String reviewRating;
    private String reviewDescription;
    private String reviewDate;
    private String reviewPics;

    @OneToMany(mappedBy = "category")
    private Collection<PaperPlate> paperPlates;
    public Collection<PaperPlate> getPaperPlates() {
        return paperPlates;
    }


    public Category(String plateBrand, String reviewDescription, String category, String reviewRating, String reviewDate, String reviewPics) {
        this.plateBrand = plateBrand;
        this.reviewDescription = reviewDescription;
        this.category = category;
        this.reviewRating = reviewRating;
        this.reviewDate =   reviewDate;
        this.reviewPics = reviewPics;
        //this.category = new ArrayList<>(Arrays.asList(categories));
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;

    }

    public Category(String category) {
        this.category = category;
    }

    protected Category() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);

    }
}
