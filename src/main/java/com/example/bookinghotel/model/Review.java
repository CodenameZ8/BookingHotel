package com.example.bookinghotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@TypeAlias("review")
@Getter@Setter@ToString
@Document(collection="review")
public class Review {
    @Id
    private ObjectId id;
    @BsonProperty(value = "user_id")
    private ObjectId userId;
    @BsonProperty(value = "hotel_id")
    private ObjectId hotelId;
    private String userName;
    private String review;
    private List<Comments> comments;
    private int rating;

}
