package org.blackfriday.paymentservice.repository;

import org.blackfriday.paymentservice.entity.Payment;
import org.blackfriday.paymentservice.entity.PaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    PaymentMethod findByUserId();
}