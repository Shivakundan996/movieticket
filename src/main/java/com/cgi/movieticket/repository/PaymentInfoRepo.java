package com.cgi.movieticket.repository;

import com.cgi.movieticket.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepo extends JpaRepository<PaymentInfo,Long> {

}
