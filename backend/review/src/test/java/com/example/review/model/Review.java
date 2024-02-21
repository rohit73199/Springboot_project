// Source code is decompiled from a .class file using FernFlower decompiler.
package com.example.review.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Review {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private String dogBreed;
   private int range;
   private int Pincode;

   Review() {
   }

public Review(String dogBreed, int range, int pincode) {
    this.dogBreed = dogBreed;
    this.range = range;
    Pincode = pincode;
}

public String getDogBreed() {
    return dogBreed;
}

public void setDogBreed(String dogBreed) {
    this.dogBreed = dogBreed;
}

public int getRange() {
    return range;
}

public void setRange(int range) {
    this.range = range;
}

public int getPincode() {
    return Pincode;
}

public void setPincode(int pincode) {
    Pincode = pincode;
}









   
}
