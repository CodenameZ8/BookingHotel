package com.example.bookinghotel.repository;


import com.example.bookinghotel.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends MongoRepository<User,String> {

}
