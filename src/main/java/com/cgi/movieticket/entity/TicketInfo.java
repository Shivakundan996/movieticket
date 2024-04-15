package com.cgi.movieticket.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "TICKET_INFO")
public class TicketInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String movieName;
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Date movieDate;
    private String movieTime;
    private double ticketPrice;

    public TicketInfo(Long id, String name, String email,
                      String movieName, Date movieDate,
                      String movieTime, double ticketPrice) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.ticketPrice = ticketPrice;
    }

    public TicketInfo() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "TicketInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", movieName='" + movieName + '\'' +
                ", movieDate=" + movieDate +
                ", movieTime='" + movieTime + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
