package org.wecancodeit.review;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

//public class PlateInfoRepositoryTest {
//    private PlateInfoRepository underTest;
//    private Review reviewOne = new Review(111, "DIXIE® EVERYDAY 8 1/2", "Soak Proof",
//            "Good", "Plate has pretty design and is durable but shelf life is longer that that of the Compostable plates.", "10/01/2020");
//    private Review reviewTwo = new Review(222, "Glad Square Disposable Paper Plates 8 1/2", "Soak Proof",
//            "Fair", "Plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "10/02/2020");
//    private Review reviewThree = new Review(333, "Compostable Paper Plates 9 inch", "NOT Soak Proof",
//            "Very Good", "Plate is easily compostable but has no  design pattern and can get soggy.","10/03/2020");
//
//
//    @Test
//    public void shouldFindReviewOne() {
//        underTest = new PlateInfoRepository(reviewOne);
//        Review foundReview = underTest.findOne(111);
//        assertEquals(reviewOne, foundReview);
//    }
//
//    @Test
//    public void shouldFindReviewOneAndReviewTwo() {
//        underTest = new PlateInfoRepository(reviewOne, reviewTwo);
//        Collection<Review> foundReviews = underTest.findAll();
//        assertThat(foundReviews).contains(reviewOne, reviewTwo);
//    }
//
//    @Test
//    public void shouldFindAllReviews() {
//        underTest = new PlateInfoRepository(reviewOne, reviewTwo, reviewThree);
//        Collection<Review> foundReviews = underTest.findAll();
//        assertThat(foundReviews).containsExactly(reviewOne, reviewTwo, reviewThree);
//        System.out.println();
//    }
//
//}
