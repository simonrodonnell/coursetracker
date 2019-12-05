package com.codeclan.example.courseTracker.repositories.bookingrepository;

import com.codeclan.example.courseTracker.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getBookingsByDate(String date);

}
