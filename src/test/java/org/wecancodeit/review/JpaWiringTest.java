package org.wecancodeit.review;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wecancodeit.review.models.Category;
import org.wecancodeit.review.models.PaperPlate;
import org.wecancodeit.review.models.Rating;
import org.wecancodeit.review.repositories.CategoryRepository;
import org.wecancodeit.review.repositories.PaperPlateRepository;
import org.wecancodeit.review.repositories.RatingRepository;

@DataJpaTest
public class JpaWiringTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CategoryRepository categoryRepo;

    @Autowired
    private PaperPlateRepository paperPlateRepo;

    @Autowired
    private RatingRepository ratingRepo;



    PaperPlate glad = new PaperPlate("Glad", "Glad Square Disposable Paper Plates 8 1/2 plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Fair", "10/02/2020", "/Glad.png");
    PaperPlate hefty = new PaperPlate("Hefty", "Hefty plates have no design and are very durable but, shelf life is long, some experts say up to 500 years.", "Soak Proof", "Poor", "10/17/2020", "/Hefty-Foam.png" );
    PaperPlate dixie = new PaperPlate("Dixie", "DIXIE® EVERYDAY 8 1/2 plate has a pretty design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Good", "10/01/2020","/Dixie.png" );
    PaperPlate s_y_h = new PaperPlate("Stock Your Home", "Stock Your Home 9-Inch Paper Plates are thin and soak easily.  These plates are very economical and can be purchased in a packet with plastic plate holders which provide a little more support for heavier foods.", "UN-Coated", "Poor", "10/17/2020", "/StockYourHome.png");
    PaperPlate compostable = new PaperPlate("Compostable Paper","Compostable Paper Plates 9 inch plates are easily compostable but hav no design pattern and can get soggy.", "UN-Coated", "Very Good", "10/03/2020", "/Compostable.png");



    @Test
    public void paperPlateCategoryShouldHaveAListOfAllSoakProofPaperPlates() {
        Category soakProof = new Category("Soak Proof");
        Category uncoated = new Category("UN-Coated");

        Rating fair = new Rating("Fair");
        Rating poor = new Rating("Poor");
        Rating good = new Rating("Good");
        Rating veryGood = new Rating("Very Good");



        categoryRepo.save(soakProof);
        categoryRepo.save(uncoated);

        paperPlateRepo.save(glad);
        paperPlateRepo.save(hefty);
        paperPlateRepo.save(dixie);
        paperPlateRepo.save(s_y_h);
        paperPlateRepo.save(compostable);

        ratingRepo.save(fair);
        ratingRepo.save(poor);
        ratingRepo.save(good);
        ratingRepo.save(veryGood);

        entityManager.flush();
        entityManager.clear();

        Optional<Category> retrievedCategoryOptional = categoryRepo.findById(soakProof.getId());
        Category retrievedCategory = retrievedCategoryOptional.get();
//        Optional<PaperPlate> retrievedPaperPlateOptional = paperPlateRepo.findById(glad.getId());
//        PaperPlate retrievedPaperPlate = retrievedPaperPlateOptional.get();
        assertThat(retrievedCategory.getPaperPlates()).contains(glad,hefty,dixie);
    }

    @Test
    public void paperPlateRatingShouldHaveAListOfAllPaperPlates() {
        Rating good = new Rating("Good");

        Category soakProof = new Category("Soak Proof");
        Category uncoated = new Category("UN-Coated");

        Rating fair = new Rating("Fair");
        Rating poor = new Rating("Poor");
        Rating veryGood = new Rating("Very Good");

        categoryRepo.save(soakProof);
        categoryRepo.save(uncoated);
        paperPlateRepo.save(glad);
        paperPlateRepo.save(hefty);
        paperPlateRepo.save(dixie);
        paperPlateRepo.save(s_y_h);
        paperPlateRepo.save(compostable);
        ratingRepo.save(fair);
        ratingRepo.save(poor);
        ratingRepo.save(good);
        ratingRepo.save(veryGood);

        entityManager.flush();
        entityManager.clear();

        Rating retrievedRating = ratingRepo.findAll(good.getRating()).get();
        Category retrieveUncoated = categoryRepo.findAll(uncoated.getCategory()).get();
        assertThat(retrievedRating.getPaperPlates()).contains(dixie);
    }

}
