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
//-----------------------------------------------------------------------------------------------------
        Customer customer2 = new Customer("Jules", 65, "Glasgow");
        customerRepository.save(customer2);

        Course course2 = new Course("Advanced Ruby", "Edinburgh", 2);
        courseRepository.save(course2);

        Booking booking2 = new Booking("07-12-19", course2, customer2);
        bookingRepository.save(booking2);
//-----------------------------------------------------------------------------------------------------
        Customer customer3 = new Customer("Conchita", 15, "Bogota");
        customerRepository.save(customer3);

        Course course3 = new Course("Advanced Agile", "Edinburgh", 3);
        courseRepository.save(course3);

        Booking booking3 = new Booking("03-12-19", course3, customer3);
        bookingRepository.save(booking3);
//-----------------------------------------------------------------------------------------------------
        Customer customer4 = new Customer("Mohammed", 46, "Algiers");
        customerRepository.save(customer4);

        Course course4 = new Course("Advanced Sinatra", "Edinburgh", 3);
        courseRepository.save(course4);

        Booking booking4 = new Booking("01-12-19", course4, customer4);
        bookingRepository.save(booking4);

    }
}
