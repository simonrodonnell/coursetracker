package com.codeclan.example.courseTracker.repositories.bookingrepository;

import com.codeclan.example.courseTracker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {
}
