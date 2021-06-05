package com.example.bookinghotel.service;

import com.example.bookinghotel.model.User;
import com.example.bookinghotel.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<User> getUserApi(ObjectId id)
    {
        User user = null;

        Optional<User> opUser = userRepository.findById(id.toString());
        if(opUser.isPresent())
            return new ResponseEntity<>(opUser.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<User> updateUserApi(User user, ObjectId id) {
        Optional <User> opUser=userRepository.findById(id.toString());
        if(opUser.isPresent()) {
            user.setId(id);
            return new ResponseEntity<>(userRepository.save(user), HttpStatus.OK);
        }
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
