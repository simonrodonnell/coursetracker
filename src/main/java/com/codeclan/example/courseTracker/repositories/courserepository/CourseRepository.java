package com.codeclan.example.courseTracker.repositories.courserepository;

import com.codeclan.example.courseTracker.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
}
