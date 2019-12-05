package com.codeclan.example.courseTracker.repositories.customerrepository;

import com.codeclan.example.courseTracker.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
}
