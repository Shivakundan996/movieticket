package com.cgi.movieticket.repository;

import com.cgi.movieticket.entity.TicketInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketInfoRepo extends JpaRepository<TicketInfo,String> {
}
