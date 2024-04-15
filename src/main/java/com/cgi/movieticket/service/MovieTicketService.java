package com.cgi.movieticket.service;

import com.cgi.movieticket.dto.MovieTicketAcknowledgement;
import com.cgi.movieticket.dto.MovieTicketRequest;
import com.cgi.movieticket.entity.PaymentInfo;
import com.cgi.movieticket.entity.TicketInfo;
import com.cgi.movieticket.repository.PaymentInfoRepo;
import com.cgi.movieticket.repository.TicketInfoRepo;
import com.cgi.movieticket.utility.ValidatePaymentInfo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class MovieTicketService {

    @Autowired
    TicketInfoRepo ticketInfoRepo;

    @Autowired
    PaymentInfoRepo paymentInfoRepo;

    @Transactional
    public MovieTicketAcknowledgement bookMovieTicket(MovieTicketRequest request) {
        TicketInfo ticketInfo = request.getTicketInfo();
        ticketInfo = ticketInfoRepo.save(ticketInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();
        ValidatePaymentInfo.validateCreditLimit(paymentInfo.getAccountNo(), ticketInfo.getTicketPrice());

        paymentInfo.setTicketId(ticketInfo.getId());
        paymentInfo.setAmount(ticketInfo.getTicketPrice());
        paymentInfoRepo.save(paymentInfo);
        return new MovieTicketAcknowledgement("SUCCESS",ticketInfo.getTicketPrice(), UUID.randomUUID().toString().split("-")[0],ticketInfo);
    }

}
