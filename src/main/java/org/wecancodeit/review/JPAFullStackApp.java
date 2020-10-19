package org.wecancodeit.review;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.wecancodeit.review.models.PaperPlate;
import org.wecancodeit.review.repositories.CategoryRepository;
import org.wecancodeit.review.repositories.PaperPlateRepository;

import java.util.Properties;
import java.util.Scanner;




@SpringBootApplication
public class JPAFullStackApp {
    private static final Logger log = LoggerFactory.getLogger(JPAFullStackApp.class);
    private String repository;


    @Bean
    public CommandLineRunner demo(PaperPlateRepository) {
        return (args) -> {
            // save a few paper plates.

            PaperPlate glad = new PaperPlate("Glad", "Glad Square Disposable Paper Plates 8 1/2 plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Fair", "10/02/2020", "/Glad.png");
            PaperPlate hefty = new PaperPlate("Hefty", "Hefty plates have no design and are very durable but, shelf life is long, some experts say up to 500 years.", "Soak Proof", "Poor", "10/17/2020", "/Hefty-Foam.png" );
            PaperPlate dixie = new PaperPlate("Dixie", "DIXIE® EVERYDAY 8 1/2 plate has a pretty design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Good", "10/01/2020","/Dixie.png" );
            PaperPlate s_y_h = new PaperPlate("Stock Your Home", "Stock Your Home 9-Inch Paper Plates are thin and soak easily.  These plates are very economical and can be purchased in a packet with plastic plate holders which provide a little more support for heavier foods.", "UN-Coated", "Poor", "10/17/2020", "/StockYourHome.png");
            PaperPlate compostable = new PaperPlate("Compostable Paper","Compostable Paper Plates 9 inch plates are easily compostable but hav no design pattern and can get soggy.", "UN-Coated", "Very Good", "10/03/2020", "/Compostable.png");


            paperPlateRepo.save(new PaperPlate("Glad", "Glad Square Disposable Paper Plates 8 1/2 plate has square design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Fair", "10/02/2020", "/Glad.png");
            paperPlateRepo.save(new PaperPlate("Hefty", "Hefty plates have no design and are very durable but, shelf life is long, some experts say up to 500 years.", "Soak Proof", "Poor", "10/17/2020", "/Hefty-Foam.png" );
            paperPlateRepo.save(new PaperPlate("Dixie", "DIXIE® EVERYDAY 8 1/2 plate has a pretty design and is durable but shelf life is longer that that of the Compostable plates.", "Soak Proof", "Good", "10/01/2020","/Dixie.png" );
            paperPlateRepo.save(new PaperPlate("Stock Your Home", "Stock Your Home 9-Inch Paper Plates are thin and soak easily.  These plates are very economical and can be purchased in a packet with plastic plate holders which provide a little more support for heavier foods.", "UN-Coated", "Poor", "10/17/2020", "/StockYourHome.png");
            paperPlateRepo.save(new PaperPlate("Compostable Paper","Compostable Paper Plates 9 inch plates are easily compostable but hav no design pattern and can get soggy.", "UN-Coated", "Very Good", "10/03/2020", "/Compostable.png");



            // fetch all reviews
            log.info("Paper Plate Reviews found with findAll():");
            log.info("-------------------------------");
            //for (Class field : repository.findAll()){
            for (PaperPlate plateBrand : repository.findByAll()) {
            log.info(plateBrand.toString());
            };       log.info("");

            // fetch an individual review by ID
            log.info("Paper Plate Reviews found with findByCategory(Soak Proof):");
            log.info("--------------------------------");
            for (PaperPlate category: repository.findByCategory()) {
            log.info(category.toString());{
                    log.info("");
                };


            //fetch reviews by lTitle
           log.info("Customer found with findByTitle('Fair'):");
           log.info("--------------------------------------------");
           repository.findByReviewRating("Fair").forEach(rating -> {
               log.info(rating.toString());
               for (PaperPlate reviewRating : repository.findByReviewRating()) {
                   log.info(reviewRating.toString());
                   {
                       log.info("");
                   }
               }
          }
}