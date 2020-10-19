package org.wecancodeit.review.models;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;




@Entity
public class Rating {
        @Id
        @GeneratedValue
        private Long id;
        private String reviewRating;
        private String plateBrand;
        private String category;
        private String reviewDescription;
        private String reviewDate;
        private String reviewPics;
        Object ratings;


        @OneToMany(mappedBy = "rating")
        private Collection<PaperPlate> paperPlates;
        public Collection<PaperPlate> getPaperPlates() {
        return paperPlates;
    }

        public Rating(String plateBrand, String reviewDescription, String category, String reviewRating, String reviewDate, String reviewPics) {
            this.plateBrand = plateBrand;
            this.category = category;
            this.reviewDescription = reviewDescription;
            this.reviewRating = reviewRating;
            this.reviewDate =   reviewDate;
            this.reviewPics = reviewPics;

            //this.reviewRating = new ArrayList<>(Arrays.asList(ratings));
        }

        public Long getId() {
            return id;
        }

        public String getReviewRating() {
            return reviewRating;

        }


        public Rating(String reviewRating) {
            this.reviewRating = reviewRating;
        }

        protected Rating() {
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Rating reviewRating = (Rating) o;
            return Objects.equals(id, reviewRating.id);
        }

        @Override
        public int hashCode() {
            return Objects.hash(id);

        }

    public Object getRating() {
            return reviewRating;
    }
}

