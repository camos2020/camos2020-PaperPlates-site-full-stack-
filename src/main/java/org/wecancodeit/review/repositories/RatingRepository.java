package org.wecancodeit.review.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.review.models.Rating;

import java.util.List;

public interface RatingRepository extends CrudRepository<Rating, Long> {
    List<Rating> findAll(Object rating);
//    List<Review> findByReviewTitle (String reviewTitle);
//    List<Review> findByReviewCategory (String reviewCategory);
//    List<Review> findByReviewRating (String reviewRating);
//    List<Review> findByReviewContent(String reviewContent);
//    List<Review> findByDate (String reviewDate);
//    List<Review> findByPics (String reviewPics);
//
//    Review findById(int id);
}

