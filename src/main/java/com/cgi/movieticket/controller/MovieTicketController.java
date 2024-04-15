package com.cgi.movieticket.controller;


import com.cgi.movieticket.dto.MovieTicketAcknowledgement;
import com.cgi.movieticket.dto.MovieTicketRequest;
import com.cgi.movieticket.service.MovieTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieTicketController {

    @Autowired
    MovieTicketService service;

    @PostMapping("/bookMovieTicket")
    public MovieTicketAcknowledgement bookTicket(@RequestBody MovieTicketRequest request){
        return service.bookMovieTicket(request);
    }


}
