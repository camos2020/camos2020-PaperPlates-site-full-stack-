//package org.wecancodeit.review;
//
//import org.junit.jupiter.api.Test;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.mockito.Mock;
//
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.Arrays;
//import java.util.Collection;
//
//@WebMvcTest(ReviewsController.class)
//public class ReviewControllerMvcTest {
//
//        @Autowired
//        private MockMvc mockMvc;
//
//        @MockBean
//        private PlateInfoRepository reviewRepo;
//
//        @Mock
//        private Review reviewOne;
//
//        @Mock
//        private Review reviewTwo;
//
//        @Mock
//        private Review reviewThree;
//
//        @Test
//        public void shouldFindAllReviewsInTheReviewsTemplate() throws Exception{
//            mockMvc.perform(get("/reviews")).andExpect(status().isOk())
//                    .andExpect(view().name("reviewsTemplate"));
//        }
//
//        //Test #2 will not pass
//        @Test
//        public void shouldFindAllReviewsInModel() throws Exception{
//                Collection<Review> allReviewsInModel = Arrays.asList(reviewOne, reviewTwo, reviewThree);
//                when(reviewRepo.findAll()).thenReturn(allReviewsInModel);
//                mockMvc.perform(get("/reviews"))
//                        .andExpect(model().attribute("reviewsModel", allReviewsInModel));
//        }
//        @Test
//        public void shouldFindReviewOneInTheReviewTemplate() throws Exception{
//                int reviewId = 111;
//                when(reviewRepo.findOne(reviewId)).thenReturn(reviewOne);
//                mockMvc.perform(get("/review?reviewId=111"))
//                        .andExpect(model().attribute("reviewModel", reviewOne));
//        }

//        @Test
//        public void shouldBeOkForOneReviewInTheReviewTemplate() throws Exception{
//                int reviewId = 111;
//                when(reviewRepo.findOne(reviewId)).thenReturn(reviewOne);
//                mockMvc.perform(get("/review?reviewId= 111").andExpect(status().isOk())
//                        .andExpect(view().name("reviewTemplate")));
//        }

