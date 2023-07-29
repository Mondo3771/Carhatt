package com.example.carhatt.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.carhatt.R;
import com.example.carhatt.databinding.ActivityBookingBinding;
import com.example.carhatt.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

   public void doSomething (View v){
       System.out.println("Hi");
       Intent intent = new Intent(getApplicationContext(), BookingPage.class);
       startActivity(intent);
   }

   public void Login (View v){
       Intent intent = new Intent(getApplicationContext(), userHome.class);
       startActivity(intent);
   }
}