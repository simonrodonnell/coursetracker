package com.codeclan.example.courseTracker.repositories.courserepository;

import com.codeclan.example.courseTracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {

    //DERIVED QUERY
    List<Course> findCoursesByRating(int rating);

}
