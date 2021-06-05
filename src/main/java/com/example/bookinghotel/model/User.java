package com.example.bookinghotel.model;

import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.context.annotation.Bean;
import org.springframework.data.annotation.Id;
import java.util.Date;
import lombok.Getter;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@TypeAlias("user")
@Getter@Setter@ToString
@Document(collection="user")
public class User {
    @Id
    private ObjectId id;
    private String firstName;
    private String lastName;
    private long phoneNumber;
    private String email;
    private String city;
    private Date dateOfBirth;
    private Date creationDate = new Date();

}
