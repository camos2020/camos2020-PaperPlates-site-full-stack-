package org.wecancodeit.review.repositories;

import org.springframework.data.repository.CrudRepository;
import org.wecancodeit.review.models.Category;

import java.util.List;

public interface CategoryRepository extends CrudRepository <Category, Long>{
    List<Object> findAll(String category);

//    List<Review> findByReviewTitle (String reviewTitle);
//    List<Review> findByReviewCategory (String reviewCategory);
//    List<Review> findByReviewRating (String reviewRating);
//    List<Review> findByReviewContent(String reviewContent);
//    List<Review> findByDate (String reviewDate);
//    List<Review> findByPics (String reviewPics);
//
//    Review findById(int id);

}
