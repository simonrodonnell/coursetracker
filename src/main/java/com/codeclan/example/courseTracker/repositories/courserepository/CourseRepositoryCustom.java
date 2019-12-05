package com.codeclan.example.courseTracker.repositories.courserepository;

import com.codeclan.example.courseTracker.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> findCourseByCustomer(Long customerId);

}
