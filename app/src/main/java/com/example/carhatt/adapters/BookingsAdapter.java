package com.example.carhatt.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.carhatt.databinding.ItemContainerBookingBinding;

import com.example.carhatt.interfaces.BookingsListener;
import com.example.carhatt.models.Booking;

import java.util.ArrayList;

public class BookingsAdapter extends RecyclerView.Adapter<BookingsAdapter.BookingViewHolder> {

    private final ArrayList<Booking> bookings;//was List<User> users;
  //  private BookingsListener bookingsListener = null;
  public BookingsAdapter(ArrayList<Booking> bookings){
      this.bookings = bookings;
  }

    @NonNull
    @Override
    public BookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemContainerBookingBinding itemContainerBookingBinding = ItemContainerBookingBinding.inflate(
          LayoutInflater.from(parent.getContext()),
          parent,
          false
        );

        return new BookingViewHolder(itemContainerBookingBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull BookingViewHolder holder, int position) {
        holder.setBookingData(bookings.get(position));
    }

    @Override
    public int getItemCount() {
        return bookings.size();
    }

    class BookingViewHolder extends RecyclerView.ViewHolder{
        ItemContainerBookingBinding binding;

        BookingViewHolder(ItemContainerBookingBinding itemContainerBookingBinding) {
            super(itemContainerBookingBinding.getRoot());
            binding = itemContainerBookingBinding;
        }
        void setBookingData(Booking booking){
            binding.edtDate.setText("Date: " + booking.date);
            binding.edtLocation.setText("Location: " + booking.location);
            binding.edtName.setText("Name: " + booking.name);
            binding.edtTime.setText("Booking Time: " + booking.time);
            binding.edtType.setText("Booking Type: " + booking.type);
            binding.edtIDnum.setText("ID Number: " + booking.ID);
        }
    }



//    @NonNull
//    @Override
//    public BookingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        ItemContainerBookingBinding itemContainerBookingBinding = ItemContainerBookingBinding.inflate(
//                LayoutInflater.from(parent.getContext()),
//                parent,false
//        );
//
//        return new BookingViewHolder(itemContainerBookingBinding);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull BookingViewHolder holder, int position) {
//        holder.setBookingData(bookings.get(position));
//    }
//
//    @Override
//    public int getItemCount() {
//        return bookings.size();
//    }



}
