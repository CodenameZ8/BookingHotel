package com.example.bookinghotel.service;

import com.example.bookinghotel.model.Review;
import com.example.bookinghotel.repository.ReviewRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public ResponseEntity<Review> getReviewApi(ObjectId id) {

        Optional<Review> opReview = reviewRepository.findById(id.toString());
        if(opReview.isPresent())
            return new ResponseEntity<>(opReview.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Review> updateReviewApi(Review review, ObjectId id) {
        Optional <Review> opReview=reviewRepository.findById(id.toString());
        if(opReview.isPresent()) {
            review.setId(id);
            return new ResponseEntity<>(reviewRepository.save(review), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
