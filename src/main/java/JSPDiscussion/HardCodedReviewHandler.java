/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSPDiscussion;

import JSPDiscussion.reviews.Review;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryce
 */
public class HardCodedReviewHandler implements ReviewDataHandler {
    @Override
    public List<Review> getReviews() {
        List<Review> reviews = new ArrayList<Review>();
        
        reviews.add(new Review("Bryce", "This is my test review", "2015-03-05")); 
        reviews.add(new Review("Candice", "Im gunna write this review", "2015-03-04")); 
        reviews.add(new Review("Josh", "Me too!  Here is my Review!", "2015-03-03"));

        return reviews;
       }
}
