package com.example.bookinghotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Getter@Setter@ToString
public class Booking {
    @Id
    private ObjectId id;
    private Date startDate;
    private Date endDate;
    @BsonProperty(value="user_Id")
    private ObjectId userId;

}
