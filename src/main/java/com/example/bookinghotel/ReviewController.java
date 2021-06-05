package com.example.bookinghotel;

import com.example.bookinghotel.model.Review;
import com.example.bookinghotel.model.User;
import com.example.bookinghotel.repository.ReviewRepository;
import com.example.bookinghotel.service.ReviewService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/review")
public class ReviewController {
    @Autowired
    ReviewRepository reviewRepository;
    @Autowired
    ReviewService reviewService;
    @PostMapping
    public String saveReview(@RequestBody Review review) {
        reviewRepository.insert(review);
        return review.getId()+" Added";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Review> getReview(@PathVariable ObjectId id){
        return reviewService.getReviewApi(id);

    }
    @GetMapping("/all")
    public List<Review> getAllReview(){
        return reviewRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteReview(@PathVariable String id){
        reviewRepository.deleteById(id);
        return id+"is Deleted";
    }

    @PutMapping("/{id}")
    public ResponseEntity<Review> updateReview(@RequestBody Review review, @PathVariable ObjectId id)
    {
        return reviewService.updateReviewApi(review,id);
    }
}
