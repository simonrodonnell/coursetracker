package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {

    //CUSTOM QUERY
    List<Customer> findAllCustomersByCourseId(Long course_id);


}
