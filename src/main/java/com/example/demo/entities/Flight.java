package com.example.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String from;
    private String to;
    private Date date;
   // @ManyToOne
    //@JoinColumn(name = "plane_id")
    //private Plane plane;

    public Flight() {}

    public Flight(String from, String to, Date date, Plane plane) {
        this.from = from;
        this.to = to;
        this.date = date;
        //this.plane = plane;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFrom(String from) {this.from = from;}

    public void setTo(String to) {this.to = to;}

    public void setDate(Date date) {this.date = date;}

   // public void setPlane(Plane plane) {this.plane = plane;}

    @Id
    public Long getId() {
        return id;
    }

    public String getFrom() {return from;}

    public String getTo() {return to;}

    public Date getDate() {return date;}

   // public Plane getPlane() {return plane;}

    @Override
    public String toString() {
        return "The flight " + id + " from " + from + " to " + to + " is planned to take of at " + date + " in plane " ;//+ plane.toString();
    }
}
