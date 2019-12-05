package com.codeclan.example.courseTracker;

import com.codeclan.example.courseTracker.models.Booking;
import com.codeclan.example.courseTracker.models.Course;
import com.codeclan.example.courseTracker.models.Customer;
import com.codeclan.example.courseTracker.repositories.bookingrepository.BookingRepository;
import com.codeclan.example.courseTracker.repositories.courserepository.CourseRepository;
import com.codeclan.example.courseTracker.repositories.customerrepository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
class CourseTrackerApplicationTests {

	@Autowired
	BookingRepository bookingRepository;

	@Autowired
	CourseRepository courseRepository;

	@Autowired
	CustomerRepository customerRepository;

	@Test
	void contextLoads() {
	}


	@Test
	public void canFindCustomersByName(){
		List<Customer> foundCustomers = customerRepository.findAllCustomersByName("Bob");
		assertEquals("Bob", foundCustomers.get(0).getName());
	}

	@Test
	public void canFindCustomersByCourseId(){
		List<Customer> foundCustomers = customerRepository.findAllCustomersByCourseId(1L);
		assertEquals("Bob", foundCustomers.get(0).getName());
	}

	@Test
	public void canFindCourseByCustomerId(){
		List<Course> foundCourses = courseRepository.findCourseByCustomer(1L);
		assertEquals("Advanced GitHub", foundCourses.get(0).getName());
	}

	@Test
	public void canFindBookingsByDate(){
		List<Booking> foundBookings = bookingRepository.getBookingsByDate("05-12-19");
		assertEquals(1, foundBookings.size());
	}

	@Test
	public void canFindAllCustomersByCourseAndTown(){
		List<Customer> foundCustomers = customerRepository.findAllCustomersByCourseAndTown(1L, "Edinburgh");
		assertEquals(1, foundCustomers.size());
	}

	@Test
	public void canFindAllCustomersByCourseAndTownAndAge_1(){
		List<Customer> foundCustomers = customerRepository.findAllCustomersByCourseAndTownAndAge(1L, "Edinburgh", 20);
		assertEquals(1, foundCustomers.size());
	}
	@Test
	public void canFindAllCustomersByCourseAndTownAndAge_0(){
		List<Customer> foundCustomers = customerRepository.findAllCustomersByCourseAndTownAndAge(1L, "Edinburgh", 30);
		assertEquals(0, foundCustomers.size());
	}


}
