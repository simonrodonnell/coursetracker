package com.codeclan.example.courseTracker.components;

import com.codeclan.example.courseTracker.models.Booking;
import com.codeclan.example.courseTracker.models.Course;
import com.codeclan.example.courseTracker.models.Customer;
import com.codeclan.example.courseTracker.repositories.bookingrepository.BookingRepository;
import com.codeclan.example.courseTracker.repositories.courserepository.CourseRepository;
import com.codeclan.example.courseTracker.repositories.customerrepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {

        Customer customer1 = new Customer("Bob", 25, "Edinburgh");
        customerRepository.save(customer1);

        Course course1 = new Course("Advanced GitHub", "Edinburgh", 1);
        courseRepository.save(course1);

        Booking booking1 = new Booking("05-12-19", course1, customer1);
        bookingRepository.save(booking1);

    }
}
