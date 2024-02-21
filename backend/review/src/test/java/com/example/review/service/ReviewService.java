package com.example.review.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review.model.Review;
import com.example.review.repository.ReviewRepo;

@Service
public class ReviewService {
   @Autowired
   ReviewRepo repo;

   public ReviewService() {
   }

   public Review create(Review j) {
      return (Review)this.repo.save(j);
   }

   public Review find(int id) {
      return (Review)this.repo.findById(id).orElse(null);
   }

   public List<Review> findA() {
      return this.repo.findAll();
   }

   public Review update(int id, Review j) {
      Review p1 = (Review)this.repo.findById(id).orElse(null);
      if (p1 != null) {
         p1.setPincode(j.getPincode());
         this.repo.save(p1);
         return p1;
      } else {
         return j;
      }
   }

   public void delete(int id) {
      this.repo.deleteById(id);
   }
}
