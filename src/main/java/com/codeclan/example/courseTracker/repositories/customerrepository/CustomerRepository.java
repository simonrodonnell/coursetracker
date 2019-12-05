package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    List<Customer> findAllCustomersByName(String name);
//    CUSTOM QUERY
    List<Customer> findAllCustomersByCourseId(Long course_id);

    List<Customer> findAllCustomersByCourseAndTown(Long course_id, String town);

    List<Customer> findAllCustomersByCourseAndTownAndAge(Long course_id, String town, int age);

}
