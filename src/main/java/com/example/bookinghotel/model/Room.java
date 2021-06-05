package com.example.bookinghotel.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;


@Getter@Setter@ToString
public class Room {
    @Id
    private String id;
    private String type;
    private String numberOfBed;
    private Booking booking;
    private Double cost;
    private Integer numberAdults;
}
