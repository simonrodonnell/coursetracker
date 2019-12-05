package com.codeclan.example.courseTracker.repositories.bookingrepository;

import com.codeclan.example.courseTracker.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long>, BookingRepositoryCustom {

    // DERIVED QUERY
    List<Booking> getBookingsByDate(String date);

}
