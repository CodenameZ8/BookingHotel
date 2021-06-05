package com.example.bookinghotel.repository;

import com.example.bookinghotel.model.Review;
import com.example.bookinghotel.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review,String> {

}
