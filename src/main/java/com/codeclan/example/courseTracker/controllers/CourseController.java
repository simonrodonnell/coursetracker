package com.codeclan.example.courseTracker.controllers;

import com.codeclan.example.courseTracker.repositories.bookingrepository.BookingRepository;
import com.codeclan.example.courseTracker.repositories.courserepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

}
