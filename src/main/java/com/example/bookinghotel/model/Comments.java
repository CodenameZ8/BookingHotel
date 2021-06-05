package com.example.bookinghotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.TypeAlias;

import java.util.Date;

@TypeAlias("comments")
@Getter
@Setter
@ToString
public class Comments {
    private ObjectId id;
    @BsonProperty(value = "user_id")
    private ObjectId userId;
    private String comment;
    private Integer upVote;
    private Date creationDate;
}
