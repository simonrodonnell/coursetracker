package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findAllCustomersByCourseId(Long course_id);

}
