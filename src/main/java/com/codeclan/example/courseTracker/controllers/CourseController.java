package com.codeclan.example.courseTracker.controllers;

import com.codeclan.example.courseTracker.models.Course;
import com.codeclan.example.courseTracker.repositories.bookingrepository.BookingRepository;
import com.codeclan.example.courseTracker.repositories.courserepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/rating/{rating}")
    public List<Course> findCoursesByRating(@PathVariable int rating){
    return courseRepository.findCoursesByRating(rating);
    }

}
