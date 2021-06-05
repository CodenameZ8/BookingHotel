package com.example.bookinghotel;

import com.example.bookinghotel.repository.UserRepository;
import com.example.bookinghotel.model.User;
import com.example.bookinghotel.service.UserService;

import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private  UserService userService;

    @PostMapping
    public String saveUser(@RequestBody User user) {
        userRepository.insert(user);
        return user.getId()+" Added";
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable ObjectId id){
        return userService.getUserApi(id);

    }
    @GetMapping("/all")
    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable ObjectId id){
        userRepository.deleteById(id.toString());
        return id+"is Deleted";
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@RequestBody User user, @PathVariable ObjectId id)
    {
        return userService.updateUserApi(user,id);
    }

}