package com.nazeem.flight.booking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name ="PASSENGER_INFO")
public class PassengerInfo {
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private String source;
    private String destination;
    @JsonFormat( shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date travelDate;

    private String pickupTime;
    private String arrivalTime;
    private Double fare;
}
