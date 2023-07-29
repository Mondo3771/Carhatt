package com.example.carhatt.adapters;

import androidx.recyclerview.widget.RecyclerView;

import com.example.carhatt.interfaces.BookingsListener;
import com.example.carhatt.models.Booking;

import java.util.ArrayList;

public class BookingsAdapter extends RecyclerView<BookingsAdapter.BookingsViewHolder> {

    private final ArrayList<Booking> bookings;//was List<User> users;
    private final BookingsListener bookingsLisetner;

    public BookingAdapter(ArrayList<Booking> bookings, bookingsLisetner bookingsLisetner) {
        this.bookings = bookings;
        this.userListener = userListener;
    }

}
