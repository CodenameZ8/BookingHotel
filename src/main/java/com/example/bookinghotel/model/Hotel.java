package com.example.bookinghotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import java.util.List;

@TypeAlias("hotel")
@Component
@Getter@Setter@ToString
@Document("hotel")
public class Hotel {
    @Id
    private ObjectId id;
    private String name;
    private String summary;
    private String description;
    private String City;
    private String address;
    private Coordinate coordinate;
    private List<Room> room;
    private String rating;
    private List<String> amenities;
}
