package com.example.carhatt.activities;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carhatt.adapters.BookingsAdapter;
import com.example.carhatt.databinding.ActivityBookingBinding;
import com.example.carhatt.models.Booking;

import android.os.Bundle;

import java.util.ArrayList;

public class BookingPage extends AppCompatActivity {
    private ActivityBookingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBookingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getBookings();
    }

    private void getBookings(){
        //given  a users ID num this should search through the bookings table and populate a bookings
        //array, create a bookingsAdapter based on the array and the set it to be the recylcerViews
        //adapter

        ArrayList<Booking> bookings = new ArrayList<>();
        Booking booking = new Booking();
        booking.date = "Today";
        booking.location = "MSL";
        booking.name = "Tapiwa";
        booking.type = "ID";
        booking.time = "23:36 PM";
        bookings.add(booking);
        bookings.add(booking);
        bookings.add(booking);
        bookings.add(booking);

        BookingsAdapter bookingsAdapter = new BookingsAdapter(bookings);
        binding.recyclerView.setAdapter(bookingsAdapter);

    }
}