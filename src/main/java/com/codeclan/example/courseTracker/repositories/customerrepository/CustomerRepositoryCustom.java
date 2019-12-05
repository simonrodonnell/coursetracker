package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> findAllCustomersByName(String name);
    List<Customer> findAllCustomersByCourseId(Long course_id);
    List<Customer> findAllCustomersByCourseAndTown(Long course_id, String town);
    List<Customer> findAllCustomersByCourseAndTownAndAge(Long course_id, String town, int age);
}
