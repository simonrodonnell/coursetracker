package com.codeclan.example.courseTracker.controllers;

import com.codeclan.example.courseTracker.repositories.bookingrepository.BookingRepository;
import com.codeclan.example.courseTracker.repositories.customerrepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @Autowired
    BookingRepository bookingRepository;
}
