/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSPDiscussion;

import JSPDiscussion.reviews.Review;
import com.google.common.collect.Lists;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bryce
 */
public class FileReviewHandler implements ReviewDataHandler {
    
     private String fileName;

     public FileReviewHandler(String fileName) {
          this.fileName = fileName;
     }

     public String getFileName() {
          return fileName;
     }

     public void setFileName(String fileName) {
          this.fileName = fileName;
     }
 
     public void addReview(Review review) {
          try {
               BufferedWriter writer = new BufferedWriter(new FileWriter(getFileName(), true));
               writer.write(review.toFileString() + "\n");
               writer.close(); 

          } catch (IOException e) {
               e.printStackTrace();
          }
     }

     @Override
     public List<Review> getReviews() {
        List<Review> list = new ArrayList<Review>();

        try {
             BufferedReader reader = new BufferedReader(new FileReader(getFileName()));

             String line;

             while ((line = reader.readLine()) != null) {
                  Review review = new Review();
                  review.loadFromFileString(line);
                  list.add(review);
             }

        } catch (IOException e) {
             e.printStackTrace();
        }
        //return reversed list
        List<Review> reverseView = Lists.reverse(list);
        return reverseView;
        
        //return normal list
//        return list;
    }
}
